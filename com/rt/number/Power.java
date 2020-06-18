package com.rt.number;

public class Power {
    public static void main(String[] args) {
        int a = 2;
        int b = 6;
        int p = powerRecRed(a, b);
        System.out.println(p);
    }

    // O(log n) complexity
    private static int powerRecRed(int a, int b) {
        if (a == 0) {
            return 0;
        }
        if (b == 0) {
            return 1;
        }
        int value = powerRecRed(a, b / 2);
        int res = value * value;
        if (b % 2 != 0) {
            res *= a;
        }
        return res;
    }

    // O(n)
    private static int powerRec(int a, int b) {
        if (a == 0) {
            return 0;
        }
        if (b == 0) {
            return 1;
        }
        return a * powerRec(a, b - 1);
    }

    // O(n)
    private static int powerFor(int a, int b) {
        int p = 1;
        for (int i = 0; i < b; i++) {
            p = p * a;
        }
        return p;
    }
}