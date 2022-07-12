package com.concepts.core.java.type.output;


class Exc0 extends Exception {}
class Exc1 extends Exc0 {}
public class FindOutput2 {
	
	public static void main(String[] args) {
		try {
			throw new Exc1();
		} catch (Exc0 e) {
			System.out.println("Exc0 cought");
		} catch (Exception e) {
			System.out.println("Exception cought");
		}
	}

}
