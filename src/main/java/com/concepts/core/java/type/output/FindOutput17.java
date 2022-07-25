package com.concepts.core.java.type.output;

public final class FindOutput17 {
	class Inner {
		void test() {
			if (FindOutput17.this.flag) {
				sample();
			}
		}
	}

	private boolean flag = true;

	public void sample() {
		System.out.println("Sample");
	}

	public FindOutput17() {
		(new Inner()).test();
	}

	public static void main(String args[]) {
		new FindOutput17();
	}
}
