package com.java_learnings.basic.collection.io;

import java.util.ArrayList;
import java.util.Collection;

public class JavaArraysLit {
	
	public static void main(String[] args) {
		
		Collection<Integer> coll = new ArrayList<Integer>();
		Collection<Integer> coll1 = new ArrayList<Integer>();
		

		coll1.add(12);
		coll1.add(13);
		coll1.add(14);
		coll1.add(16);
		coll1.add(16);
		
		coll.add(22);
		coll.add(35);
		coll.add(242);
		coll.add(190);
		coll.add(78);
		
		System.out.println(coll.size());
		System.out.println();
		System.out.println(coll.contains(16));
		System.out.println(coll.remove(16));
		System.out.println();
//		coll1.addAll(coll);
		System.out.println();
		
		for(int i : coll)
			System.out.println(i);
		System.out.println();
		
		for(int i : coll1)
			System.out.println(i);
		
		
		
		
	}

}
