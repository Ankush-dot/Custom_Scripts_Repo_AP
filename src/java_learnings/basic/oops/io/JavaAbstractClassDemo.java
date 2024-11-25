package java_learnings.basic.oops.io;

abstract class Something
{
	public Something() {
		System.out.println("Inside Something constructor");
	}
	
	 public abstract void math1();
}

class Anything extends Something
{
	public Anything() {
		System.out.println("Inside Anything constructor");
	}
	
	public void math1(){
		System.out.println("Inside Anything Math1");
	}
}

public class JavaAbstractClassDemo {
	
	public static void main(String[] args) {
		
//		Anything any = new Anything();
//		any.math1();
		Something some = new Anything();
		some.math1();
		
	}

}
