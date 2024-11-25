package java_learnings.basic.oops.io;

enum Status
{
	
	InProgreess(400), InReview(202), Approved(500), Closed(101), Cancelled(100);
	
	private int price;
	
	private Status(int price)
	{
		this.price = price;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
}

class JavaEnum {
	
	public static void main(String a[]) 
	{
		Status sa = Status.InReview;
//		sa.setPrice(808);
		System.out.println(sa + " : " + sa.getPrice());
//		System.out.println(sa);
		
		
		
//		for(Status sa: Status.values())
//		{
//			sa.setPrice(sa[0] = 808);
//			System.out.println(sa + " : " + sa.getPrice());
//		}
	}
}
