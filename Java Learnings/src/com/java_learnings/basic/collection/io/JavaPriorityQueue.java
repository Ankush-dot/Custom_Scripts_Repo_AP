package com.java_learnings.basic.collection.io;

import java.util.PriorityQueue;

public class JavaPriorityQueue {
	
	public static void main(String[] args) {
		
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
		
		pq.add(20);
		pq.add(10);
		pq.add(30);
		pq.add(4);
		pq.add(9);
		pq.add(2);
		
		System.out.println(pq.peek());
		pq.poll();
		System.out.println("After Deletion");
		pq.forEach((x)->System.out.print(x+" "));
	}

}
