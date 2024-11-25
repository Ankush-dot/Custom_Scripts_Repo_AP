package java_learnings.basic.collection.io;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class JavaCollectionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Collection<Integer> nums = new ArrayList<Integer>();
		Set<Integer> nums1 = new HashSet<Integer>();
		
		nums.add(61);
		nums.add(8);
		nums.add(9);
		nums.add(11);
		nums.add(6);
		nums.add(11);
		
		nums1.add(61);
		nums1.add(8);
		nums1.add(9);
		nums1.add(11);
		nums1.add(6);
		nums1.add(11);
		
//		System.out.println(nums.get(2));
		
		for(int n : nums)
		{
			System.out.println(n);
		}

	}

}
