package com.concepts.core.java.tech.example;

public class TestCalc {

	public static void main(String[] args) {
		int[] testArr = new int[] { 5, 10, 20, 30, 40, 50, 9999 };

		for (int i : testArr) {
			System.out.println(i + ", testCalc(" + i + "): " + testCalc(i));
		}
	}

	public static int testCalc(int d) {
		int i = 1;

		for (i = i * d; i > d; i--) {
			i--;
		}

		return i;
	}
}
