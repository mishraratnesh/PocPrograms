package com.program.logical;

public class Fibbonacci {
//	public static int checkFibbo(int num) {
//		if (num == 1 || num == 0) {
//			return 1;
//		}
//		return checkFibbo(num - 1) + checkFibbo(num - 2);
//	}
//
//	public static void fibboWithRecursion(int num) {
//
//		for (int i = 0; i < num; i++) {
//			int fib = checkFibbo(i);
//			System.out.print(fib + " ");
//		}
//
//	}
//
//	public static void fibboWithoutRecursion(int num) {
//		long firstNum = 1, secondNum = 1, holdNum;
//		System.out.println(" ");
//		for (long i = 0; i < num; i++) {
//			System.out.print(firstNum + " ");
//			holdNum = firstNum;
//			firstNum = secondNum;
//			secondNum = holdNum + secondNum;
//
//		}
//
//	}

	public static void main(String[] args) {

//		long st = System.currentTimeMillis();
//		fibboWithRecursion(10);
//		long excTime1 = System.currentTimeMillis() - st;
//		System.out.println("Execution Time: " + excTime1);

		long st2 = System.currentTimeMillis();
//		fibboWithoutRecursion(20);
		 int sqrt = (int) Math.sqrt(100) + 1;
		 System.out.println(sqrt);
//		long excTime = System.currentTimeMillis() - st2;
//		System.out.println("Execution Time: " + excTime);

	}
}
