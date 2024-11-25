package java_learnings.basic.collection.io;

import java.util.LinkedHashSet;

public class JavaLinkedHasSetDemo {
	public static void main(String[] args) {
		LinkedHashSet<String> lhs = new LinkedHashSet<String>(5);
		
		lhs.add("A");
		lhs.add("C");
		lhs.add("E");
		lhs.add("K");
		lhs.add("B");
		lhs.add("G");
		lhs.add("B");
		
		lhs.forEach(System.out::println);
	}
}
