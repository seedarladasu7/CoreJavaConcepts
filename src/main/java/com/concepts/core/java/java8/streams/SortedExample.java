package com.concepts.core.java.java8.streams;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortedExample {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(2, 4, 1, 3, 7, 5, 9, 6, 8);

		// Example1
		List<Integer> sortedList = list.stream().sorted().collect(Collectors.toList());
		System.out.println("Example1: " + sortedList);

		// Example2
		List<Integer> revSortedList = list.stream().sorted(Collections.reverseOrder()).collect(Collectors.toList());
		System.out.println("Example2: " + revSortedList);

		// Example3
		Comparator<Integer> intCompForRev = new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				return o2.compareTo(o1);
			}
		};

		List<Integer> revSortedListWithComp = list.stream().sorted(intCompForRev).collect(Collectors.toList());
		System.out.println("Example3: " + revSortedListWithComp);

		// Example4
		List<Integer> revSortedListWithLambda = list.stream().sorted((o1, o2) -> o1.compareTo(o2)).collect(Collectors.toList());
		System.out.println("Example4: " + revSortedListWithLambda);
	}
}
