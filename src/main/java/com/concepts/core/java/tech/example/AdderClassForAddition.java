package com.concepts.core.java.tech.example;

import java.util.Scanner;

public class AdderClassForAddition {

	public static void main(String[] args) {
		int a;
		int b;
		
		String s1;
		String s2;

		/*
		 * a = Integer.parseInt(args[0]); b = Integer.parseInt(args[1]);
		 */
		
		String[][] twoDimArr = {{"", "", ""}, {"", "", "", ""}};
		Scanner in = new Scanner(System.in); 
 
		/*
		 * System.out.println("Enter a string"); a
		 * = in.nextInt(); System.out.println("You entered string " + a);
		 * 
		 * System.out.println("Enter an integer"); b = in.nextInt();
		 * System.out.println("You entered integer " + b);
		 * 
		 * System.out.println("The sum is: " + add(a, b));
		 */
		System.out.println("Enter 1 String:");
		s1 = in.nextLine();
		System.out.println("You entered integer " + s1);

		System.out.println("Enter 2 String: ");
		s2 = in.nextLine();
		System.out.println("You entered integer " + s2);
		System.out.println("The sum is: " + add(Integer.parseInt(s1), Integer.parseInt(s2)));
	}

	private static int add(int a, int b) {
		return a + b;
	}
}
