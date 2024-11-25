package java_learnings.basic.oops.io;

public class JavaExceptions {
	
	public static void main(String[] args) {
		int i = 2;
		int j = 0;
		
		String str = null;
		
		int nums[] = new int[5];
		
		nums[0] = 10;
		nums[1] = 20;
		nums[2] = 30;
		nums[4] = 40;
		
		try 
		{
			j = 18/i;
			System.out.println(str.length());
			//System.out.println(nums[1]);
			System.out.println(nums[5]);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Cannot devided by Zero");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Stay in your limits");
		}
		catch(Exception e)
		{
			System.out.println("Something wrong... " + e);
		}
		
		
		System.out.println(j);
		System.out.println("End of the code");
	}

}
