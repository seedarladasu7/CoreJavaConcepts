package com.concepts.core.java.tech.example;

import java.util.HashMap;
import java.util.List;

public class IncrementsEx1 {
	
	public static void main(String[] args) {
		
		float ft = 10.6f;
		List<HashMap<String, Integer>> myList1;
		
		//List<int> myList2;
		
		Double[] dbArr = {10.2, 10.5};
		
		
		int result, x;
		x = 1;
		result = 0;
		while (x <= 10) {
			if(x%2 == 0) {
				result += x;				
			}
			++x;
		}
		
		System.out.println(result);
	}

}
