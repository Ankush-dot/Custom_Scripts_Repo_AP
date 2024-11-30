package com.java_learnings.basic.statickeyword.io;

class  Student{
	int rollNo;
	String name;
	int marks;
	static String schoolName;
	
	public void show(){
		System.out.println("School Name : " + schoolName);
		System.out.println("Student Details are: " + rollNo + " " + name + " " + marks);
	}
	
	public static void show1(Student obj){
		System.out.println("School Name : " + schoolName);
		System.out.println("Student Details are: " + obj.rollNo + " ," + obj.name + " ," + obj.marks);
	}
	
}

public class JavaStaticKeyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student st = new Student();
		Student st1 = new Student();
		
		st.rollNo = 101;
		st.name = "Ankush";
		st.marks = 89;
		
		
		st1.rollNo = 102;
		st1.name = "Nagesh";
		st1.marks = 63;
		
		Student.schoolName = "ZP School Ambala";
		Student.show1(st1);
		
		st.show();
		st1.show();
	}

}
