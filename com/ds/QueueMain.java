package com.ds;

public class QueueMain {
    public static void main(String[] args) {
        Queue q=new Queue();
        q.enqueue(1);q.enqueue(2);q.enqueue(3);q.enqueue(4);q.enqueue(5);
        // q.print();
        q.dequeue();q.dequeue();
        // q.print();
        q.enqueue(7);q.enqueue(8);
        q.print();
    }
}

class Queue {
    int size = 10;
    int[] arr = new int[size];
    int front = -1, rear = -1;

    public void enqueue(int x) {
        if (isFull()) {
            return;
        } else if (isEmpty()) {
            front = 0;
            rear = 0;
        } else {
            rear = (rear + 1) % size;
        }
        arr[rear]=x;
    }

    public void dequeue() {
        if (isEmpty()) {
            return;
        } else if (front == rear) {
            front = -1;
            rear = -1;
        } else {
            front = (front + 1) % size;
        }
    }

    public void print() {
        if (!isEmpty()) {
            for (int i = front; i <= rear; i++) {
                System.out.print(arr[i]+" ");
            }
            System.out.println();
        }
    }

    boolean isFull() {
        return (rear + 1) % size == front ? true : false;
    }

    boolean isEmpty() {
        return front == -1 && rear == -1 ? true : false;
    }
}