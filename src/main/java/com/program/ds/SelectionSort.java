package com.program.ds;

public class SelectionSort {
	static int count;

	public static void main(String[] args) {
		int[] array = { 2, 13, 4, 7, 16, 1, 5, 3, 8, 6 };
		SelectionSort.sort(array);
		System.out.print("sorted array: ");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}

	public static void sort(int[] array) {
		int swap = 0;
		int minIndex = 0;
		for (int i = 0; i < array.length - 1; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[minIndex] > array[j]) {
					minIndex = j;

				}
				count++;
			}

			swap = array[minIndex];
			array[minIndex] = array[i];
			array[i] = swap;

		}
		System.out.println("loop count: " + count);
	}
}
