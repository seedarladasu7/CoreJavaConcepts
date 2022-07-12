package com.concepts.core.java.type.output;

public class FindOutput7 {

	private static int x;

	public static void main(String args[]) {
		System.out.println(fun());
	}
	/*
	 * int fun() { return 20; }
	 */

	/*
	 * static int fun() { static int x = 0; return ++x; }
	 */
	static int fun() {
		return ++x;
	}

}
