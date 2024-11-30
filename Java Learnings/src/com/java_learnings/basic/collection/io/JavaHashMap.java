package com.java_learnings.basic.collection.io;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class JavaHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, String> capitalCitys = new HashMap<String, String>();
		
		capitalCitys.put("India", "Delhi");
		capitalCitys.put("England", "London");
		capitalCitys.put("Germany", "Berlin");
		capitalCitys.put("Norway", "Oslo");
		capitalCitys.put("USA", "Washington DC");
		
		for(String i : capitalCitys.keySet())
			System.out.println("Key : " + i + " // Values : " + capitalCitys.get(i));

	}

}
