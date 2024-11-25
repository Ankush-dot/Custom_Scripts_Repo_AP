package java_learnings.basics.io;

import java.util.ArrayList;
import java.util.List;

public class DemoJava {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> al = new ArrayList<Integer>(List.of(10,30,49,48));
		for(int i: al) {
			System.out.println(i);
		}
		
	}

}
