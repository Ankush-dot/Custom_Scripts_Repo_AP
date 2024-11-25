package com.java_learnings.basic.javageneric;

public class JavaGenric<T> {
	
	
	T data[] =(T[]) new Object[3];

	@SuppressWarnings("removal")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Object obj[] = new Object[3];
//		obj[0] = "hi";
//		obj[1] = "Hello";
//		obj[2] = 10;
//		String str;
//		for(int i=0;i<3;i++) {
//			str = (String)obj[i];
//			System.out.println(str);
//		}
		
		JavaGenric<String> gd = new JavaGenric<String>();
		gd.data[0] = "Hi";
		gd.data[1] = "Hello";
		//gd.data[2] = 10;
		
		
	}

}
