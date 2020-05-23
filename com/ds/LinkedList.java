package com.ds;

public class LinkedList {
    Node head;

    void insertAtTop(int data) {
        Node temp = new Node();
        temp.data = data;
        temp.next = head;
        head = temp;
    }

    void insertAtEnd(int data) {
        Node temp = new Node();
        temp.data = data;
        temp.next = null;
        if (head == null) {
            head = temp;
        } else {
            Node t = head;
            while (t.next != null) {
                t = t.next;
            }
            t.next = temp;
        }
    }

    void reverse() {
        Node prev, current, next;
        prev = null;

        current = head;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;

        }
        head = prev;
    }

    void print() {
        Node n = head;
        while (n != null) {
            System.out.print(n.data + " ");
            n = n.next;
        }
    }

    public void printRecur(Node n) {
        if (n == null) {
           return;
        }
        printRecur(n.next);
        System.out.print(n.data + " ");
    }
}