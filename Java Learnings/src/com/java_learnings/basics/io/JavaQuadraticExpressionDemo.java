package com.java_learnings.basics.io;

import java.util.Scanner;

public class JavaQuadraticExpressionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a, b, c;
		double r1, r2;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a three Values: ");
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		
		r1 = (-b + Math.sqrt(b*b-4*a*c))/(2*a);
		
		r2 = (-b - Math.sqrt(b*b-4*a*c))/(2*a);
		
		
		System.out.println("R1 Value is : "+ r1 +" R2 Value is : " + r2 );
		
	}

}
