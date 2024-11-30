package com.java_learnings.basic.collection.io;

import java.util.BitSet;

public class JavaBitSetClassDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BitSet bt = new BitSet();
		
		bt.set(0);
		bt.set(2);
		bt.set(4);
		bt.set(6);
		bt.set(8);
		
		BitSet bt1 = new BitSet();
		//bt1.set(0);
		bt1.set(1);
		//bt1.set(2);
		bt1.set(3);
		//bt1.set(4);
		bt1.set(5);
		//bt1.set(6);
		bt1.set(7);
		//bt1.set(8);
		bt1.set(9);
		
		bt.flip(0,bt.length());
		System.out.println(bt);

	}

}
