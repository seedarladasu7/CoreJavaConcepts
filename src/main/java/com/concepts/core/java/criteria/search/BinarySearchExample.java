package com.concepts.core.java.criteria.search;

import java.io.IOException;

public class BinarySearchExample {
	public static void main(String[] args) throws IOException {
		int arr[] = {1,2,3,4,5,6,7};

		int n = arr.length;

		int key = 5;
		Solution g = new Solution();
		System.out.println("Index of gievn search key is: " + g.binarysearch(arr, n, key));
	}
}

//User function Template for Java

class Solution {
	int binarysearch(int arr[], int n, int k) {
		// code here

		int start = 0, end = n - 1;

		while (start <= end) {
			int mid = (start + end) / 2;
			if (arr[mid] == k) {
				return mid;
			} else if (arr[mid] < k) {
				start = mid + 1;
			} else {
				end = mid - 1;
			}

		}

		return -1;

	}

}
