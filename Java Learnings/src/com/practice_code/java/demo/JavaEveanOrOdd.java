package com.practice_code.java.demo;

import java.util.Scanner;

public class JavaEveanOrOdd {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a value : ");
		int num = sc.nextInt();
		
		if(num%2==0) {
			System.out.println(num + " is an Even Value");
		}
		else
		{
			System.out.println(num + " is an Odd Value");
		}
	}

}
