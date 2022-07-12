package com.concepts.core.java.type.output;

class Alpha {
	public String type = "a ";

	public Alpha() {
		System.out.print("alpha ");
	}
}

public class FindOutput16 extends Alpha {
	public FindOutput16() {
		System.out.print("beta ");
	}

	void go() {
		type = "b ";
		System.out.print(this.type + super.type);
	}

	public static void main(String[] args) {
		new FindOutput16().go();
	}
}
