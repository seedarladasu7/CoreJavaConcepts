package com.concepts.core.java.type.output;

import java.util.Arrays;
import java.util.Comparator;

public class FindOutput4 {
	public static void main(String[] args) {
		String[] cities = { "Pune", "Bangalore", "San Francisco", "New York City" };
		MySort ms = new MySort();
		Arrays.sort(cities, ms);
		System.out.println(Arrays.binarySearch(cities, "New York City"));
	}

	static class MySort implements Comparator<String> {
		public int compare(String o1, String o2) {
			return o2.compareTo(o1);
		}
	}
}
