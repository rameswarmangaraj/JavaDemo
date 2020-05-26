package com.rt;

import java.util.HashSet;

public class Intersection {
    /**Find the intersection of two unsorted array */
    public static void main(String[] args) {
        int[] arrA = { 15, 20, 5, 15 };
        int[] arrB = { 15, 15, 15, 20, 10 };
        intersection(arrA,arrB);
    }

    private static void intersection(int[] arrA, int[] arrB) {
        HashSet<Integer> hs=new HashSet<>();
        for (Integer a : arrA) {
            hs.add(a);
        }
        for (Integer b : arrB) {
            if(hs.contains(b)){
                System.out.println(b);
                hs.remove(b);
            }
        }
    }
}