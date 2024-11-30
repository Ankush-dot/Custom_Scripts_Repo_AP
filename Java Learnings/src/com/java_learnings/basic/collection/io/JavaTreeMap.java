package com.java_learnings.basic.collection.io;

import java.util.Map;
import java.util.TreeMap;

public class JavaTreeMap {
	
	public static void main(String[] args) {
		
		TreeMap<Integer, String> tm = new TreeMap<Integer, String>(Map.of(0,"Ankush",1,"Nagesh",2,"Manali",3,"Srus",4,"OM"));
		
		tm.put(5, "Yougesh");
		tm.put(6, "Pramod");
		
		System.out.println(tm.ceilingEntry(5).getValue());
		System.out.println(tm);
		System.out.println(tm.get(6));
	}

}
