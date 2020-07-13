package com.concepts.core.java.java8.functionalinterface;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class PredicateTest {
	public static void main(String[] args) {
		Predicate<Integer> evenNums = (num -> num%2 == 0);
		Predicate<Integer> oddNums = (num -> num%2 != 0);
		Predicate<Integer> pTiveNums = (num -> num > 0);
		
		int[] arr = {2,1,5,2,-10,77,22,3,5,7,3, -4, };
		
		System.out.println("Even Numbers: "+ filter(arr, evenNums));
		System.out.println("Odd Numbers: "+ filter(arr, oddNums));
		System.out.println("+ve Numbers: "+ filter(arr, pTiveNums));		
		System.out.println("-ve Numbers: "+ filter(arr, pTiveNums.negate()));
 	}
	
	public static List<Integer> filter(int[] arr, Predicate<Integer> predicate) {
		List<Integer> result = new ArrayList<>(); 
		for(int i : arr) {
			if(predicate.test(i)) {
				result.add(i);
			}
		}
		return result;
		
	}
}
