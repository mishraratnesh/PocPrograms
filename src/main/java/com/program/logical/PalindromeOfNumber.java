package com.program.logical;

public class PalindromeOfNumber {
	public static int isPalindrome(int num) {
		int reverse = 0;
		while (num != 0) {
			int remainder = num % 10;
			reverse = reverse * 10 + remainder;
			num = num / 10;
		}
		return reverse;
	}

	public static void main(String[] args) {
		System.out.println(PalindromeOfNumber.isPalindrome(289437));
	}
}

