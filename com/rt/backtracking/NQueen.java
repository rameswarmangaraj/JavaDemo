package com.rt.backtracking;

import java.util.ArrayList;
import java.util.List;

public class NQueen {
    public static void main(String[] args) {
        List<Integer> res=solve(4);
        System.out.println(res);
    }

    private static List<Integer> solve(int n) {
        List<Integer> res=new ArrayList<Integer>();
        solveNQueen(n,0,new ArrayList<Integer>(),res);
        return res;
    }

    private static void solveNQueen(int n, int row, ArrayList<Integer> colPlace, List<Integer> res) {
        if(row==n){
            res.addAll(colPlace);
        }
        else{
            for (int col = 0; col <n; col++) {
                colPlace.add(col);
                if(isValid(colPlace)){
                    solveNQueen(n, row+1, colPlace, res);
                }
                colPlace.remove(colPlace.size()-1);
            }
        }
    }

    private static boolean isValid(ArrayList<Integer> colPlace) {
        int row=colPlace.size()-1;
        for (int i = 0; i < row; i++) {
            int d=Math.abs(colPlace.get(i)-colPlace.get(row));
            if(d==0||d==row-i){
                return false;
            }
        }
        return true;
    }
    
}