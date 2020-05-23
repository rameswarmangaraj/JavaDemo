package com.rt;

public class SumofKConsucativeEle {
    public static void main(String[] args) {
        int[] arr={1,8,30,-5,20,7};
        int k=3;
        // findMaxKConsuSumMeth1(arr,k);
        findMaxKConsuSumMeth2(arr,k);
    }

    public static void findMaxKConsuSumMeth2(int[] arr, int k) {
        int max=0,sum=0;
        for (int i = 0; i < k; i++) {
            sum+=arr[i];
        }
        max=sum;
        for (int i = k; i < arr.length; i++) {
            sum=sum+arr[i]-arr[i-k];
            if(sum>max)max=sum;
        }
        System.out.println(max);
    }

    public static void findMaxKConsuSumMeth1(int[] arr, int k) {
        int max=0,sum=0;
        for (int i = 0; i < arr.length-k; i++) {
            sum=arr[i];
            for (int j = i+1; j < i+k; j++) {
                sum+=arr[j];
            }
            if(sum>max) max=sum;
        }
        System.out.println(max);
    }
}