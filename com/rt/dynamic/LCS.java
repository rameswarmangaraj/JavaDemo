package com.rt.dynamic;

public class LCS {
    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = "acd";
        // acd
        int res = getLcs(s1, s2, 0, 0);

        System.out.println(res);
    }

    private static int getLcs(String s1, String s2, int i, int j) {
        if (s1.length() == 0 || s2.length() == 0) {
            return 0;
        }
        if (i > s1.length() - 1 || j > s2.length() - 1) {
            return 0;
        }
        if (s1.charAt(i) == s2.charAt(j)) {
            return 1 + getLcs(s1, s2, i + 1, j + 1);
        
        } else {
            int op1 = getLcs(s1, s2, i, j+1);
            int op2 = getLcs(s1, s2, i+1 , j);
            return op1 > op2 ? op1 : op2;
        }

    }
}