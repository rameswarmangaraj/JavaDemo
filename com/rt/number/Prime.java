package com.rt.number;

import java.util.Arrays;

public class Prime {
    public static void main(String[] args) {
        int range=20;
        // getPrimeNum(range);
        getPrimeNumSeive(range);
    }

    private static void getPrimeNumSeive(int range) {
        boolean[] seive=new boolean[range+1];
        Arrays.fill(seive, true);
        seive[0]=false;seive[1]=false;
        for (int i = 0; i <=range; i++) {
            if(seive[i]){
                System.err.println(i+":"+seive[i]);
                for (int j = i*2; j <=range; j=j+i) {
                    seive[j]=false;
                }
            }
        }
    }

    private static void getPrimeNum(int range) {
        for (int i = 2; i <= range; i++) {
            if(getPrime(i)){
                System.out.println(i+" : "+getPrime(i));
            }
        }
    }

    private static boolean getPrime(int i) {
        for (int j = 2; j * j <= i; j++) {
            if (i % j == 0)
                return false;
        }
        return true;
    }
}