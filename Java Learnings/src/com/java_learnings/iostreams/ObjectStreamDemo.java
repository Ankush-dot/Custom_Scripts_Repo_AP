package com.java_learnings.iostreams;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

@SuppressWarnings("serial")
class Student2 implements Serializable{
	private int rollNo;
	private String name;
	private String dept;
	
	//public Student2() {};
	
	public Student2(int rollNo, String name, String dept) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.dept = dept;
	}

	@Override
	public String toString() {
		return "Student2 [rollNo=" + rollNo + ", name=" + name + ", dept=" + dept + "]";
	}

	
} 

public class ObjectStreamDemo {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
//		FileOutputStream fos = new FileOutputStream("C:\\Users\\Ankus\\Documents\\ObjectStream.txt");
//		ObjectOutputStream oos = new ObjectOutputStream(fos);
//		
//		Student2 s1 = new Student2(10, "Ankush", "IT");
//		oos.writeObject(s1);
//		oos.close();
//		fos.close();
		
		FileInputStream fis = new FileInputStream("C:\\Users\\Ankus\\Documents\\ObjectStream.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		Student2 s2;
		
		s2 = (Student2)ois.readObject();
		
		System.out.println(s2);
		
		ois.close();
		fis.close();
	}

}
