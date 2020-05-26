package com.rt;

import java.util.HashSet;

public class Union {
    /**
     * Find the union of two unsorted array
     */
    public static void main(String[] args) {
        int[] arrA = { 15, 20, 5, 15 };
        int[] arrB = { 15, 15, 15, 20, 10 };
        union(arrA, arrB);
    }

    private static void union(int[] arrA, int[] arrB) {
        HashSet<Integer> hs = new HashSet<>();
        for (Integer a : arrA) {
            hs.add(a);
        }
        for (Integer b : arrB) {
            hs.add(b);
        }
        System.out.println(hs.toString());
    }

}