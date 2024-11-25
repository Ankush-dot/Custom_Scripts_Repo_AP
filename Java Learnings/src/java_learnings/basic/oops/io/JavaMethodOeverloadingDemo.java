package java_learnings.basic.oops.io;


class ABC
{
	public void display() {
		System.out.println("Hello world");
	}
}

class XYZ extends ABC{
	
	public void display(int v) {
		System.out.println("Hi All");
	}
	public void show() {
		System.out.println("Planning to go office");
	}
}
public class JavaMethodOeverloadingDemo {
	
	public static void main(String[] args) {
		
//		ABC obj = new ABC();
//		obj.display();
//		
//		XYZ obj1 = new XYZ();
//		obj1.display();
//		
		ABC obj2 = new XYZ();   //Dynamic Method Dispatch
		obj2.display();
	}

}
