package com.concepts.core.java.string;

public class PermuteString {

	public static void main(String[] args) {
		String str = "GEEK";
		int len = str.length();
		System.out.println("All the permutations of the string are: ");
		//generatePermutation(str, 0, len);

		printPermutn(str, "");
	}

	// Function for generating different permutations of the string
	public static void generatePermutation(String str, int start, int end) {
		// Prints the permutations
		if (start == end - 1) {
			System.out.println(str);
		} else {
			for (int i = start; i < end; i++) {
				// Swapping the string by fixing a character
				str = swapString(str, start, i);
				// Recursively calling function generatePermutation() for rest of the characters
				generatePermutation(str, start + 1, end);
				// Backtracking and swapping the characters again.
				str = swapString(str, start, i);
			}
		}
	}

	// Function for swapping the characters at position I with character at position
	// j
	public static String swapString(String a, int i, int j) {
		char[] b = a.toCharArray();
		char ch = b[i];
		b[i] = b[j];
		b[j] = ch;
		return String.valueOf(b);
	}

	// Function to print all the permutations of str
	static void printPermutn(String str, String ans) {
		// If string is empty
		if (str.length() == 0) {
			System.out.println(ans);
			return;
		}

		for (int i = 0; i < str.length(); i++) {
			// ith character of str
			char ch = str.charAt(i);
			// Rest of the string after excluding the ith character
			String ros = str.substring(0, i) + str.substring(i + 1);
			// Recursive call
			printPermutn(ros, (ans+ch));
		}
	}

}
