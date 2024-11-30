package com.java_learnings.basic.javalangpackage;

public class MathDemo {

	public static void main(String[] args) {
		System.out.println("Absolute : ");
		System.out.println(Math.abs(-123));
		
//		System.out.println("Absolute : ");
//		System.out.println(StrictMath.abs(-123)); //Precious result 
		
		System.out.println("Cube Root : ");
		System.out.println(Math.cbrt(27));
		
		System.out.println("Exact Decrement : ");
		System.out.println(Math.decrementExact(7));
		
		System.out.println("Exponent value in floating point Rep : ");
		System.out.println(Math.getExponent(123.45));
		
		System.out.println("Round Division : ");
		System.out.println(Math.floorDiv(50, 9));
		
		System.out.println("e power x : ");
		System.out.println(Math.exp(1));
		
//		System.out.println("e power x : ");
//		System.out.println(StrictMath.exp(1));  //Precious result
		
		System.out.println("Log base 10 : ");
		System.out.println(Math.log10(100));
		
		System.out.println("Maximum : ");
		System.out.println(Math.max(10, 50));
		
		System.out.println("Tan : ");
		System.out.println(Math.tan(45*Math.PI/180));
		
		System.out.println("Random : ");
		System.out.println(Math.random()*100);
		
		System.out.println("Power : ");
		System.out.println(Math.pow(2, 3));
		
		System.out.println("Excact Product : ");
		System.out.println(Math.multiplyExact(1000, 200));
		
		System.out.println("Next Float Value : ");
		System.out.println(Math.nextAfter(12.5, 13));
		


	}

}
