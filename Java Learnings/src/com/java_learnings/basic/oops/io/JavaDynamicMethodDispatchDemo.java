package com.java_learnings.basic.oops.io;

class Super 
{
	public void meth1()
	{
		System.out.println("Inside Meth1 of Super class");
	}
	public void meth2()
	{
		System.out.println("Inside Meth2 of Super class");
	}
	
}

class Sub extends Super
{
	
	public void meth2()
	{
		System.out.println("Inside Meth2 of Sub Class class");
	}
	public void meth3()
	{
		System.out.println("Inside Meth3 of Sub Class class");
	}
}
public class JavaDynamicMethodDispatchDemo {
	
	public static void main(String[] args) {
		
//		Sub obj1 = new Sub();
//		obj1.meth1();
//		obj1.meth2();
//		obj1.meth3();
		
		Super obj = new Sub();
		obj.meth1();
		obj.meth2();
//		obj.meth3();
		
	}

}
