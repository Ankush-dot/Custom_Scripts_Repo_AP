package java_learnings.basic.collection.io;

import java.util.ArrayDeque;

public class JavaDeque {
	public static void main(String[] args) {
		ArrayDeque<Integer> ad = new ArrayDeque<Integer>();

		ad.offerLast(10);
		ad.offerLast(20);
		ad.offerLast(30);
		ad.offerLast(40);
		ad.forEach((x)-> System.out.print(x+" "));
		System.out.println();
		ad.offerFirst(50);
		ad.offerFirst(60);
		ad.offerFirst(70);
		ad.offerFirst(80);
		System.out.println(ad.peekLast());
		ad.forEach((x)-> System.out.print(x+" "));

	}
}
