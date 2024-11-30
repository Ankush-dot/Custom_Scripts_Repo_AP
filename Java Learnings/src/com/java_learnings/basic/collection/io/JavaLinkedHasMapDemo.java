package com.java_learnings.basic.collection.io;

import java.util.LinkedHashMap;

public class JavaLinkedHasMapDemo {
	
	public static void main(String[] args) {
		
		LinkedHashMap<Integer, String> lhm = new LinkedHashMap<Integer, String>(5){
			@Override
			protected boolean removeEldestEntry(java.util.Map.Entry<Integer, String> eldest)  //to restrict the size of Linked has map
			{
				// TODO Auto-generated method stub
				return size()>5;
			}
		};
		
		lhm.put(1, "A");
		lhm.put(2, "B");
		lhm.put(3, "C");
		lhm.put(4, "D");
		lhm.put(5, "E");
		String s= lhm.get(2);
		s = lhm.get(5);
		s=lhm.get(1);
		lhm.put(6, "F");
		//System.out.println(s);
		lhm.forEach((k,v)-> System.out.println(k+" "+ v));
	}

}
