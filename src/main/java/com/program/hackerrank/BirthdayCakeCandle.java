package com.program.hackerrank;

public class BirthdayCakeCandle {
	static int birthdayCakeCandles(int[] array) {
		int count = 0;
		int max = array[0];
		for (int i = 0; i < array.length; i++) {
			if (max == array[i])
				count++;
			if (array[i] > max) {
				max = array[i];
			}
			
		}
		return count;
	}
	public static void main(String[] args) {
		int[] array= {18 ,90 ,90 ,13 ,90 ,75 ,90, 8 ,90 ,43};
		System.out.println(BirthdayCakeCandle.birthdayCakeCandles(array));
	}
}
