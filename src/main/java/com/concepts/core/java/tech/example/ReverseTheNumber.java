package com.concepts.core.java.tech.example;

public class ReverseTheNumber {

	public static void main(String[] args) {
		double input = -123.4;
		boolean tmp = false;
		if (input < 0) {
			input = input * (-1);
			tmp = true;
		}
		String s = String.valueOf(input);
		System.out.println("s:" + s);
		char[] c = new char[s.length()];
		int lenToConsider = s.length() - 1;
		for (int i = lenToConsider; i >= 0; i--) {
			c[lenToConsider - i] = s.charAt(i);
		}
		String reverse = new String(c);
		System.out.println("reverse:" + reverse);
		double result = Double.parseDouble(reverse);
		if (tmp) {
			result = result * (-1);
		}
		System.err.println(result);

	}

}
