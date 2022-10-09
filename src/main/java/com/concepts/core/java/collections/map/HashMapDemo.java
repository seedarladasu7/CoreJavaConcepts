package com.concepts.core.java.collections.map;
// Java code to illustrate the put() method 
import java.util.*; 

public class HashMapDemo { 
	public static void main(String[] args) 
	{ 

		// Creating an empty HashMap 
		HashMap<Integer, String> hash_map = new HashMap<Integer, String>(); 

		// Mapping string values to int keys 
		hash_map.put(10, "Geeks"); 
		hash_map.put(15, "4"); 
		hash_map.put(20, "Geeks"); 
		hash_map.put(25, "Welcomes"); 
		hash_map.put(30, "You"); 

		// Displaying the HashMap 
		//System.out.println("Initial Mappings are: " + hash_map); 

		// Inserting existing key along with new value 
		String returned_value = (String)hash_map.put(30, "All"); 

		// Verifying the returned value 
		System.out.println("Returned value is: " + returned_value); 

		// Displaying the new map 
		System.out.println("New map is: " + hash_map); 
		
		HashMap<Integer, Object> intHashMap = new HashMap<>();
		
		intHashMap.put(100,  200);
		intHashMap.put(200,  400);
		intHashMap.put(500,  600);
		intHashMap.put(800,  "900Hello");
		
		System.out.println("Initial map is: " + intHashMap); 
		
		Object retVal =  intHashMap.put(800,  700);
		System.out.println("Returned value is: " + retVal); 
		System.out.println("New map is: " + intHashMap); 
		
	} 
} 
