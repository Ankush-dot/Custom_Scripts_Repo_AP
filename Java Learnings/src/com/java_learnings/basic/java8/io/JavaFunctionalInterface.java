package com.java_learnings.basic.java8.io;

@FunctionalInterface
interface A  //Having only one Abstract method inside the Interface
{
	public void show();
}

public class JavaFunctionalInterface {
	public static void main(String[] args) {
		
		A obj = new A()
		{
			public void show()
			{
				System.out.println("Inside Show");
			}
			
		};
		obj.show();
		
	}
	
}
