package com.java_learnings.basic.oops.io;

class Person{
	private int age;
	private String name;
	
	public Person()
	{	
		System.out.println("Inside Constructor");
		age = 22;
		name = "Ankush";
	}
	public Person(int a, String n) {   //Parameterized constructor
		// TODO Auto-generated constructor stub
		age = a;
		name = n;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age; //This Keyword refers to current object, means calling method using which Object
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
public class JavaConstructorDemo {
	
	public static void main(String[] args) {
		Person obj = new Person();
		Person obj1 = new Person(24,"Nagesh");
//		obj.setAge(27);
//		obj.setName("Ankush");
		
		System.out.println(obj.getName() + " : " + obj.getAge());
		System.out.println(obj1.getName() + " : " + obj1.getAge());
	}
	

}
