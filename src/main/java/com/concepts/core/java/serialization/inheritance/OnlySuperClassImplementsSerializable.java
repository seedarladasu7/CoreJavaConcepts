package com.concepts.core.java.serialization.inheritance;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class SuperClass2 implements Serializable {
	private static final long serialVersionUID = 1L; // Serial Version UID
	int i;
	public SuperClass2(int i) {
		this.i = i;
	}
}

class SubClass2 extends SuperClass2 {
	private static final long serialVersionUID = 1L; // Serial Version UID
	int j;
	public SubClass2(int i, int j) {
		super(i);
		this.j = j;
	}
}

public class OnlySuperClassImplementsSerializable {
	public static void main(String[] args) throws Exception {
		SubClass2 b1 = new SubClass2(200, 400);
		System.out.println("i = " + b1.i);
		System.out.println("j = " + b1.j);
		FileOutputStream fos = new FileOutputStream("C:\\Users\\Seedarla.Dasu\\TechExamples\\CoreTechConcepts\\src\\resources\\abc.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(b1);
		oos.close();
		fos.close();
		System.out.println("The object has been serialized");
		
		FileInputStream fis = new FileInputStream("C:\\Users\\Seedarla.Dasu\\TechExamples\\CoreTechConcepts\\src\\resources\\abc.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		SubClass2 b2 = (SubClass2) ois.readObject();
		ois.close();
		fis.close();
		System.out.println("The object has been deserialized");
		System.out.println("i = " + b2.i);
		System.out.println("j = " + b2.j);
	}
}
