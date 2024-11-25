package java_learnings.basic.oops.io;

class AK
{
	public void show()
	{
		System.out.println("in AK Show");
	}
}

//class AP extends AK
//{
//	public void show()
//	{
//		System.out.println("in BK Show");
//	}
//}

public class JavaAnonymousInnerClass {
	public static void main(String[] args) 
	{
		
		AK obj = new AK()
		{
			public void show()
			{
				System.out.println("In new show");
				
			}
		};
		obj.show();
		
	}

}
