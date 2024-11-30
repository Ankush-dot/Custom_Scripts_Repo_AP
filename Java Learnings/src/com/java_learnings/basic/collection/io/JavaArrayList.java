package com.java_learnings.basic.collection.io;
import java.util.*;

public class JavaArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> al = new ArrayList<Integer>(10);
		ArrayList<Integer> al1 = new ArrayList<Integer>(List.of(30,20,50,60));
		ArrayList<Integer> al2 = new ArrayList<Integer>(List.of(70,80,90));
		
		al.add(10);
		al.add(100);
		al.add(30);
		al.add(20);
		al.add(5);
		
		
		al.addAll(al1);
		al2.clone();
		al2.clear();
		System.out.println("Contains : " + al.contains(20));
		System.out.println("Index of 5 before sort : "+ al.indexOf(5));
		System.out.println("Index of 5 before sort : "+ al2.isEmpty());
		
		System.out.println("al1 iterator "+ al1.iterator());
		System.out.println("last Index of : "+ al.lastIndexOf(30));
		System.out.println("removed Index : " + al.remove(6));
		al.set(6, 90);
		System.out.println("Size of Al Arraylist : " + al.size());
		al.sort(null);
		System.out.println("Index of 5 after sort : "+ al.indexOf(5));
		for(int i=0; i<al.size();i++) {
			System.out.println(al.get(i));
		}
		
		
		Collections.sort(al, Collections.reverseOrder());
		
//		System.out.println(al.indexOf(20));
		for(var x : al)
			System.out.print(x+ " ");
		
//		for(int i = 0; i<al.size();i++)
//		{
//			System.out.print(al.get(i)+" ");
//		}
	}

}
