package com.concepts.core.java.type.output;

public class FindOutput5 {
	public static void main(String[] args) {
		int mask = 0x000F;
		int value = 0x2222;
		System.out.println(value & mask);
		
		Float f = new Float("10.0");
		int x = f.intValue();
		byte b = f.byteValue();
		double d = f.doubleValue();
		System.out.println(x + b + d);
	}
}
