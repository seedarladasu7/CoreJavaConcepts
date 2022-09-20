package com.concepts.core.java.serialization.inheritance;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;;

class SuperClass {
	int i;
	public SuperClass(int i) {
		this.i = i;
	}
	public SuperClass() {
		i = 50;
		System.out.println("Superclass constructor called");
	}
}

class SubClass extends SuperClass implements Serializable {
	private static final long serialVersionUID = 1L; // Serial Version UID
	int j;
	public SubClass(int i, int j) {
		super(i);
		this.j = j;
	}
}

public class OnlySubClassImplementsSerializable {
	public static void main(String[] args) throws Exception {
		SubClass b1 = new SubClass(10, 20);
		System.out.println("i = " + b1.i);
		System.out.println("j = " + b1.j);
		FileOutputStream fos = new FileOutputStream("C:\\Users\\Seedarla.Dasu\\TechExamples\\CoreTechConcepts\\src\\resources\\output.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(b1);
		oos.close();
		fos.close();
		System.out.println("The object has been serialized");
		
		FileInputStream fis = new FileInputStream("C:\\Users\\Seedarla.Dasu\\TechExamples\\CoreTechConcepts\\src\\resources\\output.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		SubClass b2 = (SubClass) ois.readObject();
		ois.close();
		fis.close();
		System.out.println("The object has been deserialized");
		System.out.println("i = " + b2.i);
		System.out.println("j = " + b2.j);
	}
}