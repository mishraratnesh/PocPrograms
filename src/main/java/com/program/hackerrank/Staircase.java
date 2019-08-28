package com.program.hackerrank;

public class Staircase {
	static void staircase(int n) {
		int i = 0;
		for (i = 1; i <= n; i++) {
			for (int space = n ; space > i; space--) {
				System.out.print(" ");
			}
			for (int stair = 1; stair <= i; stair++) {
				System.out.print("#");
			}
			
			if (i < n)
				System.out.println();
		}
	}

	public static void main(String[] args) {
		Staircase.staircase(5);
	}
}
