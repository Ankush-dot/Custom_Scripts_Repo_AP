package com.java_learnings.basic.javalangpackage;

public class WrapperClassDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer a = new Integer(10);
		Integer b = Integer.valueOf(11);
		Integer c = 12;

		Byte d = 15;
		Byte e = Byte.valueOf("18");

		Short g = Short.valueOf("123");

		Float h = 12.4f;
		Float i = Float.valueOf("123.55");

		Double j = Double.valueOf(123455.66);

		Character k = Character.valueOf('c');

		Boolean l = Boolean.valueOf(true);

		Byte bb = 16;
		Byte f = Byte.valueOf(bb);   //Boxing

		int m = 10;
		Integer n = m;  //AutoBoxing

		Float o = 12.4f;
		float p = o.floatValue(); //UnBoxing
		float q = o;  //AutoUnboxing


	}

}
