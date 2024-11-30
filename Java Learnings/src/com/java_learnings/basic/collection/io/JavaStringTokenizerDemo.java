package com.java_learnings.basic.collection.io;

import java.io.FileInputStream;
//import java.io.IOException;
//import java.io.IOException;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class JavaStringTokenizerDemo {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		//String data ="Name=Ankush Address=Naned Country=India Dept=IT";
		FileInputStream file = new FileInputStream("C:/Users/Ankus/OneDrive/Desktop/mydoc.txt");
		byte b[] = new byte[file.available()];
		file.read(b);
		String data = new String(b);
		
		
		StringTokenizer stk = new StringTokenizer(data,",");
		
		String s;
		ArrayList<Integer> al = new ArrayList<>();
		
		while(stk.hasMoreTokens())
		{
			s = stk.nextToken();
			al.add(Integer.valueOf(s));
		}
		System.out.println(al);
	}

}
