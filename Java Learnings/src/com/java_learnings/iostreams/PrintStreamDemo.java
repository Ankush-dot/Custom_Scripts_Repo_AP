package com.java_learnings.iostreams;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;


class Student{
	int rollNo;
	String name;
	String dept;
}
public class PrintStreamDemo {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		/*FileOutputStream fos = new FileOutputStream("C:\\Users\\Ankus\\Documents\\text.txt");
		PrintStream ps = new PrintStream(fos);
		
		Student s = new Student();
		s.rollNo=10;
		s.name="Ankush";
		s.dept = "CSE";
		
		ps.println(s.rollNo);
		ps.println(s.name);
		ps.println(s.dept);
		
		ps.close();
		fos.close();*/
		
		FileInputStream fis = new FileInputStream("C:\\Users\\Ankus\\Documents\\text.txt");
		BufferedReader br = new BufferedReader(new InputStreamReader(fis));
		
		Student s = new Student();
		s.rollNo = Integer.parseInt(br.readLine());
		s.name = br.readLine();
		s.dept = br.readLine();
		
		System.out.println("Roll No: " + s.rollNo);
		System.out.println("Name : " + s.name);
		System.out.println("Dept : " + s.dept);
		
		br.close();
		fis.close();
		
}
}
