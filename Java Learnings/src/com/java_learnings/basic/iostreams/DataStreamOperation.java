package com.java_learnings.basic.iostreams;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

class Student1{
	int rollNo;
	String name;
	String dept;
} 
public class DataStreamOperation {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
//		FileOutputStream fos = new FileOutputStream("C:\\Users\\Ankus\\Documents\\text1.txt");
//		DataOutputStream ds = new DataOutputStream(fos);
//		
//		
//		Student1 s = new Student1();
//		s.rollNo=10;
//		s.name="Ankush"; 
//		s.dept = "CSE";
//		
//		ds.writeInt(s.rollNo);
//		ds.writeUTF(s.name);
//		ds.writeUTF(s.dept);
//		
//		ds.close();
//		fos.close();
		
		FileInputStream fis = new FileInputStream("C:\\Users\\Ankus\\Documents\\text1.txt");
		DataInputStream ds = new DataInputStream(fis);
		
		Student1 s = new Student1();
		s.rollNo = ds.readInt();
		s.name = ds.readUTF();
		s.dept = ds.readUTF();
		
		System.out.println("Roll No: " + s.rollNo);
		System.out.println("Name : " + s.name);
		System.out.println("Dept : " + s.dept);
		
		ds.close();
		fis.close();
		
}
}
