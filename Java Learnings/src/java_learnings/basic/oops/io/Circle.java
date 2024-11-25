package java_learnings.basic.oops.io;

public class Circle{
	public double radius =40;
	
	public double area()
	{
		return	Math.PI*radius*radius;
	}
	public double perimeter()
	{
		return	2*Math.PI*radius;
	}
	public double circumference()
	{
		return	perimeter();
	}
}
