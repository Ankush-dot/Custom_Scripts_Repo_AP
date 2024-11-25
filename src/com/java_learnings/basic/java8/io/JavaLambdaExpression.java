package com.java_learnings.basic.java8.io;

@FunctionalInterface
interface AB  //Having only one Abstract method inside the Interface
{
	int add(int i, int j);
}

public class JavaLambdaExpression {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		AB obj = x -> System.out.println("In AB Show" + " | "+ x);  //Lambda Expression
//		
//		obj.show(5);
		
		AB obj = ( x,  y) ->  x+y;   //Lambda expression only work with functional interface
			
		int result = obj.add(10, 20);
		System.out.println(result);

	}

}
