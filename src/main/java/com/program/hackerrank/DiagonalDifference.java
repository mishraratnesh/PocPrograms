package com.program.hackerrank;

import java.util.ArrayList;
import java.util.List;

public class DiagonalDifference {

	public static int diagonalDifference(List<List<Integer>> arr) {
		int sumright = 0;
		int sumleft = 0;
		Integer[][] array = new Integer[arr.size()][arr.size()];
		int index = 0;
		for (List<Integer> data : arr) {
			array[index] = data.toArray(new Integer[data.size()]);
			index++;
		}

		int len = array.length - 1;
		for (int i = 0; i < array.length; i++) {
			sumleft = sumleft + array[i][i];
			sumright = sumright + array[i][len - i];
		}
		return Math.abs(sumleft - sumright);
	}

	public static void main(String[] args) {

		List<Integer> list1 = new ArrayList<Integer>();
		list1.add(1);
		list1.add(2);
		list1.add(3);

		List<Integer> list2 = new ArrayList<Integer>();
		list2.add(4);
		list2.add(5);
		list2.add(6);

		List<Integer> list3 = new ArrayList<Integer>();
		list3.add(7);
		list3.add(8);
		list3.add(9);

		List<List<Integer>> mainlist = new ArrayList<List<Integer>>();
		mainlist.add(list1);
		mainlist.add(list2);
		mainlist.add(list3);
		System.out.println(DiagonalDifference.diagonalDifference(mainlist));

	}

}
