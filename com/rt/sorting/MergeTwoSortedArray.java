package com.rt.sorting;

import java.util.Arrays;

public class MergeTwoSortedArray {
    public static void main(String[] args) {
        int[] a = { 5, 6, 7 };
        int[] b = { 3, 4, 8, 9, 9 };
        int[] result = getMergeSort(a, b);
        System.out.println(Arrays.toString(result));
    }

    private static int[] getMergeSort(int[] a, int[] b) {
        int[] c = new int[a.length + b.length];
        int i = 0, j = 0, k = 0;
        while (i < a.length && j < b.length) {
            c[k++]=(a[i] < b[j])?a[i++]: b[j++];
        }
        while (i < a.length) {
            c[k++] = a[i++];
        }
        while (j < b.length) {
            c[k++] = b[j++];
        }
        return c;
    }
}