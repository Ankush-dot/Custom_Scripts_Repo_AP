package com.practice_code.java.demo;

import java.util.Scanner;

public class GradeBasedOnMarks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Marks of Math : ");
		int math = sc.nextInt();
		
		System.out.println("Marks of Science : ");
		int science = sc.nextInt();
		
		System.out.println("Marks of Physics : ");
		int physics = sc.nextInt();
		
		int total = math + science + physics;
		System.out.println("Your total marks is : "+ total);
		
		float average = total/3;
		System.out.println("Your Average is : " + average);
		if(math<=35 || science<=35 || physics<=35)
		{
			System.out.println("Better luck next time!! Fail :) ");
			exit(0);
		}
		
		
		if(average>70) {
			System.out.println("your Grade is : A ");
		}else if(average>60 && average<=70) {
			System.out.println("your Grade is : B ");
		}else if(average>50 && average<=60) {
			System.out.println("your Grade is : C ");
		}else if(average>40 && average<=50) {
			System.out.println("your Grade is : D ");
		}
		else
		{
			System.out.println("Better luck next time!! Fail :) ");
		}
		
	}

	private static void exit(int i) {
		// TODO Auto-generated method stub
		
	}

}
