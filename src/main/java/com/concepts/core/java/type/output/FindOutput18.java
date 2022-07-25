package com.concepts.core.java.type.output;

public class FindOutput18 {

	public static void main(String[] args) {
		FindOutput18 fop18 = new FindOutput18();
		fop18.divide(4, 0);
	}

	public int divide(int a, int b) {
		int c = -1;

		try {
			c = a / b;
		} catch (Exception e) {
			System.err.print("Exception ");
		} finally {
			System.err.println("Finally ");
		}

		return c;
	}

}
