package com.rt.competative;
import java.util.Arrays;

public class ArrayRotation {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        //leftRotate(arr,2);
        leftRotateMethod2(arr,3);
        System.out.println(Arrays.toString(arr));
    }

    public static void leftRotateMethod2(int[] arr, int d) {
        reverse(arr,0,d-1);
        reverse(arr,d,arr.length-1);
        reverse(arr,0,arr.length-1);
    }

    public static void reverse(int[] arr, int start, int end) {
        int i=start,j=end;
        while (i<j) {
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;j--;
        }
    }

    public static void leftRotateMethod1(int[] arr, int d) {
        for (int i = 0; i < d; i++) {
            leftbyone(arr);
        }
    }

    public static void leftbyone(int[] arr) {
        int temp=arr[0];
        for (int i = 0; i < arr.length-1; i++) {
            arr[i]=arr[i+1];
        }
        arr[arr.length-1]=temp;
    }
}