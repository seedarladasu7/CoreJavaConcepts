package com.concepts.core.java.java8.streams;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Spliterator;
import java.util.Spliterators;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

public class ReverseString {

	public static void main(String[] args) {
		System.out.println(strRev("Hello World"));
	}
	public static String strRev(String string) {
		
		
		String reverseStr;
		
		//1st method
		System.out.println("Count of the stream: "+ Stream.of(string).count());
		reverseStr = Stream.of(string).map(word -> new StringBuilder(word).reverse()).collect(Collectors.joining(""));
		
		//2nd method
		Iterator<Character> revIter = string.chars()
	            .mapToObj(item -> new Character((char)item))
	            .collect(Collectors.toCollection(ArrayDeque::new))
	            .descendingIterator();
	            
		reverseStr = StreamSupport
	            .stream(Spliterators.spliteratorUnknownSize(revIter, Spliterator.ORDERED), false)
	            .map(Object::toString)
	            .collect(Collectors.joining(""));
	 
		

		 String[] arr = {"earth", "mars", "mercury"};
		    List<String> ll = Arrays.stream(arr).map(s -> new StringBuilder(s).reverse().toString()).collect(Collectors.toList());
		    System.out.println(ll);
		    
		
		return reverseStr;
	}
}