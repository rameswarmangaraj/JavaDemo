package com.ds;

public class QueueLinkedList {
    public static void main(String[] args) {
        QLinkedList lq=new QLinkedList();
        lq.enqueue(1); lq.enqueue(2); lq.enqueue(3); lq.enqueue(4);
        lq.print();
        lq.dequeue();
        lq.print();
    }
}
class QNode{
    QNode next;
    int data;
}
class QLinkedList{
    QNode front=null,rear=null;
    public void enqueue(int data){
        QNode tem=new QNode();
        tem.data=data;
        tem.next=null;
        if(front==null && rear==null){
            front=rear=tem;
            return;
        }
        rear.next=tem;
        rear=tem;
    }

   public void dequeue(){
        if(front==null){ System.out.println("Queue is empty"); return;}
        if(front==rear){front=rear=null;return;}
        front=front.next;
    }
   public void print(){
        QNode t=front;
        while(t!=null){
            System.out.print(t.data+" ");
            t=t.next;
        }
        System.out.println();
    }
}