package com.concepts.core.java.java8.lambda;

import java.security.PrivilegedAction;
import java.util.concurrent.Callable;

public class OverloadResolutionAndArgumentInference {

	public static void main(String[] args) {
		execute(() -> {String st = "Done";});
		execute(() -> "Done");
	}
	
	static void execute(Runnable runnable) {
		System.out.println("Executing Runnable...");
	}
	
	static void execute(Callable<String> callable) {
		System.out.println("Executing Callable...");
	}

	//Compile time exception: The method execute(Callable<String>) is ambiguous for the type OverloadResolutionAndArgumentInference
	/*static void execute(PrivilegedAction<String> action) {
		System.out.println("Executing PrivilegedAction...");
	}*/
}
