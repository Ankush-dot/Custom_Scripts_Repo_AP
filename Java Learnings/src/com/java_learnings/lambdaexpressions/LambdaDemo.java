package com.java_learnings.lambdaexpressions;

//Functional interface
@FunctionalInterface
interface MyLambda
{
	public int add(int str, int y);
}

// Interface as a parameter inside Lambda expression
@FunctionalInterface
interface MyLambda1
{
	public void display(String str);
}

class UseLambda{
	public void callLambda(MyLambda1 ml) {
		ml.display("from UseLambda");
	}
}

class LambdaDemo1{
	public void showLambda() {
		UseLambda ul = new UseLambda();
		ul.callLambda((ss)->{System.out.println(ss);});
}
}

//Accessing Instance, local variable
class LDemo 
{
	int B = 10000;
	public void meth1() {
		int c = 100;
		MyLambda1 ml = (s)->{
			int i = 10;
			System.out.println("Hello World");
			System.out.println(s + " " + i++);  //local variable can access and modify inside Lambda expression
			System.out.println(c); // Method local Variable can be access but can't modify, it should be final or not modify
			System.out.println(B++);  //Instance Variable can access inside lambda expression and can also modify
		};
		ml.display("Ankush");
		
	}

}


//Lambda Expression
public class LambdaDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyLambda ld = (s,z)->s+z;
		int rm = ld.add(20, 10);
		System.out.println(rm);

		MyLambda1 ld1 = (s)->{System.out.println(s);};
		ld1.display("OOKOKO");
		
		LDemo ld2 = new LDemo();
		ld2.meth1();
		LambdaDemo1 lmd1 = new LambdaDemo1();
		lmd1.showLambda();

	}

}
