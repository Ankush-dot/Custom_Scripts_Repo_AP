package com.java_learnings.basic.Multithreading;


class ThreadTest extends Thread{

	public ThreadTest(String name) {
		super(name);
		setPriority(MAX_PRIORITY);
	}
	public void run() {
		int count =1;
		while(true) {
			System.out.println(count++);
			try {
				sleep(1000);
			}
			catch(InterruptedException e){
				System.out.println(e);
			}

		}
	}
}

	public class MyThreadTest{

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			ThreadTest tt = new ThreadTest("My Thread Test");

			System.out.println("ID : " + tt.getId());
			System.out.println("Thread Name : " + tt.getName());
			System.out.println("Thread Priority : " + tt.getPriority());
			tt.start();
			tt.interrupt();
			System.out.println("Thread Status : " + tt.getState());
			System.out.println("Alive : " + tt.isAlive());

		}

	}
