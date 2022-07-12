package com.concepts.core.java.type.output;

import java.util.Arrays;
import java.util.Comparator;

public class FindOutput3 implements Comparator<FindOutput3> {

	int dishSize;

	FindOutput3(int d) {
		dishSize = d;
	}

	public static void main(String[] args) {
		FindOutput3[] va = { new FindOutput3(40), new FindOutput3(200), new FindOutput3(60) };
		Arrays.sort(va, va[0]);
		int index = Arrays.binarySearch(va, new FindOutput3(40), va[0]);
		System.out.println(index + " ");
		index = Arrays.binarySearch(va, new FindOutput3(80), va[0]);
		System.out.println(index);
	}

	@Override
	public int compare(FindOutput3 o1, FindOutput3 o2) {
		return o2.dishSize - o1.dishSize;
	}
}
