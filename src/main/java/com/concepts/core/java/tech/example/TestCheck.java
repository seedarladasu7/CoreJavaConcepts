package com.concepts.core.java.tech.example;

class Exc0 extends Exception {}

class Exc1 extends Exc0 {}

public class TestCheck {

	public static void main(String[] args) {
		
		try {
			throw new Exc1();
		} catch(Exc1 e) {
			System.out.println("Exc0 caught");
		} catch(Exception e) {
			System.out.println("Exception caught");
		} 
	}
}