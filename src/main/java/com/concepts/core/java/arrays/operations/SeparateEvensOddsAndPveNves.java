package com.concepts.core.java.arrays.operations;

import java.util.Arrays;

public class SeparateEvensOddsAndPveNves {

	public static void main(String[] args) {
		int nums[] = { 20, 12, 23, 17, 7, 8, 10, 2, 1, 0 };
		int nums1[] = { -1, 3, 8, -4, 5, -7, -20, 30, 40 };
		int result[];

		result = separateOddsEvens(nums);
		System.out.print("Array after separation:             ");
		System.out.println(Arrays.toString(result));

		result = separatePveNve(nums1);
		System.out.print("Array after separation:             ");
		System.out.println(Arrays.toString(result));

	}

	static int[] separateOddsEvens(int arr[]) {
		System.out.println("Original Array (separateOddsEvens): "+ Arrays.toString(arr));

		int left = 0;
		int right = arr.length - 1;
		int pivot = 2;
		while (left < right) {
			while ((arr[left] % pivot == 0) && (left < right)) {
				left++;
			}
			while ((arr[right] % pivot == 1) && (left < right)) {
				right--;
			}
			if (left < right) {
				int temp = arr[left];
				arr[left] = arr[right];
				arr[right] = temp;
				left++;
				right--;
			}
		}
		return arr;
	}

	static int[] separatePveNve(int arr[]) {
		System.out.println("Original Array (separatePveNve):    "+ Arrays.toString(arr));
		int left = 0;
		int right = arr.length - 1;
		int pivot = 0;
		while (left < right) {
			while ((arr[left] < pivot) && (left < right)) {
				left++;
			}
			while ((arr[right] > pivot) && (left < right)) {
				right--;
			}

			if (left < right) {
				int temp = arr[left];
				arr[left] = arr[right];
				arr[right] = temp;
				left++;
				right--;
			}
		}
		return arr;
	}
}