package java_learnings.basic.collection.io;

import java.util.Hashtable;

public class JavaHashTableDemo {
	public static void main(String[] args) {
		Hashtable<Integer, String> ht = new Hashtable<Integer, String>();
		
		ht.put(1, "A");
		ht.put(2, "B");
		ht.put(3, "C");
		ht.put(4, "D");
		ht.put(5, "E");
		
		ht.compute(2, (k,v)->"Z");
		System.err.println(ht);
	}
}
