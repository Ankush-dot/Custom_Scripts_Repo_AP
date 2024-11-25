package java_learnings.basic.collection.io;

import java.util.HashMap;
import java.util.Map;

public class JavaMapDemo {
	
	public static void main(String[] args) {
		
		Map<String, Integer> stu = new HashMap<String, Integer>();
		
		stu.put("Ankush", 101);
		stu.put("Nagesh", 102);
		stu.put("Srushti", 103);
		stu.put("Manali", 104);
		stu.put("Ankush", 106);
		
		
		System.out.println(stu);
		System.out.println(stu.keySet());
		System.out.println(stu.values());
		
		for(String name : stu.keySet())
			System.out.println(name + " : " + stu.get(name));
		
	}
		
}
