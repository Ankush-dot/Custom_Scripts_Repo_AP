package java_learnings.basics.io;

class FinalKeyword  //if the class declared as final then it can not be inherited
{
	final float pi;  //final variable should be initialize while declaring only
//	pi = 1.f;  //final variable/member can not be initialize after declare 
//	{
//		pi = 1000f;    //using bracket also we can initialize final variable
//	}
	
	public FinalKeyword() {
		// TODO Auto-generated constructor stub
		pi = 100.5f;  //we can initialize final member using constructor
	}
	
	public final void show()  //if the method declared as final then it can't be override
	{
		System.out.println("Hello");
	}
}

public class JavaFInalKeyWord {
	
	public static void main(String[] args) {
		
		
		
	}

}
