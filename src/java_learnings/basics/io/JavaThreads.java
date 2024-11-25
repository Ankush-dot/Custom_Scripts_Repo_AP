package java_learnings.basics.io;

//class ABC implements Runnable
//{
//	public void run()
//	{
//		for(int i = 1; i<=5;i++)
//		{
//			System.out.println("Hi");
//			try {
//				Thread.sleep(10);
//			} catch (InterruptedException e) {e.printStackTrace();
//			}
//		}
//	}
//}

//class XYZ implements Runnable
//{
//	public void run()
//	{
//		for(int i = 1; i<=5;i++)
//		{
//			System.out.println("Hello");
//			try {
//				Thread.sleep(9);
//			} catch (InterruptedException e) {e.printStackTrace();
//			}
//		}
//	}
//}
//
class Counter
{
	int count;
	public synchronized void increment()
	{
		count++;
	}
}

public class JavaThreads 
{
	public static void main(String[] args) throws InterruptedException 
	{
		
		Counter c = new Counter();
		
		Runnable obj = () ->
			{
				for(int i = 1; i<=1000;i++)
				{
					c.increment();
				}
			};
			
			Runnable obj1 = () ->
			{
				for(int i = 1; i<=1000;i++)
				{
					c.increment();
				}
			};
			
			Thread t1 = new Thread(obj);
			Thread t2 = new Thread(obj1);
			
			t1.start();
			t2.start();
			
			t1.join();
			t2.join();
			
			System.out.println(c.count);
			
	}
}