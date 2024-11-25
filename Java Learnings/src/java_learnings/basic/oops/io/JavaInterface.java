package java_learnings.basic.oops.io;


// class -> class --> extends
// class -> interface --> implements
// interface -> interface --> extends


interface Bk
{
	int age = 20;    //By-defualt final and static
	String area = "Pune";
	public abstract void show();
	public abstract void config();
}

interface XX
{
	public abstract void show1();
	public abstract void config1();
}

interface YY extends XX
{
	void run();
}

class Sk implements Bk, XX
{
	public void show()
	{
		System.out.println("in show");
	}
	
	public void config()
	{
		System.out.println("in Config");
	}

	@Override
	public void show1() {
		// TODO Auto-generated method stub
		System.out.println("in show1");
	}

	@Override
	public void config1() {
		// TODO Auto-generated method stub
		System.out.println("in Config1");
	}
}

public class JavaInterface {
	
	public static void main(String[] args) {
		
		Sk bk = new Sk();
		bk.show();
		bk.config();
		
		XX obj1 = new Sk();
		obj1.show1();
		obj1.config1();
		
		System.out.println(bk.area);
	}

}
