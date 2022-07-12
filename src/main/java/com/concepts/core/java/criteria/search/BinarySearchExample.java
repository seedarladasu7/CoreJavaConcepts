package com.concepts.core.java.criteria.search;

import java.io.IOException;

public class BinarySearchExample {
	public static void main(String[] args) throws IOException {
		int arr[] = {1,2,3,4,5};
		
		int n = arr.length;
		
		int key = 4;
		Solution g = new Solution();
		System.out.println(g.binarysearch(arr, n, key));
	}
}

//User function Template for Java

class Solution {
	int binarysearch(int arr[], int n, int k) {
		// code here

		int s = 0, e = n - 1;

		while (s <= e) {
			int mid = (s + e) / 2;
			if (arr[mid] == k) {
				return mid;
			} else if (arr[mid] < k) {
				s = mid + 1;
			} else {
				e = mid - 1;
			}

		}

		return -1;

	}

}
