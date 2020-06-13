package com.rt.hashing;

public class LinearProbing {
    public static void main(String[] args) {
        MyHash hs = new MyHash(5);
        hs.insert(48).insert(42).insert(50).insert(55).insert(53);
        hs.display();
        System.out.println(hs.search(53));
        hs.remove(42);
        hs.display();
    }
}

class MyHash {
    int[] table;
    int cap, size;

    MyHash(int c) {
        cap = c;
        table = new int[cap];
    }

    int hash(int key) {
        return key % cap;
    }

    MyHash insert(int key) {
        if (size < cap) {
            int h = hash(key);
            while (table[h] > 0 || table[h] == -1) {
                h = (h + 1) % cap;
            }
            table[h] = key;
            size++;
        }
        return this;
    }

    boolean search(int key) {
        boolean isFound = false;
        if (size == 0) {
            isFound = false;
            return isFound;
        }
        int h = hash(key);
        if (table[h] == key) {
            isFound = true;
            return isFound;
        }
        int i = (h + 1) % cap;
        while (table[i] != 0 && i != h) {
            if (table[i] == key) {
                isFound = true;
                break;
            }
            i = (i + 1) % cap;
        }
        return isFound;
    }

    void remove(int key) {
        if(size>0){
            int h=hash(key);
            
            if (table[h] == key) {
               table[h]=-1;
            }
            int i = (h + 1) % cap;
            while (table[i] != 0 && i != h) {
                if (table[i] == key) {
                    table[i]=-1;
                    break;
                }
                i = (i + 1) % cap;
            }
        }
    }

    void display() {
        System.out.println("---------Hash Table--------");
        for (int i = 0; i < table.length; i++) {
            System.out.println(i + "-----" + table[i]);
        }
    }
}
