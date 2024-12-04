package com.practice_code.java.demo;

public class JavaCommandArgumentDemo {
	
	public static void main(String[] args) throws NumberFormatException {
		
		double sum =0;
		for(String x:args)
		{
			sum = sum + Double.parseDouble(x);
		}
		
		System.out.println("Sum is :" + sum);
	}

}