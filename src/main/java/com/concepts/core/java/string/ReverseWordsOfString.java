package com.concepts.core.java.string;

public class ReverseWordsOfString {
	public static void main(String[] args) {
		String input = "This is java Programming";

		String[] ipArr = input.split(" ");

		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < ipArr.length; i++) {
			String st = reverse(ipArr[i], "");
			if(i < ipArr.length-1) {
				sb.append(st + " ");
			} else {
				sb.append(st);
			}
		}
		System.out.println(sb.toString());
	}

	// calling method
	static String reverse(String str, String rev) {
		for (int i = str.length(); i > 0; --i) {
			rev = rev + (str.charAt(i - 1));
		}
		return rev;
	}
}