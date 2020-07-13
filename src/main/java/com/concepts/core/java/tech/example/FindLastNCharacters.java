package com.concepts.core.java.tech.example;

public class FindLastNCharacters {

	public static void main(String[] args) {
		FindLastNCharacters.lastNCharacters();
	}

	public static void lastNCharacters() {
		String s1 = "teacher";
		String s2 = "mother";

		StringBuilder s11 = new StringBuilder();
		StringBuilder s22 = new StringBuilder();
		StringBuilder tempNChars = new StringBuilder();
		StringBuilder lastNChars = new StringBuilder();

		for (int i = s1.length() - 1; i >= 0; i--) {
			s11 = s11.append(s1.charAt(i));
		}

		for (int i = s2.length() - 1; i >= 0; i--) {
			s22 = s22.append(s2.charAt(i));
		}

		int len = s11.length() < s22.length() ? s11.length() : s22.length();

		for (int i = 0; i < len; i++) {
			if (s11.charAt(i) == s22.charAt(i)) {
				tempNChars = tempNChars.append(s11.charAt(i));
			} else
				break;
		}

		for (int i = tempNChars.length() - 1; i >= 0; i--) {
			lastNChars = lastNChars.append(tempNChars.charAt(i));
		}

		System.out.println("last n chars:: " + lastNChars);
	}
}
