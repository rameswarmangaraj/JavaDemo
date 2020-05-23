package com.rt;


public class PrintDupliInSortedArray {
    public static void main(String[] args) {
        int[] sarr={3,6,8,8,10,12,15,15,15,20};
        int[] uarr={3,7,4,9,12,6,4,11,4,10};
        printDupliSorted(sarr);
        printDupliUnSort(uarr);
    }

    private static void printDupliUnSort(int[] arr) {
        int max=findMax(arr);
        int[] hasTab=new int[max+1];
        for (int i = 0; i < arr.length; i++) {
            hasTab[arr[i]]=hasTab[arr[i]]+1;
            if(hasTab[arr[i]]==2){
                System.out.println(arr[i]);
            }
        }

    }

    private static int findMax(int[] arr) {
        int max=arr[0];
        for (int i = 0; i < arr.length; i++) {
            max=Integer.max( max,arr[i]);
        }
        return max;
    }

    private static void printDupliSorted(int[] arr) {
        int ld=Integer.MIN_VALUE;
        for (int i = 1; i < arr.length; i++) {
            if(arr[i]==arr[i-1] && arr[i]!=ld){
                System.out.println(arr[i]);
                ld=arr[i];
            }
        }
    }
}