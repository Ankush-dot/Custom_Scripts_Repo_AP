package java_learnings.basic.oops.io;

public class JavaExceptionUsinfThrowKeyword {

	public static void main(String[] args) {
		int i=0;
		int j = 0;
		
		try {
			j = 18/i;
			if(j==0)
			{
				throw new ArithmeticException();
			}
		}
		catch(ArithmeticException e)
		{
			System.out.println("Something is wrong.. " + e);
		}
		
		System.out.println("Program is finished...");
		

	}

}
