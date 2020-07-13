package com.concepts.core.java.exception;

public class ExceptionTest1 {
	
	public static void foo() {
		try {		
			
			int[] a = new int[0];
			String[] myArr = new String[0];
			throw new ArrayIndexOutOfBoundsException();			
		} catch(ArrayIndexOutOfBoundsException ex) {
			RuntimeException re = new RuntimeException(ex);
			re.initCause(ex);
			throw re;
		}
	}
	
	public static void main(String[] args) {
		try {
			foo();
		} catch(Exception ex) {
			System.out.println(ex.getClass());
		}
	}

}
