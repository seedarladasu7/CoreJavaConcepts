package com.concepts.core.java.serialization.inheritance;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class StaticDataSerialization implements Serializable {
	private static final long serialVersionUID = 1L; // Serial Version UID
	static int i = 100;

	public static void main(String... ar) {
		StaticDataSerialization ob = new StaticDataSerialization();
		System.out.println("At the time of Serialization, static member has value : " + i);
		try {
			FileOutputStream fos = new FileOutputStream("C:\\Users\\Seedarla.Dasu\\TechExamples\\CoreTechConcepts\\src\\resources\\staticData.ser");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(ob);
			oos.close();
			
			//i = 99;
			FileInputStream fis = new FileInputStream("C:\\Users\\Seedarla.Dasu\\TechExamples\\CoreTechConcepts\\src\\resources\\staticData.ser");
			ObjectInputStream ois = new ObjectInputStream(fis);
			ob = (StaticDataSerialization) ois.readObject();
			ois.close();
			System.out.println("After Deserialization, static member has value : " + ob.i);
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}