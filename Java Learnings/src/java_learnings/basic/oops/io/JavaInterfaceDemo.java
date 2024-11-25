package java_learnings.basic.oops.io;

interface Test
{
	void meth1();
	void meth2();
}

class MyTest implements Test
{

	@Override
	public void meth1() {
		// TODO Auto-generated method stub
		System.out.println("Inside Meth1 of MyTest");
		
	}

	@Override
	public void meth2() {
		// TODO Auto-generated method stub
		System.out.println("Inside Meth2 of MyTest");
	}
	
	
}

public class JavaInterfaceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test t = new MyTest();
		t.meth1();
		t.meth2();
		
		//MyTest mt = new Test();  not possible
	}

}
