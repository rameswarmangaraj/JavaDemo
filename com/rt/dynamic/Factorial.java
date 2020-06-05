package com.rt.dynamic;

public class Factorial {
    public static void main(String[] args) {
        int fact=getFactorialMemoiZation(5);
        System.out.println(fact);
    }

    private static int getFactorialMemoiZation(int n) {
        if (n==0||n==1) {
            return 1;
        }
        int[] arr=new int[n+1];
        arr[0]=1;arr[1]=1;
        for (int i = 2; i < arr.length; i++) {
            arr[i]=arr[i-1]*i;
            System.out.println(arr[i]);
        }
        return arr[n];
    }

    private static int getFactorial(int n) {
        if (n==0||n==1) {
            return 1;
        }
        int fact=1;
        for (int i = n; i > 1; i--) {
            fact*=i;
        }
        return fact;
    }
}