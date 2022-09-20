package com.concepts.core.java.serialization;

import java.io.*;

class Persists {
	public static void main(String args[]) {
		try {
			Employee emp1 = new Employee(20110, "John");
			Employee emp2 = new Employee(22110, "Jerry");
			Employee emp3 = new Employee(20120, "Sam");
			
			FileOutputStream fout = new FileOutputStream("C:\\Users\\Seedarla.Dasu\\TechExamples\\CoreTechConcepts\\src\\resources\\output.txt");
			ObjectOutputStream out = new ObjectOutputStream(fout);
			out.writeObject(emp1);
			out.writeObject(emp2);
			out.writeObject(emp3);
			out.flush();
			out.close();
			System.out.println("Serialization is been successfully executed");
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}