package com.practice_code.java.demo;import java.util.Scanner;

public class FindLeapYear {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter your Birth Year : ");
		int age = sc.nextInt();

		if(age%4==0) 
		{
			if(age%100 == 0)
			{
				if(age%400 == 0)
				{
					System.out.println(age + " It's a leap year");
				}
				else 
				{
					System.out.println(age + " It's not a leap year");
				}
			}
			else 
			{
				System.out.println(age + " It's a leap year");
			}
		}
		else 
		{
			System.out.println(age + " It's not a leap year");
		}
	}
}
