package com.practice_code.java.demo;

import java.util.Scanner;

public class FindRadixNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter your Number : ");
		String str = sc.nextLine();  //10101010


		if(str.matches("[01]+")) 
		{
			System.out.println("Given number is Binary Number, Radix-2!! ");
		}
		else if(str.matches("[0-7]+")) 
		{
			System.out.println("Given number is Octal number, Radix-8!! ");
		}
		else if(str.matches("[0-9]+")) 
		{
			System.out.println("Given number is Decimal number, Radix-10!! ");
		}
		else if(str.matches("[0-9A-F]+")) 
		{
			System.out.println("Given number is HexaDecimal number, Radix-16!! ");
		}
		else 
		{
			System.out.println("Invalid Number ");
		}


	}

}
