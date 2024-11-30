package com.practice_code.java.demo;

public class CopyArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr1[] = new int[]{1,2,3,4,5};
		int arr2[] = new int[arr1.length];
		
		for(int i = 0; i<arr1.length; i++) {
			arr2[i] = arr1[i];
		}
		
		System.out.println("Orignal arr1");
		
		for(int n:arr1) {
			System.out.print(n + " ");
		}
		System.out.println();
		
		System.out.println("Arr2 array");
		
		for(int m:arr2) {
			System.out.print(m + " ");
		}
		System.out.println();
		
		

	}

}
