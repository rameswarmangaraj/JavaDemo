package com.rt;

import java.util.HashSet;

public class CountDistinct {
    /**
     * Count distinct elements in an array
     * @param args
     */
    public static void main(String[] args) {
        int[] arr={15,12,13,12,13,13,18};
        int dCount=countDistinct(arr);
        System.out.println(dCount);
    }

    private static int countDistinct(int[] arr) {
        int count=0;
        HashSet<Integer> hs=new HashSet<>();
        for (int i : arr) {
            hs.add(i);
        }
        count=hs.size();
        return count;
    }
}