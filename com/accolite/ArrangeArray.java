package com.accolite;

import java.util.Arrays;

public class ArrangeArray {
    /**
     * Accolite
     * input array [1,2,3,4,5,6,7,8,9,10] op [1,3,5,7,9,2,4,6,8,10]
     */
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        printInforma(arr);
    }

    private static void printInforma(int[] arr) {
        int[] list = new int[arr.length];
        int j=0;
        for (int i = 0; i < list.length; i++) {
            if(arr[i]%2!=0){
                list[j]=arr[i];
                j++; 
            }
        }
        for (int i = 0; i < list.length; i++) {
            if(arr[i]%2==0){
                list[j]=arr[i]; 
                j++; 
            }
        }
        System.out.println(Arrays.toString(list));
    }
}