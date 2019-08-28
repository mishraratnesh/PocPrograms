package com.program.ds;

import java.util.Arrays;

public class QuickSort {

	public static void sort(int low, int high, int[] array) {
		int pivote = partissioning(low, high, array);
		while (low < high) {
			sort(low, pivote - 1, array);
			sort(pivote + 1, high, array);
		}
	}

	private static int partissioning(int low, int high, int[] array) {
		int i = low;
		int j = high;
		int swap = 0;
		int pivote = 0;

		while (array[pivote] <= array[i]) {
			swap = array[i];
			array[i] = array[j];
			array[j] = swap;

			while (array[pivote] >= array[j]) {
				swap = array[j];
				array[i] = array[j];
				array[j] = swap;

			}
		}
		swap = array[j];
		array[j] = array[pivote];
		array[pivote] = swap;
		return pivote;
	}

	public static void main(String[] args) {
		int[] array = { 10, 5, 73, 57, 34, 74, 39, 38, 75 };
		int low = 0;
		int high = array.length;
		QuickSort.sort(low, high, array);
		System.out.println(Arrays.toString(array));
	}
}
