package com.concepts.core.java.type.output;

public class FindOutput15 {
	String name;

	FindOutput15(String n) {
		name = n;
	}

	public static void main(String[] args) {
		FindOutput15 m1 = new FindOutput15("guitar");
		FindOutput15 m2 = new FindOutput15("tv");
		System.out.println(m2.equals(m1));
	}

	@Override
	public boolean equals(Object obj) {
		FindOutput15 m = (FindOutput15) obj;
		if (m.name != null) {
			return true;
		}
		return false;
	}
}