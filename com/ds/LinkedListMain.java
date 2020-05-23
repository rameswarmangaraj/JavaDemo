package com.ds;

public class LinkedListMain {
    public static void main(String[] args) {
        LinkedList list=new LinkedList();
        list.insertAtEnd(1);list.insertAtEnd(2);list.insertAtEnd(3);list.insertAtEnd(4);
        list.print();
        System.out.println();
        list.reverse();
        list.print();
        System.out.println();
        list.printRecur(list.head);
    }
}