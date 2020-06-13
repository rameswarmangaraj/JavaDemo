package com.rt.competative;

import java.util.LinkedList;

public class ChainingDemo {
    public static void main(String[] args) {
        HashChaining hc=new HashChaining(7);
        hc.insert(24).insert(21).insert(83).insert(93).insert(40).insert(75).insert(28);
        hc.display();
        System.out.println(hc.search(86));
    }
}

class HashChaining {
    final int SIZE;
    LinkedList<Integer>[] table;

    HashChaining(int size) {
        SIZE = size;
        table = new LinkedList[SIZE];
        for (int i = 0; i < table.length; i++) {
            table[i] = new LinkedList<>();
        }
    }

    int has(int key) {
        return key % SIZE;
    }

    HashChaining insert(int key) {
        int h = has(key);
        table[h].add(key);
        return this;
    }

    void remove(int key) {
        int h = has(key);
        table[h].remove(key);
    }

    boolean search(int key) {
        int h = has(key);
        return table[h].contains(key);
    }
    void display(){
        System.out.println("---------Hash Table--------");
        for (int i = 0; i < table.length; i++) {
            System.out.println(i+"-----"+table[i].toString());
        }
    }
}