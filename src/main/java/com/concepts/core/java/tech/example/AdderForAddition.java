package com.concepts.core.java.tech.example;

import java.util.Scanner;

abstract class Calculator1 {
	abstract int add(int a, int b);
}

class Adder extends Calculator1 {
	int add(int a, int b) {
		return a+b;
	}	
}

public class AdderForAddition {
	public static void main(String[] args) {
		int a, b;
		try (Scanner scan = new Scanner(System.in)) {
			a = scan.nextInt();
			b = scan.nextInt();
		}

		Calculator1 adderObject = new Adder();
		System.out.println("The sum is: " + adderObject.add(a, b));
	}
}
