package java_learnings.basic.oops.io;

abstract class Car
{
	public abstract void drive();
	public abstract void fly();
	public abstract void carCamera();
	
	public void playMusic()
	{
		System.out.println("Play Music");
	}
}

abstract class WagonR extends Car
{
	public void drive()
	{
		System.out.println("Driving");
	}

	
}

class UpdatedWagnoR extends WagonR  //Concrete class
{

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println("flying");
	}

	@Override
	public void carCamera() {
		// TODO Auto-generated method stub
		System.out.println("Camera Working");
	}
	
}

public class JavaAbstractDemo {
	public static void main(String[] args) {
		
		Car obj = new UpdatedWagnoR();
		obj.drive();
		obj.playMusic();
		obj.carCamera();
		obj.fly();
		
	}

}
