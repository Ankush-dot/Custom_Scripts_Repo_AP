package com.java_learnings.basic.string.io;

public class JavaStringBuffer {
	public static void main(String[] args) {
		
		StringBuffer sb = new StringBuffer("Ankush");
		sb.append(" Pawar");
		
//		sb.deleteCharAt(3);
		sb.insert(0, "Mr ");
		System.out.println(sb);
	}

}
