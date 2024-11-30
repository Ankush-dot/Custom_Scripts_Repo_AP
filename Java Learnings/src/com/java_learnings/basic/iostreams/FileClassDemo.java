package com.java_learnings.basic.iostreams;

import java.io.File;

public class FileClassDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		File f = new File("C:\\Users\\Ankus\\Documents");
		
		System.out.println(f.isDirectory());
		File List[] = f.listFiles();
		
		for(File l : List) {
			System.out.print(l.getName() + "  ");
			System.out.println(l.getPath());
		}
	}

}
