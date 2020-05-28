package com.ds;

public class StackByLL {
    public static void main(String[] args) {
        MyStack s=new MyStack();
        s.push(1).push(2).push(3).push(4).push(5);
        s.print();
        s.pop();
        s.print();
    }
}
class MyStack{
    Node top=null;
    MyStack push(int data){
        Node n=new Node();
        n.data=data;
        n.next=top;
        top=n;
        return this;
    }
    void pop(){
        if(top==null){
            System.out.println("Stack is empty");
            return;
        } 
        top=top.next;
    }
    void print(){
        Node n=top;
        while(n!=null){
            System.out.print(n.data+" ");
            n=n.next;
        }
        System.out.println();
    }
}
class MYNode{
    int data;
    MYNode next;
}