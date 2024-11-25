package java_learnings.basic.oops.io;

//class Circle{
//	public double radius;
//	
//	public double area()
//	{
//		return	Math.PI*radius*radius;
//	}
//	public double perimeter()
//	{
//		return	2*Math.PI*radius;
//	}
//	public double circumference()
//	{
//		return	perimeter();
//	}
//}

public class JavaClassDemo {
	
	public static void main(String[] args) {
		
		//Circle ci = new Circle();
		Circle ci = new Circle();
		ci.radius=67;
		System.out.println("Area is : " + ci.area());
		System.out.println("Perimeter is : " + ci.perimeter());
		System.out.println("circuference is : " + ci.circumference());
	}
	
	
  

}
