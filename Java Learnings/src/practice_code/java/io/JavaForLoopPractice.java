package practice_code.java.io;

import java.util.Scanner;

public class JavaForLoopPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		int n = 5;
//		
//		for(int i = 1; i<=20;i++) {
//			
//			System.out.println(n + " * " + i + " = "+ (n * i));
//			
//			
//		}
		
		
		//sum of given numbers
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number : "); 
		int num = sc.nextInt();
//		int sum=0;
//		
//		for(int i=1; i<=num; i++)
//		{
//			sum = sum+i; 
//		}
//		System.out.println(sum);
		
		
		//Factorial number
//		int fact=1;
//		for(int i=1; i<=num; i++) {
//			fact = fact*i;
//			
//		}
//		System.out.println(fact);
		
		
		for(int i =0; i<=num; i++)
		{
			System.out.println(i);
		}
		
	}

}
