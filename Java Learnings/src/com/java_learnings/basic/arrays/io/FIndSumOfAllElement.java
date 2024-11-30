package com.java_learnings.basic.arrays.io;



public class FIndSumOfAllElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a = {1,2,3,5,7,9,4,12,6,8,5};
//		int sum=0;
//		for(int i : a) {
//			sum = sum + a[i];
//			System.out.println(sum);
//		}
//		System.out.println(sum);
		
		//finding an element
//		int key=3;
//		for(int i=0;i<a.length;i++) {
//			
//			if(a[i]==key) {
//				System.out.println(i);
//				System.exit(0);
//			}
//		}
//		System.out.println("Not Found!!");
		
		//find a max value and second max value
		int max1 = a[0], max2 = a[0];
		for(int x : a)
		{
			if(x>max1) {
				max2=max1;
				max1= x;
			}
			else if(x>max2)
			{
				max2=x;
			}
		}
		System.out.println("maximum value is : " + max1);
		System.out.println("Second maximum value is : " + max2);
	}

}
