package java_learnings.basic.oops.io;

class JavaConstructorTest {
	
	private double len;
	private double bre;
	
	public JavaConstructorTest()
	{
		len = 1;
		bre = 1;
	}
	public JavaConstructorTest(double l, double b) 
	{
		len = l;
		bre = b;
		
	}
	
	public JavaConstructorTest(double s)
	{
		len = bre=s;
		//System.out.println("fine");
	}
	public double area()
	{
		return getLen()*getBre();
	}
	public double getLen() {
		return len;
	}
	public void setLen(double len) {
		this.len = len;
	}
	public double getBre() {
		return bre;
	}
	public void setBre(double bre) {
		this.bre = bre;
	}
	
	
	

}

public class ConstructorTest
{
	public static void main(String[] args) 
	{
		JavaConstructorTest jct = new JavaConstructorTest(5);
		System.out.println(jct.area());
	}
	
}
