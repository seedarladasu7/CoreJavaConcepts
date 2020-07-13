package com.concepts.core.java.sort.operations;

import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {
		int[] intArr = { 3, 5, 7, 8, 4, 2, 1, 9, 6 };
		selectionSortImpl(intArr);
	}

	public static void selectionSortImpl(int[] array) {
		System.out.println("Actual array: " + Arrays.toString(array));
		for (int i = 0; i < array.length; i++) {
			int min = array[i];
			int minId = i;
			for (int j = i + 1; j < array.length; j++) {
				if (array[j] < min) {
					min = array[j];
					minId = j;
				}
			}
			// swapping
			int temp = array[i];
			array[i] = min;
			array[minId] = temp;
		}
		System.out.println("Sorted array: " + Arrays.toString(array));
	}

}
