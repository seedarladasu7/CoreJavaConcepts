package com.concepts.core.java.serialization.inheritance;

import java.io.Externalizable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

class User implements Externalizable {
	private String name;
	private int age;

	public User() {
	}

	public User(String userName, int age) {
		this.name = userName;
		this.age = age;
	}

	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		name = (String) in.readObject();
		age = in.readInt();
	}

	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		out.writeObject(name);
		out.writeInt(age);
	}

	public String getUserName() {
		return name;
	}

	public void setUserName(String userName) {
		this.name = userName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}

public class ExternalizationExample {
	public static void main(String... args) throws Exception, IOException {
		ObjectInputStream in = null;
		ObjectOutputStream out = null;
		
		try {
			File f = new File("C:\\Users\\Seedarla.Dasu\\TechExamples\\CoreTechConcepts\\src\\resources\\Test.ser");
			User u = new User("JavaTpoint", 25);
			out = new ObjectOutputStream(new FileOutputStream(f));
			out.writeObject(u);
			System.out.println("Serialization is completed");
			
			in = new ObjectInputStream(new FileInputStream(f));
			u = (User) in.readObject();
			System.out.println("After De externalization username: " + u.getUserName() + " and age is:" + u.getAge());
		} catch (IOException ex) {
			out.close();
			in.close();
			System.out.println(ex.getStackTrace());
		}
	}
}
