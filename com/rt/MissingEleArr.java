package com.rt;

public class MissingEleArr {
    public static void main(String[] args) {
        int[] arr={2,3,5,7,1,9,6};
        printMissingEle(arr);
    }

    private static void printMissingEle(int[] arr) {
        int max=findMax(arr);
        int[] hasTab=new int[max+1];
        for (int i = 0; i < arr.length; i++) {
            hasTab[arr[i]]=hasTab[arr[i]]+1;
        }
        for (int i = 1; i < hasTab.length; i++) {
            if(hasTab[i]==0){
                System.out.println(i);
            }
        }
    }

    private static int findMax(int[] arr) {
        int max=arr[0];
        for (int i = 0; i < arr.length; i++) {
            max=Integer.max( max,arr[i]);
        }
        return max;
    }
}