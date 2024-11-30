/**
 * @author Ankush Pawar
 * @version 17
 */
package com.java_learnings.lambdaexpressions;

@FunctionalInterface
interface MyFuncInterface{
	public void dispaly(String str);
}
/**
 * Class to explain MethodReference 
 * @author Ankush Pawar
 */

public class MethodReference {
	/**
	 * Constructor
	 * @param s
	 */
	
	public MethodReference(String s) {
		System.out.println(s.toUpperCase());
	}
	/**
	 * Static Class
	 * @param str
	 */
	
	public static void reverse(String str) {
		StringBuffer sb = new StringBuffer(str);
		sb.reverse();
		System.out.println(sb);
	}
	/**
	 * Not Static class
	 * @param str
	 */
	public void reverse1(String str) {
		StringBuffer sb = new StringBuffer(str);
		sb.reverse();
		System.out.println(sb);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyFuncInterface mfi = System.out::println;
		mfi.dispaly("From Display Method");
		
		
		MyFuncInterface mfi22 = MethodReference::new;  //calling Constructor
		mfi22.dispaly("Ankush");    
		
		MethodReference mr = new MethodReference("Demo");
		MyFuncInterface mfi11 = mr::reverse1;  //calling not static method using class object
		mfi11.dispaly("Hello");
		
		
		MyFuncInterface mfi1 = MethodReference::reverse; // calling static method using class name
		mfi1.dispaly("World");

	}

}
