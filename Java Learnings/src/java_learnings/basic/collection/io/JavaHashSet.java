package java_learnings.basic.collection.io;
import java.util.*;

public class JavaHashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet<Integer> hs = new HashSet<Integer>(10,0.25f);
		ArrayList<Integer> al = new ArrayList<Integer>(List.of(20,30,40,50));
		
		hs.add(10);
		hs.addAll(al);
		hs.add(10);
		
	//	hs.remove(20);
		//hs.removeAll(al);
		hs.forEach((x)->System.out.println(x+" "));
		
		//System.out.println(hs.size());
		

	}

}
