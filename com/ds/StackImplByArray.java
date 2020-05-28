package com.ds;
public class StackImplByArray{
    public static void main(String[] args) {
        Stack s=new Stack(10);
        s.push(1).push(2).push(3).push(4).push(5);
        s.print();
        s.pop();
        s.print();
        s.top();
    } 
}

class Stack {
    int[] arr;
    int size;
    int top = -1;

    Stack(int s) {
        size = s;
        arr=new int[size];
    }
    Stack push(int data){
        if(top==size-1){
            System.out.println("stack is full");
            return this;
        }
        top++;
        arr[top]=data;
        return this;
    }
    void pop(){
        if(top==-1){
            System.out.println("stack is empty");
            return;
        }
        System.out.println("Poped:"+arr[top]);
        top--;
    }
    boolean isEmpty(){
        boolean isEmpty=false;
        if(top==-1) isEmpty=true;
        return isEmpty;

    }
    void top(){
        if(top==-1){
            System.out.println("stack is empty");
            return;
        }
        System.out.println("Top:"+arr[top]);
    }
    void print(){
        for (int i = 0; i <=top ; i++) {
            System.out.print(arr[i]+" ");
        }
    }
    
}