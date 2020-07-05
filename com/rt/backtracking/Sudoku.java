package com.rt.backtracking;

import java.util.Arrays;

public class Sudoku {
    public static void main(String[] args) {
        int[][] m = { { 3, 0, 6, 5, 0, 8, 4, 0, 0 }, { 5, 2, 0, 0, 0, 0, 0, 0, 0 }, { 0, 8, 7, 0, 0, 0, 0, 3, 1 },
                { 0, 0, 3, 0, 1, 0, 0, 8, 0 }, { 9, 0, 0, 8, 6, 3, 0, 0, 5 }, { 0, 5, 0, 0, 9, 0, 6, 0, 0 },
                { 1, 3, 0, 0, 0, 0, 2, 5, 0 }, { 0, 0, 0, 0, 0, 0, 0, 7, 4 }, { 0, 0, 5, 2, 0, 6, 3, 0, 0 } };
        print(m);
        solve(m, m.length);
        print(m);
    }

    private static void print(int[][] m) {
        for (int i = 0; i < m.length; i++) {
            System.out.println(Arrays.toString(m[i]));
        }
        System.out.println();
    }

    private static boolean solve(int[][] m, int n) {
        int row = -1;
        int col = -1;
        boolean isEmpty = true;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (m[i][j] == 0) {
                    row = i;
                    col = j;
                    isEmpty = false;
                    break;
                }
            }
            if (!isEmpty) {
                break;
            }
        }
        if (isEmpty) {
            return true;
        }
        // placing number
        for (int i = 1; i <= n; i++) {
            if (isSafe(m, row, col, i)) {
                m[row][col] = i;
                if (solve(m, n)) {
                    return true;
                } else {
                    m[row][col] = 0;
                }
            }
        }
        return false;
    }

    private static boolean isSafe(int[][] m, int row, int col, int n) {
        // row
        for (int j = 0; j < m.length; j++) {
            if (m[row][j] == n) {
                return false;
            }
        }
        // col
        for (int j = 0; j < m.length; j++) {
            if (m[j][col] == n) {
                return false;
            }
        }

        // 3*3 box
        int rBoundry = row - row % 3;
        int cBoundry = col - col % 3;
        for (int i = rBoundry; i < rBoundry + 2; i++) {
            for (int j = cBoundry; j < cBoundry + 2; j++) {
                if (m[i][j] == n) {
                    return false;
                }
            }
        }

        return true;
    }
}