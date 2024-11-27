package com.java_learnings.basic.javalangpackage;

public class IntegerAutoBoxingAndAutoUnBoxing {

	public static void main(String[] args) {
	
		int m1 = 18;
		Integer m2 = Integer.valueOf("123");
		Integer m3 = Integer.valueOf("A7",16);
		Integer m4 = Integer.decode("0xA7");
		System.out.println(Integer.toBinaryString(40));
	}

}
