package com.rt;

import java.util.HashSet;

public class FindPairGivenSum {
    /**
     * Find a pair from array where sum is given
     * [3,2,8,15,-8] if given sum is 17 then pair is 2,15 which is present
     */
    public static void main(String[] args) {
        int[] arr={3,2,8,15,-8};
        int gSum=18;
        findPair(arr,gSum);
    }

    private static void findPair(int[] arr, int gSum) {
        HashSet<Integer> hs=new HashSet<>();
        for (Integer e : arr) {
            int d=gSum-e;
            if(hs.contains(d)){
                System.out.println(e+","+d);
            }
            hs.add(e);
        }
    }
    
}