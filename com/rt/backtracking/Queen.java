package com.rt.backtracking;

import java.util.Arrays;

public class Queen {

    public static void main(String[] args) {
        int[][] arr = new int[4][4];
        int[][] res = solve(0, arr);
        //below line not able to print sol
        System.out.println(Arrays.deepToString(res));
    }

    private static int[][] solve(int r, int[][] arr) {
        if (r >= arr.length) {
            //print all correct sol 
            System.out.println(Arrays.deepToString(arr));
            return arr;
        }
        for (int c = 0; c < arr.length; c++) {
            if (isSafe(r, c,arr)) {
                arr[r][c]=1;
                solve(r+1, arr);
                //comment below 2 line to find all possible sol 
                if(r==arr.length-1)
                    break;
                arr[r][c]=0;
            }
        }
        return arr;
    }

    private static boolean isSafe(int r, int c, int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            if(arr[i][c]==1){
                return false;
            }
        }
        for (int i = r,j=c; i < arr.length && j<arr.length; i++,j++) {
            if(arr[i][j]==1){
                return false;
            }
        }
        for (int i = r,j=c; i < arr.length && j>=0; i++,j--) {
            if(arr[i][j]==1){
                return false;
            }
        }
        for (int i = r,j=c; i >=0 && j<arr.length ; i--,j++) {
            if(arr[i][j]==1){
                return false;
            }
        }
        for (int i = r,j=c; i >=0 && j>=0; i--,j--) {
            if(arr[i][j]==1){
                return false;
            }
        }
        return true;
    }
}