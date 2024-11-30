package com.practice_code.java.demo;

public class PrintArrayinReverse {
	
	public static void main(String[] args) {
		
		int arr[] = new int[] {1,2,3,4,5};
		
		System.out.println("*** Orignal Array ***");
		for(int i=0; i<arr.length;i++)
		{
			System.out.print(arr[i]);
		}
		System.out.println();
		
		System.out.println("*** Reverse Array ***");
		
		for(int j = arr.length-1; j>=0;j--) 
		{
			System.out.print(arr[j]);
		}
	}

}
