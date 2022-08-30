package com.concepts.core.java.java8.streams;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ListStrOrNumSorting {

	public static void main(String[] args) {
		List<Integer> numList = Arrays.asList(10, 23, -4, 0, 18);
		System.out.println("Unordered numList" + numList);
		
		List<Integer> sortedNumList = numList.stream().sorted().collect(Collectors.toList());
		System.out.println("Ordered numList ASC: " + sortedNumList);
		
		sortedNumList = numList.stream().sorted(Collections.reverseOrder()).collect(Collectors.toList());
		System.out.println("Ordered numList DESC: " + sortedNumList);

		List<String> strList = Arrays.asList("John", "Mark", "Robert", "Lucas", "Brandon");
		System.out.println("Unordered strList" + strList);
		
		List<String> sortedStrList = strList.stream().sorted().collect(Collectors.toList());
		System.out.println("Unordered strList ASC: " + strList);
		
		sortedStrList = strList.stream().sorted(Collections.reverseOrder()).collect(Collectors.toList());
		System.out.println("Ordered strList DESC: " + sortedStrList);

	}

}
