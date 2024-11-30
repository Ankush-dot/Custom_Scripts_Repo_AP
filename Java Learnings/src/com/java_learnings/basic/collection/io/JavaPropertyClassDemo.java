package com.java_learnings.basic.collection.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class JavaPropertyClassDemo {
	public static void main(String[] args) throws FileNotFoundException, IOException {
		
		Properties pt = new Properties();
		
//		pt.setProperty("Brand", "Dell");
//		pt.setProperty("Processor", "I7");
//		pt.setProperty("OS", "Windows");
//		pt.setProperty("Model", "Latitude");
////		pt.setProperty("Brand", "MI");
////		pt.setProperty("Brand", "Apple");
//		pt.storeToXML(new FileOutputStream("C:/Users/Ankus/OneDrive/Desktop/mydoc.xml"), "Laptop");
//		System.out.println(pt);
		//pt.forEach((k,v)->System.out.println(k+" : "+v));
	
		pt.load(new FileInputStream("C:/Users/Ankus/OneDrive/Desktop/mydoc.txt"));
		System.out.println(pt);
		System.out.println(pt.getProperty("Name"));
	}
}
