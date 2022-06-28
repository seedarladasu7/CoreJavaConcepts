package com.concepts.core.java.patterns.number;

import java.util.stream.IntStream;

public class PrimeNumbers {

	public static void main(String[] args) {
		for (int i = 1; i < 1000; i++) {
			if (isPrime(i)) {
				System.out.println(i);
			}
		}
	}

	public static boolean isPrime(int number) {
		return IntStream.rangeClosed(2, number / 2).noneMatch(i -> number % i == 0);
	}
}
