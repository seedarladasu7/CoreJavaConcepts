package com.concepts.core.java.serialization;

import java.io.*;

class Depersists {
	public static void main(String args[]) {
		try {
			ObjectInputStream in = new ObjectInputStream(new FileInputStream("C:\\Users\\Seedarla.Dasu\\TechExamples\\CoreTechConcepts\\src\\resources\\output.txt"));
			Employee e1 = (Employee) in.readObject();
			Employee e2 = (Employee) in.readObject();
			Employee e3 = (Employee) in.readObject();
			System.out.println("Deserialization is been successfully executed");
			System.out.println(e1.id + " " + e1.name);
			System.out.println(e2.id + " " + e2.name);
			System.out.println(e3.id + " " + e3.name);
			in.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}