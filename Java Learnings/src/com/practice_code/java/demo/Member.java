package com.practice_code.java.demo;

public interface Member {
	
	final static int x = 10;
	
	void callBack();
	
	public static void meth3() {
		System.out.println("Inside Meth3");
	}
	
}

interface Member2 extends Member{  //interface can be extended
	public void meth4();
}

class Store implements Member2  // if we are implementing child of interface then you need to override all the method of parent and child also
{

	@Override
	public void callBack() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void meth4() {
		// TODO Auto-generated method stub
		
	}
	
}

