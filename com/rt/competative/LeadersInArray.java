package com.rt.competative;
public class LeadersInArray {
    public static void main(String[] args) {
       int arr[]={7,10,4,3,6,5,2};
    //    printLeaderMethod1(arr,arr.length);
       printLeaderMethod2(arr,arr.length);

    }

    public static void printLeaderMethod2(int[] arr,int size) {
        int max=arr[size-1];
        System.out.println(max);
        for (int i = size-2; i >=0; i--) {
            if(max<arr[i]){
                max=arr[i];
                System.out.println(max);
            }
        }
    }

    public static void printLeaderMethod1(int[] arr, int size) {
        for (int i = 0; i < arr.length; i++) {
            int j;
            for ( j = i+1; j < arr.length; j++) {
                if(arr[i]<=arr[j]){
                    break;
                }
            }
            if(j==size){
                System.out.println(arr[i]);
            }
        }
    }
}