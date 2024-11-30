package com.java_learnings.basic.oops.io;

class Computer
{
	String name ;
	int price;
	
	public void detailsOfComputer()
	{
		System.out.println("inside details of Computer");
	}
	static class Laptop
	{
		public void detailsOfLaptop()
		{
			System.out.println("Inside details of Laptop");
		}
		
	}
}

public class JavaInnerClass {
	public static void main(String[] args) {
		
		Computer obj = new Computer();
		
		obj.detailsOfComputer();
		
		Computer.Laptop obj1 = new Computer.Laptop();
		obj1.detailsOfLaptop();
		
		
	}

}
