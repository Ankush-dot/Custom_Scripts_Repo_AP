package com.java_learnings.basic.javageneric;

class Example<T>
{
	private T obj;

	public T getObj() {
		return obj;
	}

	public void setObj(T obj) {
		this.obj = obj;
	}
	
}

public class JavaGenericExamp {
	
	public static void main(String[] args) {
		
		Example<String> e = new Example();
		e.setObj("Ankush");
		//e.setObj(10);
		System.out.println(e.getObj());
	}
}
