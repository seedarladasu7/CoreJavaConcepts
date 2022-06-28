package com.concepts.core.java.java8.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FindDuplicateElementsInList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> intList = Arrays.asList(10, 20, 30, 10, 30, 10, 40, 50);

		Set<Integer> intSet = new HashSet<>();
		
		Set<Integer> duplicates = new HashSet<>();
		for (Integer i : intList) {
			if (intSet.add(i) == false) {
				duplicates.add(i);
			}
		}

		System.out.println("1.Duplicate data: " + duplicates);
		
		intList = Arrays.asList(10, 20, 30, 10, 30, 10, 40, 50);
		
		Set<Integer> duplicates1 = new HashSet<>();
		duplicates = intList.stream().filter(i -> !duplicates1.add(i)).collect(Collectors.toSet());
		
		System.out.println("2.Duplicate data: " + duplicates);
		
		List<Integer> intList1 = Arrays.asList(10, 20, 30, 10, 30, 10, 40, 50);		
		duplicates = intList.stream().filter(i -> Collections.frequency(intList1, i) > 1).collect(Collectors.toSet());
		System.out.println("3.Duplicate data: " + duplicates);
		
		List<Integer> intList2 = Arrays.asList(10, 20, 30, 10, 30, 10, 40, 50);		
		duplicates = intList2.stream().distinct().collect(Collectors.toSet());
		System.out.println("4.Unique data: " + duplicates);
		
		
		String str = "JAVA";
		char[] chrAyy = str.toCharArray(); 
		
		List<String> stArr= new ArrayList<>();
		for(int i=0; i< chrAyy.length; i++ ) {
			stArr.add(String.valueOf(chrAyy[i]));			
		}
		
		

	}

}
