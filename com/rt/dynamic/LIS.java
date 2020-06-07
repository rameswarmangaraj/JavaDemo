package com.rt.dynamic;

import java.util.Arrays;
import java.util.Collections;

public class LIS {
    public static void main(String[] args) {
        int arr[] = { 3, 10, 2, 1, 20 };// 3 10 20
        int len = getLenLIS(arr);
        System.out.println(len);
    }

    private static int getLenLIS(int[] arr) {
        Integer[] res = new Integer[arr.length];
        for (int i = 0; i < res.length; i++) {
            res[i] = 1;
        }
        for (int i = 1; i < arr.length; i++) {
            for (int j = i - 1; j >= 0; j--) {
                if (arr[i] > arr[j] && res[j]+1 >= res[i]) {
                    res[i] = res[j] + 1;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(res));
        return Collections.max(Arrays.asList(res));
    }
}