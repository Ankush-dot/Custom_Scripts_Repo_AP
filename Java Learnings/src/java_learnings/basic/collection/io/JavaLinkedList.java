package java_learnings.basic.collection.io;
import java.util.*;

public class JavaLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList<Integer> al = new LinkedList<Integer>();
		LinkedList<Integer> al1 = new LinkedList<Integer>(List.of(30,20,50,60));
		LinkedList<Integer> al2 = new LinkedList<Integer>(List.of(70,80,90));

		al.add(10);
		al.add(1, 20);
		al.addAll(al1);
		al.addAll(6, al2);
		al.add(100);
		
		al.addFirst(3);
		al.addLast(200);
		System.out.println(al.getFirst());
		//			System.out.println(al.indexOf(20));
		for(var x : al)
			System.out.print(x+ " ");

		//			for(int i = 0; i<al.size();i++)
		//			{
		//				System.out.print(al.get(i)+" ");
		//			}
	}

}

