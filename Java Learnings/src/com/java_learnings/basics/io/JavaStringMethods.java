package com.java_learnings.basics.io;

public class JavaStringMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String str1 = "ankushpawar229@gmail.com";
		
		int i = str1.indexOf('@');
		String userName = str1.substring(0, i);
		int d = str1.indexOf('.');
		String domain = str1.substring(i+1, str1.length());
		
		System.out.println("User Name : " + userName);
		System.out.println("Domain Name : " + domain);
		
		System.out.println(domain.startsWith("gmail"));
		
		
				
		
//		String str1 = "Ankush";
//		String str2 = "Ankush";
//		String str3 = new String("Ankush");
//		
//		System.out.println(str1.equals(str2));
//		System.out.println(str1 == str2);
//		str2 = "ankush";
//		System.out.println(str1.equals(str2));
//		System.out.println(str1.equalsIgnoreCase(str2));
//		System.out.println(str1 == str2);
//		System.out.println(str1.equals(str3));
//		System.out.println(str1 == str3);
//		System.out.println(str1.equalsIgnoreCase(str3));
	}

}
