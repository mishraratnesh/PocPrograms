package com.program.ds;

public class BubbleSort {
	static int count;

	public static void main(String[] args) {
		int[] array ={ 2, 13, 4, 7, 16, 1, 5,5, 3, 8, 6 };
		BubbleSort.sort(array);
		System.out.print("sorted array: ");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}

	public static void sort(int[] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				
				if (array[i] > array[j]) {
					int swap = array[j];
					array[j] = array[i];
					array[i] = swap;
				}
				count++;
			}

		}
		System.out.println("loop count: " + count);
	}
}
