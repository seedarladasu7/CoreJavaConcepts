package com.concepts.core.java.java8.functionalinterface;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class AddNumbers {

	public static void main(String args[]) {
		int x = 10;
		int y = 25;

		List<Integer> intList = Arrays.asList(x, y);
		float val = (intList.stream().mapToInt(i -> i.intValue()).sum()) / intList.size();
		System.out.println("avg:"+val);
		
		int sm = intList.stream().collect(Collectors.summingInt(Integer::intValue));
		System.out.println("sm:"+sm);
		
		
		int sm1 = intList.stream().reduce(0, (a,b)-> a+b);
		System.out.println("sm1:"+sm1);
	}

}
