package com.concepts.core.java.create.vitech;

import java.util.Arrays;

public class FindSecondLargestMain {
	public static void main(String args[]) {
		int[] arr1 = { 7, 5, 6, 1, 4, 2 };
		int secondHighest = findSecondLargestNumberInTheArray(arr1);
		System.out.println("Second largest element in the array : " + secondHighest);

		findSecondLargestNumberInTheArrayJava8(arr1);

	}

	public static int findSecondLargestNumberInTheArray(int array[]) {
		// Initialize these to the smallest value possible
		int highest = Integer.MIN_VALUE;
		int secondHighest = Integer.MIN_VALUE;

		// Loop over the array
		for (int i = 0; i < array.length; i++) {
			// If current element is greater than highest
			if (array[i] > highest) {

				// assign second highest element to highest element
				secondHighest = highest;

				// highest element to current element
				highest = array[i];
			} else if (array[i] > secondHighest && array[i] != highest) {
				// Just replace the second highest 
				secondHighest = array[i];
			}
		}

		// After exiting the loop, secondHighest now represents the second
		// largest value in the array
		return secondHighest;
	}

	public static void findSecondLargestNumberInTheArrayJava8(int array[]) {		
		int arrLlen = array.length;
		Arrays.stream(array).sorted()
		.limit(arrLlen-1)
		.skip(arrLlen-2)
		.forEach(System.out::println);
	}

}