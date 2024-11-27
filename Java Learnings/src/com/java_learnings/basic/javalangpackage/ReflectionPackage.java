package com.java_learnings.basic.javalangpackage;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

class Demo1
{
	private int d;
	int c = 10;
	String str = "Ankush";
	
	public Demo1() {};
	public Demo1(int x, String y) {};
	
	public void display()
	{
		System.out.println("inside Display Metod");
	}
	public void show(int x, String y)
	{
		System.out.println("inside Show Metod");
	}
}
public class ReflectionPackage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Class c = Demo1.class;
		
		Field field[] = c.getDeclaredFields();
//		for(Field f : field)
//			System.out.println(f);
		Constructor<?> con[]= c.getConstructors();
//		for(Constructor<?> c1 : con)
//			System.out.println(c1);
		
		Method meth[] = c.getMethods();
//		for(Method m: meth)
//			System.out.println(m);
		
		Parameter param[] = meth[1].getParameters();
		for(Parameter p: param)
			System.out.println(p);
	}

}
