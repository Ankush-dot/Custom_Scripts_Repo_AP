package com.java_learnings.basic.exceptionhandling;

import java.util.Scanner;

public class JavaExceptionHandlingDemo {
	
	public static void main(String[] args) {
		
		int a,b,c;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a first Value : ");
		a = sc.nextInt();
		System.out.println("Enter a Second Value : ");
		b = sc.nextInt();
		try {
			c = a/b;
			System.out.println("Devision is : " + c);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Denominator should not be 0, Try Again!!" + e);
		}
		finally
		{
			System.out.println("Try block closed");
		}
		System.out.println("Program End, BYE!!");
		
		
		
	}

}
