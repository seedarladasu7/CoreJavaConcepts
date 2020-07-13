package com.concepts.core.java.tech.example;

import java.util.*;

public class CandidateCode {
	public static void main(String[] args) {
		Integer[] studebtsAttended = { 1, 2, 3, 3, 4, 6, 4 };
		Set<Integer> uniques = new HashSet<>(Arrays.asList(studebtsAttended));
		int max = studebtsAttended.length;
		for (int i = 1; i < max; i++) {
			if (!uniques.contains(i)) {
				System.out.print(i + " ");
			}
			if ((max == (i + 1)) && !uniques.contains(max)) {
				System.out.println(max);
			}
		}
	}
}
