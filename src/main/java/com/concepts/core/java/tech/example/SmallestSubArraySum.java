package com.concepts.core.java.tech.example;

class SmallestSubArraySum {
	// Returns length of smallest sub array with sum greater than x.
	// If there is no sub array with given sum, then returns n+1
	static int smallestSubWithSum(int arr[], int length, int x) {
		// Initialize length of smallest sub array as length+1
		int minLen = length + 1;

		// Pick every element as starting point
		for (int start = 0; start < length; start++) {
			// Initialize sum starting with current start
			int currSum = arr[start];

			// If first element itself is greater
			if (currSum >= x)
				return 1;

			// Try different ending points for current start
			for (int end = start + 1; end < length; end++) {
				// add last element to current sum
				currSum += arr[end];

				// If sum becomes more than x and length of
				// this sub array is smaller than current smallest
				// length, update the smallest length (or result)
				if (currSum >= x && (end - start + 1) < minLen)
					minLen = (end - start + 1);
			}
		}
		return minLen;
	}

	// Driver program to test above functions
	public static void main(String[] args) {
		int x = 51;
		/*int arr1[] = { 1, 4, 45, 6, 10, 19 };
		int n1 = arr1.length;
		int res1 = smallestSubWithSum(arr1, n1, x);
		if (res1 == n1 + 1)
			System.out.println("Not Possible");
		else
			System.out.println(res1);

		int arr2[] = { 1, 10, 5, 2, 7 };
		int n2 = arr2.length;
		x = 9;
		int res2 = smallestSubWithSum(arr2, n2, x);
		if (res2 == n2 + 1)
			System.out.println("Not Possible");
		else
			System.out.println(res2);

		int arr3[] = { 1, 11, 100, 1, 0, 200, 3, 2, 1, 250 };
		int n3 = arr3.length;
		x = 280;
		int res3 = smallestSubWithSum(arr3, n3, x);
		if (res3 == n3 + 1)
			System.out.println("Not Possible");
		else
			System.out.println(res3);
		*/
		System.out.println("####################Start: Array4 ####################");
		int arr4[] = {2,1,5,2,3,2};
		int n4 = arr4.length;
		x = 7;	
		int res4 = smallestSubWithSum(arr4, n4, x);
		if (res4 == n4 + 1)
			System.out.println("Not Possible");
		else
			System.out.println(res4);
		System.out.println("####################End: Array4 ####################");
		
		System.out.println("####################Start: Array5 ####################");
		int arr5[] = {2,1,5,2,8};
		int n5 = arr5.length;
		x = 7;	
		int res5 = smallestSubWithSum(arr5, n5, x);
		if (res5 == n5 + 1)
			System.out.println("Not Possible");
		else
			System.out.println(res5);
		System.out.println("####################End: Array5 ####################");
	}
}

// This code has been contributed by Mayank Jaiswal 
