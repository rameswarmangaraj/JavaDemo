package com.rt.sorting;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int arr[] = { 9, 3, 5, 6, 9, 2, 4 };
        quicksort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    private static void quicksort(int[] arr, int start, int end) {
        if (start < end) {
            int pi = partition(arr, start, end);
            quicksort(arr, start, pi-1);
            quicksort(arr, pi+1, end);
        }
    }

    private static int partition(int[] arr, int start, int end) {
        int pi = start, pivot = arr[end];
        for (int i = start; i < end; i++) {
            if (arr[i] <= pivot) {
                swap(arr, i, pi);
                pi++;
            }
        }
        swap(arr, pi,end);
        return pi;

    }

    private static void swap(int[] arr, int i, int pi) {
        int t = arr[i];
        arr[i] = arr[pi];
        arr[pi] = t;
    }
}