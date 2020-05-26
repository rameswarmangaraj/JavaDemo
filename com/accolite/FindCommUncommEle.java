package com.accolite;

import java.util.ArrayList;
import java.util.Arrays;        

public class FindCommUncommEle {

    /**
     * Two file contain some number in eachline  f1={1,2,3,4,5,6,7,8,9,10}
     * f2={2,6,7,9} Find common ele ? Find numbers in file1 that not in file2 ?
     */
    public static void main(String[] args) {
        Integer[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        Integer[] arr1 = { 2, 6, 7, 9, 10,12 };
        printEle(arr, arr1);
        printCommomEle(arr,arr1);
    }

    private static void printCommomEle(Integer[] arr, Integer[] arr1) {
        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(arr));
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.addAll(Arrays.asList(arr1));
        list.retainAll(list1);
        System.out.println(list);
    }

    private static void printEle(Integer[] arr, Integer[] arr1) {
        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(arr));
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.addAll(Arrays.asList(arr1));
        list.removeAll(list1);
        System.out.println(list);
    }
}