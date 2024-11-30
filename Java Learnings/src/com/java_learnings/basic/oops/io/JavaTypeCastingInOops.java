package com.java_learnings.basic.oops.io;

class AB
{
	public void show1()
	{
		System.out.println("Inside A show1");
	}
	
}
class BA extends AB
{
	public void show2()
	{
		System.out.println("Inside B show2");
	}
	
}

public class JavaTypeCastingInOops {
	
	public static void main(String[] args) {
		AB obj = new BA();  //Upcasting
		obj.show1();
		
		BA obj1 = (BA) obj;  //Downcasting
		obj1.show2();
		
		
	}
}