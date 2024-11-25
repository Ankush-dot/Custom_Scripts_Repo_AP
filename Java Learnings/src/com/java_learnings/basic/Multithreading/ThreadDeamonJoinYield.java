package com.java_learnings.basic.Multithreading;

class ThreadTest1 extends Thread{

	public void run() {
		int count =1;
		while(true) {
			System.out.println(count++ +"My Thread");

		}
	}
}

public class ThreadDeamonJoinYield {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadTest1 td1 = new ThreadTest1();
		//		td1.setDaemon(true);
		td1.start();
		int count= 1;
		while(true) {
			System.out.println(count++ + "Main Thread");
			Thread.yield();
		}
		//		Thread mainThread = Thread.currentThread();
		//		try {
		//			mainThread.join();
		//		} catch (InterruptedException e) {
		//			e.printStackTrace();
		//		}
		//try{Thread.sleep(100);}catch(Exception e){System.out.println(e);}

	}
}