package com.java_learnings.basic.Multithreading;

public class UsingRunnableInterface implements Runnable {
	

	@Override
	public void run() {
		// TODO Auto-generated method stub
		int i=1;
		while(i<=100) {
			System.out.println(i + " World");
			i++;
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UsingRunnableInterface uri = new UsingRunnableInterface();
		Thread t = new Thread(uri);
		t.start();
		int i=1;
		while(i<=100) {
			System.out.println(i + " Hello");
			i++;
		}

	}


}
