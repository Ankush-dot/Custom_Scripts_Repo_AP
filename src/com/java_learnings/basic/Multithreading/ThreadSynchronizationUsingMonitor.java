package com.java_learnings.basic.Multithreading;

class MyData {

	synchronized void display(String strs) {
		for(int i=0; i<strs.length();i++) {
			System.out.print(strs.charAt(i));
		}
	}
}

class Thread1 extends Thread{

	MyData md1;

	public Thread1(MyData md1) {
		this.md1 = md1;
	}
	public void run()
	{
		md1.display("Hello World");
	}
}

class Thread2 extends Thread{

	MyData md2;

	public Thread2(MyData md2) {
		this.md2 = md2;
	}
	public void run()
	{
		md2.display(" Welcome");
	}
}
public class ThreadSynchronizationUsingMonitor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyData md = new MyData();
		Thread1 t1 = new Thread1(md);
		Thread2 t2 = new Thread2(md);
		t1.start();
		t2.start();
	}
}
