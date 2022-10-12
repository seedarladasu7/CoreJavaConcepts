package com.concepts.core.java.tech.example;

import java.util.Scanner;
import java.util.stream.IntStream;

class StringPalindorme {
	
	public static boolean isPalindrome(String s) {
		System.out.println("String: " + s);
		if (s.length() == 0 || s.length() == 1)
			return true;
		if (s.charAt(0) == s.charAt(s.length() - 1)) {
			return isPalindrome(s.substring(1, s.length() - 1));
		}

		return false;
	}

	public static boolean isPalindromeJava8(String originalString) {

		String tempString = originalString.replaceAll("\\s+", "").toLowerCase();

		return IntStream.range(0, tempString.length() / 2)
				.allMatch(i -> tempString.charAt(i) == tempString.charAt(tempString.length()-1 - i));

	}

	public static void main(String[] args) {
		Scanner snr = new Scanner(System.in);
		System.out.println("Enter the String for check:");
		String string = snr.nextLine();
		if (isPalindrome(string.toLowerCase())) {
			System.out.println("Using java: "+ string + " is a palindrome");
		} else {
			System.out.println("Using java: "+ string + " is not a palindrome");
		}		
		
		System.out.println("");
		
		if (isPalindromeJava8(string)) {
			System.out.println("Using java8: "+ string + " is a palindrome");
		} else {
			System.out.println("Using java8: "+ string + " is not a palindrome");
		}
		
		System.out.println("");
		
		String reverseStr = "";
	    
	    int strLength = string.length();

	    for (int i = (strLength - 1); i >= 0; i--) {
	      reverseStr = reverseStr + string.charAt(i);
	    }

	    if (string.toLowerCase().equals(reverseStr.toLowerCase())) {
	      System.out.println("Using normal: "+ string + " is a Palindrome String.");
	    }
	    else {
	      System.out.println("Using normal: "+ string + " is not a Palindrome String.");
	    }
		snr.close();
		
	}
}