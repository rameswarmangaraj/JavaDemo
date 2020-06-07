package com.rt.sorting;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
     int[] arr={7,8,3,5,8,5,0,11,1,30,5};   
     getSortedArr(arr, 0, arr.length-1);
     System.out.println(Arrays.toString(arr));
    }

    private static void getSortedArr(int[] arr,int sindex,int eindex) {
        
        if(sindex<eindex){
            int m=(sindex+eindex)/2;
            getSortedArr(arr, sindex, m);
            getSortedArr(arr, m+1, eindex);
            merge(arr,sindex,m,eindex);
        }
        
    }

    private static void merge(int[] arr, int sindex, int m, int eindex) {
        int s1=m-sindex+1;
        int s2=eindex-m;
        int[] a=new int[s1];
        int[] b=new int[s2];
        for (int i = 0; i < s1; i++) {
            a[i]=arr[sindex+i];
        }
        for (int i = 0; i < s2; i++) {
            b[i]=arr[m+1+i];
        }
        getMergeSort(arr,sindex,a, b);
    }

    private static int[] getMergeSort(int[] arr, int sindex, int[] a, int[] b) {
        int i = 0, j = 0, k = sindex;
        while (i < a.length && j < b.length) {
            arr[k++]=(a[i] < b[j])?a[i++]: b[j++];
        }
        while (i < a.length) {
            arr[k++] = a[i++];
        }
        while (j < b.length) {
            arr[k++] = b[j++];
        }
        return arr;
    }
}