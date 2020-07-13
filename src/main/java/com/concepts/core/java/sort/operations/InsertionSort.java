package com.concepts.core.java.sort.operations;

import java.util.Arrays;

public class InsertionSort {

	public static void main(String[] args) {
		int[] intArr = { 3, 5, 7, 8, 4, 2, 1, 9, 6 };
		insertionSortImpl(intArr);
	}

	public static void insertionSortImpl(int[] array) {

		System.out.println("Actual array: " + Arrays.toString(array));

		for (int i = 1; i < array.length; i++) {
			int current = array[i];
			int j = i - 1;
			while (j >= 0 && current < array[j]) {
				array[j + 1] = array[j];
				j--;
			}
			// at this point we've exited, so j is either -1
			// or it's at the first element where current >= a[j]
			array[j + 1] = current;
		}
		System.out.println("Sorted array: " + Arrays.toString(array));
	}

}
