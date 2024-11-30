package com.java_learnings.basic.oops.io;

import java.util.Arrays;

import javax.security.auth.Subject;

class Student
{
	private int rollNo;
	private String name;
	private String dept;
	private String Subject[] = {"Java","Probablity","Data Structure","Alogrithams"};
	
	public Student(int rollNo, String name, String dept)
	{
		this.rollNo = rollNo;
		this.name = name;
		this.dept = dept;
		//this.Subject = Subject;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public String[] getSubjects() {
		return Subject;
	}

	public void setSubjects(String[] subjects) {
		Subject = subjects;
	}

	public int getRollNo() {
		return rollNo;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "\nStudent \n[rollNo=" + rollNo + ", name=" + name + ", dept=" + dept + ", Subjects="
				+ Arrays.toString(Subject) + "]";
	}
	
	
}
public class StudentsDetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student stu = new Student(101, "Ankush Pawar", "CS-IT");
		
		for(String s : stu.getSubjects())
			System.out.println(s);
		

	}

}
