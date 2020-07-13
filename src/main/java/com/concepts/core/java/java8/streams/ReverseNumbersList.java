package com.concepts.core.java.java8.streams;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ReverseNumbersList {

	public static void main(String[] args) {
		List<Integer> numList = Arrays.asList(10, 23, 44, 21, 76, 11, 3, 965, 223, 33);
		
		// 1st method to reverse the list
		//ReverseListNumbers.reverseHelperMethod1(numList);
		
		//3rd method to reverse the list
		ReverseNumbersList.reverseHelperMethod2(numList);
		
		//2. method to sort the list in descending order
		//ReverseListNumbers.sortHelperMethod2(numList);
	}

	public static <T> void reverseHelperMethod1(List<T> list){
		list.stream()
		.sorted((x,y)-> -1)
		.collect(Collectors.toList())
		.forEach(System.out::println);
	}
	
	public static <T> void reverseHelperMethod2(List<T> list){ 
		list.parallelStream() 
		.sorted((x,y)->-1) 
		.collect(Collectors.toList()) 
		.forEach(System.out::println); 
	}
	
	public static <T> void sortHelperMethod2(List<T> list) {
		list.stream()
		.sorted(Collections.reverseOrder())
		.collect(Collectors.toList())
		.forEach(System.out::println);
	}
	
	
}
