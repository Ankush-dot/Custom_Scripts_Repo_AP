package com.java_learnings.iostreams;

import java.io.BufferedReader;
import java.io.FileReader;

public class BufferedDemo {

	public static void main(String[] args) throws Exception {

//		FileInputStream && BufferInputStream
		
//		FileInputStream fis = new FileInputStream("C:/Users/Ankus/Documents/Java IO Operations files/Text.txt");
//		BufferedInputStream bis = new BufferedInputStream(fis);
		
//		FileReader && BufferReader
		
		FileReader fis = new FileReader("C:/Users/Ankus/Documents/Java IO Operations files/Text.txt");
		BufferedReader bis = new BufferedReader(fis);
		
		
//		int x;
//		while((x=bis.read())!=-1) {
//			System.out.println((char)x);
//		}
		
//		System.out.println("File : " + fis.markSupported());
//		System.out.println("Buffer : " + bis.markSupported());
		
		System.out.print((char)bis.read());
		System.out.print((char)bis.read());
		System.out.println((char)bis.read());
		bis.mark(10);
		System.out.print((char)bis.read());
		System.out.print((char)bis.read());
		bis.reset();
		System.out.print((char)bis.read());
		System.out.print((char)bis.read());
		System.out.print((char)bis.read());
		System.out.print((char)bis.read());
		System.out.println(" ");
		System.out.println(bis.readLine());
		
		

	}

}
