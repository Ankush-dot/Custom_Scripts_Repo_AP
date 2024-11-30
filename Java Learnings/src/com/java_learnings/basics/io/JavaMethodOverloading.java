package com.java_learnings.basics.io;

class A
{
	public void show() 
	{
		System.out.println("Inside A Show");
	}
	
	public void config()
	{
		System.out.println("Inside A config");
		
	}
}
 
class B extends A
{
	public void show() //object of B class will give preference of child class method not parent class method. 
	{
		System.out.println("Inside B Show");
	}
}

public class JavaMethodOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		B obj = new B();
		
		obj.show();
		obj.config();

	}

}
