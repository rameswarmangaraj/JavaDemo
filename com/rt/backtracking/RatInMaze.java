package com.rt.backtracking;

import java.util.Arrays;

public class RatInMaze {
    public static void main(String[] args) {
		int n = 3;
		int[][] maze = { { 1, 1, 0 }, { 1, 1, 1 }, { 1, 1, 1 } };
		System.out.println("Maze:");
		for (int i = 0; i < maze.length; i++) {
			System.out.println(Arrays.toString(maze[i]));
		}
		System.out.println();
		solveRatInMaze(n, maze);
	}

	private static void solveRatInMaze(int n, int[][] maze) {
		int[][] path = new int[n][n];
		solve(0, 0, n, maze, path);

	}

	private static void solve(int i, int j, int n, int[][] maze, int[][] path) {
		if (i == n - 1 && j == n - 1) {
			path[i][j] = 1;
			printPath(path);
			return;
		}
		if(i>=0 && i<n && j>=0 && j<n && path[i][j]==0 && maze[i][j]==1 && maze[n-1][n-1]==1) {
			path[i][j]=1;
			solve(i-1, j, n, maze, path);
			solve(i+1, j, n, maze, path);
			solve(i, j-1, n, maze, path);
			solve(i, j+1, n, maze, path);
			path[i][j]=0;
		}

	}

	private static void printPath(int[][] path) {
		System.out.println("Solution::");
		for (int i = 0; i < path.length; i++) {
			System.out.println(Arrays.toString(path[i]));
		}
		System.out.println();
	}
}