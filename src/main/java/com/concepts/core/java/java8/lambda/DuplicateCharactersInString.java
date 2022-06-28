package com.concepts.core.java.java8.lambda;

import java.util.LinkedHashMap;
import java.util.Map;

public class DuplicateCharactersInString {
	public static void main(String[] args) {
		printCountOfDuplicateCharMapCompute("bbbcccccddddddaaaa");
		printCountOfDuplicateCharMapCompute("##^$!%^$!^%@!$^@!kds");

	}

	// Using hashmap : print count of each character in a given string.
	private static void printCountOfDuplicateCharMapCompute(String input) {
		Map<Character, Integer> output = new LinkedHashMap<>();
		for (int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);
			output.compute(ch, (key, value) -> (value == null) ? 1 : value + 1);
		}
		System.out.println(output);
	}
}
