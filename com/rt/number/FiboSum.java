package com.rt.number;

import java.util.Arrays;

public class FiboSum {
    public static void main(String[] args) {
        int range = 10;
        int sum = fiboRec(range);
        System.out.println(sum);
    }

    private static int fiboRec(int range) {
        if (range == 0 || range == 1)
            return 1;
        else
            return fiboRec(range - 2) + fiboRec(range - 1);
    }

    private static int fiboSum(int range) {
        int sum = 1;
        int[] arr = new int[range + 1];
        arr[0] = 0;
        arr[1] = 1;
        for (int i = 2; i < arr.length; i++) {
            arr[i] = arr[i - 2] + arr[i - 1];
            sum += arr[i];
        }
        System.out.println(Arrays.toString(arr));
        return sum;
    }
}