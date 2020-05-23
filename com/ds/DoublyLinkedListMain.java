package com.ds;

public class DoublyLinkedListMain {
    public static void main(String[] args) {
        DoublyLinkedList list=new DoublyLinkedList();
        list.insertAtTop(1);  list.insertAtTop(2);  list.insertAtTop(3);  list.insertAtTop(4);
        list.reversePrint();
        System.out.println("end");
        DoublyLinkedList list1=new DoublyLinkedList();
        list1.insertAtEnd(5);list1.insertAtEnd(6);list1.insertAtEnd(7);list1.insertAtEnd(8);
       
        list1.reversePrint();
    }
}