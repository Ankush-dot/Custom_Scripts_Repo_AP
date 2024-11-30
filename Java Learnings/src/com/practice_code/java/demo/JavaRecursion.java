package com.practice_code.java.demo;

public class JavaRecursion {
	
	static void fun(int a) {
		if(a>0) {
			//fun(a-1);
			System.out.println(a);
			fun(a-1);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		fun(5);
	}

}
