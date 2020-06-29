package com.rt.graph;

import java.util.LinkedList;

public class AdjacencyListDemo {
    public static void main(String[] args) {
        AdjacencyList ls=new AdjacencyList(4);
        ls.addEdge(0, 1);
        ls.addEdge(0, 2);
        ls.addEdge(1, 2);
        ls.addEdge(2, 3);
        ls.print();
        ls.removeEdge(2, 3);
        ls.print();
    }
}
class AdjacencyList{
    final int n;
    final LinkedList<Integer>[] lis;
    AdjacencyList(int n){
        this.n=n;
        lis=new LinkedList[n];
        for (int i = 0; i < lis.length; i++) {
            lis[i]=new LinkedList<>();
        }
    }
    public void addEdge(int u,int v){
        lis[u].add(v);
        lis[v].add(u);
    }
    public void removeEdge(Integer u,Integer v){
        lis[u].remove(v);
        lis[v].remove(u);
    }
    public void print(){
        for (int i = 0; i < n; i++) {
            System.out.println(lis[i]);
        }
        System.out.println("--------------");
    }
}