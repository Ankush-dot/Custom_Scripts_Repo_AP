package com.java_learnings.basic.collection.io;
import java.util.*;

public class JavaTreeSet {

	public static void main(String[] args) 
	{
		TreeSet<Integer> ts = new TreeSet<Integer>(List.of(10,20,30,80,50,60));
		ArrayList<Integer> al = new ArrayList<Integer>(List.of(70,20,40,90,100,110,120));
//		al.add(10);
//		al.add(20);
//		al.add(30);
//		al.add(40);
//		al.add(50);
//		al.add(60);
		ts.addAll(al);
		//ts.comparator();
		
//		System.out.println(ts.ceiling(40));
		ts.forEach((x)->System.out.print(x+" "));
	}

}
