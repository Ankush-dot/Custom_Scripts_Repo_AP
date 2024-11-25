package practice_code.java.io;


class Demo1
{
	public int i = 10;
	protected int j = 20;
	private int k = 30;
	int l = 40;
}

class Demo2 extends Demo1
{
	public void meth1()
	{
		System.out.println("Value of Public Modifier : " + i);
		//System.out.println("Value of Private Modifier : " + k);
		System.out.println("Value of protected Modifier : " + j);
	}
}



public class JavaChecks {
	public static void main(String[] args) {
		Demo2 d2 = new Demo2();
		
		d2.meth1();
	}

}
