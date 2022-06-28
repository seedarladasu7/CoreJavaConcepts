package com.concepts.core.java.patterns.number;

public class StringArraySwapping {

	public static void main(String[] args) {
		String str = "aabcccabba";

		int middle = str.length() / 2;
		String s1 = str.substring(0, middle);
		String s2 = str.substring(middle);

		System.out.println("Initial: s1: " + s1);
		System.out.println("Initial: s2: " + s2);

		char[] s1ChArr = new char[s1.length()];
		char[] s2ChArr = new char[s2.length()];

		for (int i = 0; i < s1.length(); i++) {
			s1ChArr[i] = s1.charAt(i);
		}

		for (int i = 0; i < s2.length(); i++) {
			s2ChArr[i] = s2.charAt(i);
		}

		for (int i = s1.length()-1; i >= 0; i--) {
			for (int j = 0; j < s2.length(); j++) {
				if (s1ChArr[i] != s2ChArr[j]) {
					char tempCh = s1.charAt(i);
					s1ChArr[i] = s2ChArr[j];
					s2ChArr[j] = tempCh;
				} else {
					s1ChArr[i] = '\u0000';
					s2ChArr[j] = '\u0000';
				}
			}
		}		

		s1 = new String(s1ChArr).replaceAll("\\u0000", "");
		s1= new String(s2ChArr).replaceAll("\\u0000", "");
		System.out.println("After: s1: " + s1);
		System.out.println("After: s2: " + s2);
		
		String res = s1 + s2;
		System.out.println("res: " + res);
		System.out.println("res: lenght: " + res.length());
	}
}
