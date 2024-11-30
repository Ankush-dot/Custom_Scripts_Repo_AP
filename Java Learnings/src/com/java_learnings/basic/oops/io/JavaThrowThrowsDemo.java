package com.java_learnings.basic.oops.io;

class NegativeDemensionException extends Exception
{
	public String toString()
	{
		return "Dimention of rectangle can't be Negative" ;
	}
}

public class JavaThrowThrowsDemo {
	
	
	static int area(int l, int b) throws NegativeDemensionException
	{
		if(l<0 || b<0)
			throw new NegativeDemensionException();
		return l*b;
	}
	
	static void meth1() throws NegativeDemensionException
	{
		System.out.println("Area is : "+ area(10,5));
	}
	
//	static int meth1()
//	{
//		return 10/0;
//	}
//	
//	static void meth2()
//	{
//		meth1();
//	}
//	static void meth3()
//	{
//		meth2();
//	}
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		try {
			meth1();
		} catch (NegativeDemensionException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
		finally
		{
			System.out.println("Bhaad me jai Exception, Apun to print hoga for sure!!");
		}
//		try
//		{
//			meth3();
//		}
//		catch(Exception e)
//		{
//			System.out.println(e);
//		}
		

	}

}
