package com.java_learnings.basic.java8.io;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class JavaStreamAPI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
		List<Integer> nums = Arrays.asList(4,5,7,2,6);
		
		//Function<Integer, Integer> fun =  n ->  n*2;
		//Predicate<Integer> p =  n -> n%2==0;
		
//		Stream<Integer> s1 = nums.stream();
//		Stream<Integer> s2 = s1.filter(n -> n%2==0);
//		Stream<Integer> s3 = s2.map(n -> n*2);
//		int result = s3.reduce(0,(c,e) -> c+e);
		
		Stream<Integer> sortedValues = nums.stream()
						.filter(n -> n%2==0)
						.sorted();		
			
		
		sortedValues.forEach(n -> System.out.println(n));
				
//		int result = nums.stream()
//						.filter(n -> n%2==0)
//						.map(n -> n*2)
//						.reduce(0,(c,e) -> c+e);
//		
//		System.out.println(result);
//		
//		for(int i = 0; i < nums.size(); i++) //Normal Loop
//		{
//			System.out.println(nums.get(i));
//		}
		
//		for(int n : nums)   //Enhance Loop
//		{
//			System.out.println(n);
//		}
		
//		nums.forEach(n -> System.out.println(n));
		
		//Consumer<Integer> con = (Integer t) -> System.out.println(t);  //Functional Interface
		
		//s3.forEach(n -> System.out.println(n));
		
		
		
		
		
		
		
		
//		int sum = 0;
//		for(int n : nums)
//		{
//			if(n%2==0)
//			{
//				n = n*2;
//				sum = sum + n;
//			}
//		}
//		
//		System.out.println(sum);
		
	}

}
