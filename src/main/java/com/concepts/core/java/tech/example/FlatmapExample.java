package com.concepts.core.java.tech.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatmapExample {
	public static void main(String args[]) {
		
		//creating ArrayList      
		List<String> productlist1 = Arrays.asList("Printer", "Mouse", "Keyboard", "Motherboard");
		List<String> productlist2 = Arrays.asList("Scanner", "Projector", "Light Pen");
		List<String> productlist3 = Arrays.asList("Pen Drive", "Charger", "WIFI Adapter", "Cooling Fan");
		List<String> productlist4 = Arrays.asList("CPU Cabinet", "WebCam", "USB Light", "Microphone", "Power cable");
		
		List<List<String>> allproducts = new ArrayList<List<String>>();
		//adding elements to the list  
		allproducts.add(productlist1);
		allproducts.add(productlist2);
		allproducts.add(productlist3);
		allproducts.add(productlist4);
		
		//creating a list of all products  
		List<String> listOfAllProducts = new ArrayList<String>();
		//for each loop iterates over the list  
		for (List<String> pro : allproducts) {
			for (String product : pro) {
				//adds all products to the list      
				listOfAllProducts.add(product);
			}
		}
		System.out.println("List Before Applying mapping and Flattening: "+listOfAllProducts);
		
		System.out.println();
		
		//creates a stream of elements using flatMap()  
		List<String> flatMapList = allproducts.stream().flatMap(pList -> pList.stream()).collect(Collectors.toList());
		System.out.println("List After Applying Mapping and Flattening Operation: "+flatMapList);
		
	}
}