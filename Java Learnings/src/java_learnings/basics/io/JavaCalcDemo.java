package java_learnings.basics.io;

import java.util.Scanner;

public class JavaCalcDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a base Value : ");
		float sideA = sc.nextFloat();
		
		System.out.println("Enter a Height Value : ");
		float sideB = sc.nextFloat();
		
		System.out.println("Enter a area Value : ");
		float sideC = sc.nextFloat();
		
		float sum = (sideA+sideB+sideC)/2f;
		
		System.out.println("Sum of all Sides is : " + sum);
		
		double areaOfTriangle = Math.sqrt(sum*(sum-sideA)*(sum-sideB)*(sum-sideC));
		
		System.out.println("Area of Triangle is : " + areaOfTriangle);
		
		
		

	}

}
