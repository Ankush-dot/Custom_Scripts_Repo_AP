package java_learnings.basic.string.io;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class StringMethodPractise {
	
	public static void main(String[] args) {
		
		String str1 = "Hi All   ";
		String str12 = "Hell World";
		String[] Str2 = {"Ankush","Nagesh","Pramod","Sandip","Yougesh"};
		ArrayList<String> arrayStr3 = new ArrayList<String>();
		arrayStr3.add("s1");
		arrayStr3.add("s2");
		arrayStr3.add("s3");
		arrayStr3.add("s4");
		arrayStr3.add("s5");
		
		ArrayList<String> arrayStr4 = new ArrayList<String>();
		arrayStr4.add("s1");
		arrayStr4.add("p2");
		arrayStr4.add("s3");
		arrayStr4.add("p4");
		arrayStr4.add("p5");
		
		
		System.out.println("Charatcter at: " + str1.charAt(3)); 
		System.out.println("after compare: " + str1.compareTo(str12));
		System.out.println(arrayStr3.iterator()); 
		
		Set<String> s1 = new HashSet<String>(arrayStr3);
		Set<String> s2 = new HashSet<String>(arrayStr4);
		
		Set<String> differance = new HashSet<String>(arrayStr3);
		differance.removeAll(s2);
		
		System.out.println(differance);
		
		
		
		
	}

}
