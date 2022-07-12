package com.concepts.core.java.type.output;

public class FindOutput10 {
	public static void main(String args[]) {
		String s1 = "abc";
		String s2 = s1;
		s1 += "d";
		System.out.println(s1 + " " + s2 + " " + (s1 == s2));

		StringBuffer sb1 = new StringBuffer("abc");
		StringBuffer sb2 = sb1;
		sb1.append("d");
		//sb1.append("k");
		System.out.println(sb1 + " " + sb2 + " " + (sb1 == sb2));
	}
}