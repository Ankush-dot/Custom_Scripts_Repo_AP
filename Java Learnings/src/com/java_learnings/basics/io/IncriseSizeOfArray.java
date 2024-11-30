package com.java_learnings.basics.io;

public class IncriseSizeOfArray {
	
	public static void main(String[] args) {
		
		int a[] = new int[5];
		a[0] = 10;
		a[1] = 20;
		a[2] = 30;
		a[3] = 40;
		a[4] = 50;
		//a[5] = 20;
		System.out.println(a.length);
		int b[] = new int[10];
		
		for (int x=0;x<a.length;x++) {
			b[x]=a[x];
		}
		a=b;
		a[5]=60;
		a[3] = 70;
		System.out.println(a.length);
		for(int y :a)
		{
			System.out.print(y+" ");
			
		}
		
	}

}
