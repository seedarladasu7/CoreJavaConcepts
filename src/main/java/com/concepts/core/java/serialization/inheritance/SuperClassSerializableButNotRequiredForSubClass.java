package com.concepts.core.java.serialization.inheritance;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.NotSerializableException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class SuperClass1 implements Serializable {
	private static final long serialVersionUID = 1L; // Serial Version UID
	int i;

	public SuperClass1(int i) {
		this.i = i;
	}
}

class SubClass1 extends SuperClass1 {
	int j;

	public SubClass1(int i, int j) {
		super(i);
		this.j = j;
	}

	private void writeObject(ObjectOutputStream out) throws IOException {
		throw new NotSerializableException();
	}

	private void readObject(ObjectInputStream in) throws IOException {
		throw new NotSerializableException();
	}
}

public class SuperClassSerializableButNotRequiredForSubClass {
	public static void main(String[] args) throws Exception {
		SubClass1 b1 = new SubClass1(100, 200);
		System.out.println("i = " + b1.i);
		System.out.println("j = " + b1.j);

		try {
			FileOutputStream fos = new FileOutputStream(
					"C:\\Users\\Seedarla.Dasu\\TechExamples\\CoreTechConcepts\\src\\resources\\output1.ser");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(b1);
			oos.close();
			fos.close();
			System.out.println("Object has been serialized");
		} catch (NotSerializableException ex) {
			System.out.println(ex.getStackTrace());
		}

		try {
			FileInputStream fis = new FileInputStream(
					"C:\\Users\\Seedarla.Dasu\\TechExamples\\CoreTechConcepts\\src\\resources\\output1.ser");
			ObjectInputStream ois = new ObjectInputStream(fis);
			SubClass1 b2 = (SubClass1) ois.readObject();
			ois.close();
			fis.close();
			System.out.println("Object has been deserialized");
			System.out.println("i = " + b2.i);
			System.out.println("j = " + b2.j);
		} catch (NotSerializableException ex) {
			System.out.println(ex.getStackTrace());
		}
	}
}
