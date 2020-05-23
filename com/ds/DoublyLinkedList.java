package com.ds;

public class DoublyLinkedList {
    DNode head;
    void insertAtTop(int data){
        DNode temp=getNewNode(data);
        if(head==null){
            head=temp;
        }else{
            head.prev=temp;
            temp.next=head;
            head=temp;
        }
    }
    void insertAtEnd(int data){
        DNode n=getNewNode(data);
        if(head==null){
            head=n;
        }else{
            DNode t=head;
            while(t.next!=null){
                t=t.next;
            }
            n.prev=t;
            t.next=n;
        }        
    }
    void print(){
        DNode t=head;
        while(t!=null){
            System.out.println(t.data);
            t=t.next;
        }
    }
    void reversePrint(){
        DNode t=head;
        while(t.next!=null){
            t=t.next;
        }
        while(t!=null){
            System.out.println(t.data);
            t=t.prev;
        }
    }
    private DNode getNewNode(int data) {
        DNode temp=new  DNode();
        temp.data=data;
        temp.prev=null;
        temp.next=null;
        return temp;
    }
}