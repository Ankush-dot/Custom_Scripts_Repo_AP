package com.java.codeTest;

class WhiteBoard{
	String text;
	int noOfStudents = 0;
	int count = 0;
	
	public void attendance() {
		noOfStudents++;
	}
	synchronized public void write(String msg) {
		System.out.println("Teacher is Writing " + msg);
		while(count != 0) 
			try {wait();} catch (InterruptedException e) {}
		text = msg;
		count = noOfStudents;
		notifyAll();
		
	}
	synchronized public String read() {
		while(count==0) 
			try {wait();} catch (InterruptedException e) {}
		String t = text;
		count--;
		if(count==0) 
			notify();
		return t;
	}
}

class Teacher extends Thread
{
	WhiteBoard wb;
	
	String notes[]= {"Java is a programming langauge","it is a object oriented language","it supports threads","end"};
	public Teacher(WhiteBoard w) {
		wb = w;
	}
	
	public void run() {
		for(int i=0;i<notes.length;i++) {
			wb.write(notes[i]);
		}
	}
	
}

class Student extends Thread
{
	String name;
	WhiteBoard wb;
	
	public Student(String n, WhiteBoard w) {
		name = n;
		wb = w;
	}
	
	public void run() {
		String text;
		wb.attendance();
		
		do
		{
			text =wb.read();
			System.out.println(name + "Reading " + text);
			System.out.flush();
		}while(!text.equals("end"));
	}
}


public class TeacherStudentProblemDemo {

	public static void main(String[] args) {
		
		WhiteBoard wb = new WhiteBoard();
		Teacher t = new Teacher(wb);
		
		Student s1 = new Student("1. Ankush",wb);
		Student s2 = new Student("2. Nagesh",wb);
		Student s3 = new Student("3. Yogesh",wb);
		Student s4 = new Student("4. Pramod",wb);
		
		t.start();
		
		s1.start();
		s2.start();
		s3.start();
		s4.start();
		
	}

}
