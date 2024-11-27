package com.java_learnings.basic.javalangpackage;
//Every class directly or indirectly inheriting from Object class

class MyObject{
	public String toString() {
		return "My Object";
	}
	public int hashCode() {
		return 100;
	}
	public boolean equals(Object o) {
		return this.hashCode()==o.hashCode();
		
	}
}
public class langdemo {

	public static void main(String[] args) {
		Object obj1 = new Object();
		Object obj2 = obj1;
		System.out.println(obj1); //when you print any object it'll call toString() method automatically
		System.out.println(obj1.equals(obj2)); //true
		System.out.println(obj1.hashCode());
		
		System.out.println("*************************");
		
		MyObject mo1 = new MyObject();
		MyObject mo2 = new MyObject();
		System.out.println(mo1);
		System.out.println(mo1.hashCode());
		System.out.println(mo1.equals(mo2));

	}

}
