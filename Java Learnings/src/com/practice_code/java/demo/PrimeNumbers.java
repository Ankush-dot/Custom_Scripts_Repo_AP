package com.practice_code.java.demo;

import java.util.Scanner;

public class PrimeNumbers {
	
	boolean findPrimeNumber(int n){
		for(int i =2;i<n/2;i++) {
			if(n%i == 0) 
				return false;
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int a = sc.nextInt();
		
		PrimeNumbers pn = new PrimeNumbers();
		
		if(pn.findPrimeNumber(a))
			System.out.println(a + " is a prime number");
		else
			System.out.println(a + " is not a prime number");
	}

}
