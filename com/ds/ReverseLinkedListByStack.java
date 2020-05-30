package com.ds;

import java.util.LinkedList;
import java.util.Stack;

public class ReverseLinkedListByStack {
    public static void main(String[] args) {
        //byJavaLinkedList();
        com.ds.LinkedList ll=new com.ds.LinkedList();
        Stack<Node> sk=new Stack<>();
        ll.insertAtEnd(1);ll.insertAtEnd(2);ll.insertAtEnd(3);ll.insertAtEnd(4);
        ll.print();
        Node n=ll.head;
        while(n!=null){
            sk.push(n);
            n=n.next;
        }
        n=sk.peek();sk.pop();
        ll.head=n;
        while(!sk.isEmpty()){
            n.next=sk.peek();
            sk.pop();
            n=n.next;
        }
        n.next=null;
        System.out.println();
        ll.print();

    }

    private static void byJavaLinkedList() {
        LinkedList<Integer> ll = new LinkedList<>();
        ll.add(1);
        ll.add(2);
        ll.add(3);
        ll.add(4);
        System.out.println(ll.toString());
        LinkedList<Integer> rev = getReverseByStack(ll);
        System.out.println(rev.toString());
    }

    private static LinkedList<Integer> getReverseByStack(LinkedList<Integer> ll) {
        LinkedList<Integer> rev = new LinkedList<>();
        Stack<Integer> st = new Stack<>();
        for (Integer i : ll) {
            st.push(i);
        }
        while(!st.isEmpty()){
            rev.add(st.peek());
            st.pop();
        }
        return rev;
    }
}