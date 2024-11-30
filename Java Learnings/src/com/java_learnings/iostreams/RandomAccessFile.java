package com.java_learnings.iostreams;


public class RandomAccessFile {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		java.io.RandomAccessFile raf = new java.io.RandomAccessFile("C:\\Users\\Ankus\\Documents\\Java IO Operations files\\Text.txt","rw");
		
		
		System.out.println((char)raf.read());
		System.out.println((char)raf.read());
		System.out.println((char)raf.read());
		raf.write('d');
		System.out.println((char)raf.read());
		System.out.println((char)raf.read());
		raf.write('k');
		System.out.println((char)raf.read());
		raf.skipBytes(3);
		System.out.println((char)raf.read());
		raf.seek(2);
		System.out.println((char)raf.read());
		System.out.println(raf.getFilePointer());
	}

}
