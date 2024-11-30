package com.java_learnings.basic.collection.io;

import java.util.*;

class My implements Comparator<Integer>
{
	public int compare(Integer i1, Integer i2)
	{
		if(i1<i2)
			return 1;
		if(i1>i2)
			return -1;
		return 0;
		
	}
}

public class JavaComparatorDemo {
	public static void main(String[] args) {
		
		Integer a[] = {14,2,5,6,7,9,4,2};
		//int b[] = {14,2,5,8,7,9,4,2};
		
		//int c[]= Arrays.copyOf(a, a.length);
		
		//System.out.println(Arrays.mismatch(a, b));
		//Arrays.fill(c, 10);
		Arrays.sort(a, new My());
		
		for (int i : a) {
			System.out.println(i);
			//System.out.println(Arrays.binarySearch(c, 9));
		}
	}
}
