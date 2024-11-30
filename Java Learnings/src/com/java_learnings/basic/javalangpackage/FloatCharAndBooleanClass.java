package com.java_learnings.basic.javalangpackage;

public class FloatCharAndBooleanClass {

	public static void main(String[] args) {

		float a = 12.5f;
		Float b = 12.5f;
		Float c = (float) Math.sqrt(-1);
		
		System.out.println(b.equals(a));
//		System.out.println(b.isInfinite()); //to check infinity
//		System.out.println(b == Float.POSITIVE_INFINITY); //to check infinity
//		System.out.println(b == Float.NEGATIVE_INFINITY);
		System.out.println(c.isNaN()); //to check it's number or not
		//System.out.println(c != Float.NaN); //should avoid
		
		
		Character ch= 'A';
		
	}

}
