package com.rt.graph;

import java.util.Arrays;

public class AdjacencyMatrixDemo {
    public static void main(String[] args) {
        AdjacencyMatrix aj = new AdjacencyMatrix(4);
        aj.addEdge(0, 1);
        aj.addEdge(0, 2);
        aj.addEdge(1, 2);
        aj.addEdge(2, 3);
        aj.print();
        System.out.println(aj.isAdjacent(0, 2));
    }
}

// undirected graph
class AdjacencyMatrix {
    final int n;
    final int[][] m;

    AdjacencyMatrix(int n) {
        this.n = n;
        this.m = new int[n][n];
    }

    public void addEdge(int u, int v) {
        m[u][v] = 1;
        m[v][u] = 1;
    }

    public void removeEdge(int u, int v) {
        m[u][v] = 0;
        m[v][u] = 0;
    }

    public boolean isAdjacent(int u, int v) {
        return m[u][v] + m[v][u] == 2;
    }

    public void print() {
        System.out.println("----------------");
        for (int i = 0; i < m.length; i++) {
            System.out.println(Arrays.toString(m[i]));
        }
        System.out.println("----------------");
    }
}
