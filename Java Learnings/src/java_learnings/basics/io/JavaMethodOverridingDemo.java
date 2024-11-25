package java_learnings.basics.io;


class AB
{
	public void show()
	{
		System.out.println("Inside A Show");
	}
	
	public void config()
	{
		System.out.println("Inside A config");
	}
	
}

class BC extends AB
{
	public void show()
	{
		config();
		System.out.println("Inside B show ");
	}

}


public class JavaMethodOverridingDemo {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BC obj = new BC();
		
		obj.show();

	}

}
