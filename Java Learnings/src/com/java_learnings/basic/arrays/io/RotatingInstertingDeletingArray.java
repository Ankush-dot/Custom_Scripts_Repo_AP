package com.java_learnings.basic.arrays.io;

public class RotatingInstertingDeletingArray {
	
	public static void main(String[] args) {
		
		//int a[] = {1,2,3,4,5,6,7,8,9,12,44,66,88};
		
		
/*		for(int x:a) {
			System.out.print(x+" ");
			
		}
		System.out.println("");
		
		int temp = a[0];
		
		for(int i =1; i< a.length; i++) {
			a[i-1] = a[i];
	
		}
		a[a.length-1]=temp;
		
		for(int x:a) {
			System.out.print(x+" ");
			
		}
		System.out.println("");
*/		
		
		
		int a[] = new int[10];
		a[0]=10; a[1]=20;a[2]=30;a[3]=40;a[4]=50;a[5]=60;
		
		int n=7;
	
		for(int i=0;i<n;i++) {
			System.out.print(a[i]+",");
			
		}
		System.out.println("");
		int index = 3;
		int value = 20;
		
		for(int i=n;i>index;i--) {
			a[i] = a[i-1];
		}
		a[index]=value;
		
		for(int i=0;i<n;i++) {
			System.out.print(a[i]+",");
		}
		System.out.println("");
	}
	
}
