package java_learnings.basic.oops.io;

class CustomeException extends Exception
{
	public CustomeException(String Str) {
		// TODO Auto-generated constructor stub
		super(Str);
	}
}

public class JavaCustomExceptionDemo {
	public static void main(String[] args) {
		int i=20;
		int j = 0;
		
		try {
			j = 18/i;
			
			if(j==0)
			{
				throw new CustomeException("Can't be devided by zero..");
			}
			
		}
		catch(CustomeException e)
		{
			System.out.println("Something is wrong.. " + e);
		}
		
		System.out.println("Program is finished...");
		

	}	
	
}
