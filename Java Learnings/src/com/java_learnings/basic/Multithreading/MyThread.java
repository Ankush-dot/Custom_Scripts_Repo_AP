package com.java_learnings.basic.Multithreading;

class MyThread extends Thread{



	public static void main(String[] args) {
		MyThread t = new MyThread();
		t.start();

		int i=1;
		while(i<=100) {
			System.out.println(i + " World");
			i++;
		}


	}
	public void run() {
		int i=1;
		while(i<=100) {
			System.out.println(i + " Hello");
			i++;
		}
	}


}
