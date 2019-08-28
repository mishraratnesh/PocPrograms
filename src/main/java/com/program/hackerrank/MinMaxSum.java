package com.program.hackerrank;

public class MinMaxSum {

	static void miniMaxSum(int[] array) {
		long min = 0;
		long max = 0;
		int next = 0;
		while (next < array.length) {
			long sum = 0;
			for (int i = 0; i < array.length; i++) {
				if (next != i) {
					sum = sum + array[i];
				}
			}
			if (next == 0) {
				min = sum;
			}
			System.out.println(sum);
			if (sum > max) {
				max = sum;

			} else if (min > sum) {
				min = sum;
			}
			next++;

		}
		System.out.println("min: " + min);
		System.out.println("max: " + max);
	}

	public static void main(String[] args) {
		int[] case4 = { 769082435, 210437958, 673982045, 375809214, 380564127 };
		MinMaxSum.miniMaxSum(case4);
	}
}