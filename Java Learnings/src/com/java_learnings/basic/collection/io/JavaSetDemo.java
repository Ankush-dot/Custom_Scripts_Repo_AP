package com.java_learnings.basic.collection.io;

import java.util.Collection;
import java.util.Iterator;
import java.util.TreeSet;

public class JavaSetDemo {
	
	
	public static void main(String[] args) {
		
		Collection<Integer> nums = new TreeSet<Integer>();
		
		nums.add(11);
		nums.add(13);
		nums.add(17);
		nums.add(18);
		nums.add(20);
		nums.add(11);
		
		Iterator<Integer> values = nums.iterator();
		
		while(values.hasNext())
			System.out.println(values.next());
		
//		for(int i : nums)
//			System.out.println(i);
	}

}
