package com.program.hackerrank;

public class PlusMinus {

	public static void main(String[] args) {

		int[] array = { 1, 2, 3, -1, -2, 0 };
		PlusMinus.plusMinus(array);
	}

	static void plusMinus(int[] arr) {
		int len = arr.length;
		double zeroCount = 0, positiveCount = 0, negativecount = 0;
		for (int data : arr) {
			if (data == 0)
				zeroCount++;
			else if (data > 0)
				positiveCount++;
			else
				negativecount++;
		}

		System.out.printf("%.6f %n", positiveCount / len);
		System.out.printf("%.6f %n", negativecount / len);
		System.out.printf("%.6f %n", zeroCount / len);

	}

}
