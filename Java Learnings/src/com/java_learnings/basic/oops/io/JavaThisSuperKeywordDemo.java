package com.java_learnings.basic.oops.io;

class A     //every class By default extends Object class even if not mentioned
{
	public A()
	{
		super();
		System.out.println("Inside A");
	}
	
	public A(int n)
	{
		super();
		System.out.println("Inside A int");
	}
}
class B extends A
{  
	public B()
	{
		super(); //calling the parent class constructor
		System.out.println("Inside B");
	}
	
	public B(int n)
	{
		this(); //calling the constructor which is in same class using this keyword 
		System.out.println("Inside B int");
	}
}

public class JavaThisSuperKeywordDemo {
	
	public static void main(String[] args) {
		
		B obj = new B(5);
		
	}

}
