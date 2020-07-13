package com.concepts.core.java.designpatterns.singleton;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class TestSingleton {

	public static void main(String[] args) throws CloneNotSupportedException, InstantiationException,
			IllegalAccessException, IllegalArgumentException, InvocationTargetException, IOException, ClassNotFoundException {

		EagerSingleton eSInstance1 = EagerSingleton.getInstance();
		EagerSingleton eSInstance2 = EagerSingleton.getInstance();

		System.out.println("EagerSingleton eSInstance1: " + eSInstance1.hashCode());
		System.out.println("EagerSingleton eSInstance2: " + eSInstance2.hashCode());
		System.out.println("");

		LazySingleton lSInstance1 = LazySingleton.getInstance();
		LazySingleton lSInstance2 = LazySingleton.getInstance();
		// LazySingleton lSInstance3 = (LazySingleton) lSInstance1.clone();

		System.out.println("LazySingleton lSInstance1: " + lSInstance1.hashCode());
		System.out.println("LazySingleton lSInstance2: " + lSInstance2.hashCode());
		// System.out.println("LazySingleton lSInstance3: "+lSInstance3.hashCode());

		/*
		 * LazySingleton reflInstance = null;
		 * 
		 * Constructor[] constructrs = LazySingleton.class.getDeclaredConstructors();
		 * 
		 * for (Constructor constr : constructrs) { constrs.setAccessible(false);
		 * reflInstance = (LazySingleton) constr.newInstance(); }
		 * System.out.println("LazySingleton reflInstance: " + reflInstance.hashCode());
		 */
		
		ObjectOutputStream oOutputStream = new ObjectOutputStream(new FileOutputStream("LazySingleton.ser"));
		oOutputStream.writeObject(lSInstance1);
		oOutputStream.close();
		
		ObjectInputStream oInputStream = new ObjectInputStream(new FileInputStream("LazySingleton.ser"));
		LazySingleton serInstanse = (LazySingleton) oInputStream.readObject();
		oInputStream.close();
		System.out.println("LazySingleton serInstanse: " + serInstanse.hashCode());
		
		System.out.println("");

		DoubleCheckingLazySingleton dCLSInstance1 = DoubleCheckingLazySingleton.getInstance();
		DoubleCheckingLazySingleton dCLSInstance2 = DoubleCheckingLazySingleton.getInstance();

		System.out.println("DoubleCheckingLazySingleton dCLSInstance1: " + dCLSInstance1.hashCode());
		System.out.println("DoubleCheckingLazySingleton dCLSInstance2: " + dCLSInstance2.hashCode());
		System.out.println("");

		LazyInnerClassSingleton lICSInstance1 = LazyInnerClassSingleton.getInstance();
		LazyInnerClassSingleton lICSInstance2 = LazyInnerClassSingleton.getInstance();

		System.out.println("LazyInnerClassSingleton lICSInstance1: " + lICSInstance1.hashCode());
		System.out.println("LazyInnerClassSingleton lICSInstance1: " + lICSInstance2.hashCode());

	}

}
