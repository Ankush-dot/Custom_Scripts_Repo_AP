package com.java_learnings.basic.oops.io;

class Human{
	private int age;
	private String name;
	
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

public class JavaEncapsulationDemo {
	
	public static void main(String[] args) {
		
		Human obj = new Human();
		obj.setAge(27);
		obj.setName("Ankush");
		
		System.out.println(obj.getName() + " : " + obj.getAge());
	}

}
