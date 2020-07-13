package com.concepts.core.java.sort.operations;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		int[] intArr = { 4, 2, 1, 5, 3 };
		bubbleSortImpl(intArr);
	}

	public static void bubbleSortImpl(int[] a) {
		boolean sorted = false;
		int temp;
		System.out.println("Actual array: " + Arrays.toString(a));
		while (!sorted) {
			sorted = true;
			for (int i = 0; i < a.length - 1; i++) {
				if (a[i] > a[i + 1]) {
					temp = a[i];
					a[i] = a[i + 1];
					a[i + 1] = temp;
					sorted = false;
				}
			}
		}

		System.out.println("Sorted array: " + Arrays.toString(a));
	}
}
