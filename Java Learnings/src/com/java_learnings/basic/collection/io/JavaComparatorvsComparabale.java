package com.java_learnings.basic.collection.io;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


class Students //implements Comparable<Students>
{
	int age;
	String name;
	
	public Students(int age, String name) {
		this.age = age;
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Students [age=" + age + ", name=" + name + "]";
	}

//	@Override
//	public int compareTo(Students that) {    //Sorting logic
//		
//		if(this.age > that.age)
//			return 1;
//		else
//			return -1;
//	}
}


public class JavaComparatorvsComparabale {
	
	public static void main(String[] args) {
		
		Comparator<Students> com = ( i,  j) -> i.age > j.age?1:-1;  //Sorting
		
		List<Students>studs = new ArrayList<Students>();
		
		studs.add(new Students(22, "Ankush"));
		studs.add(new Students(24, "Nagesh"));
		studs.add(new Students(19, "Rahul"));
		studs.add(new Students(31, "Manisha"));
		studs.add(new Students(28, "Monali"));
		
		Collections.sort(studs, com);
		
		for(Students s: studs)
			System.out.println(s);
	}

}
