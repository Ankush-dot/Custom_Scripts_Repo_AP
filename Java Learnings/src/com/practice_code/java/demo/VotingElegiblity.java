package com.practice_code.java.demo;

import java.util.Scanner;

public class VotingElegiblity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your age : ");
		int age = sc.nextInt();
		
		if(age>=18)
		{
			System.out.println("You are Eleigible for Voting");
		}
		else 
		{
			System.out.println("You are not Eleigible for Voting");
		}
	}

}
