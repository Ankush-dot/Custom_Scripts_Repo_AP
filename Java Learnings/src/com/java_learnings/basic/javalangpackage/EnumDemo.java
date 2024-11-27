package com.java_learnings.basic.javalangpackage;

enum Dept{
	CS("John", "BLock A"),IT("Ankush", "BLock B"),CIVIL("Nagesh", "BLock C"),ECE("Yogesh", "BLock D");
	String head;
	String location;
	private Dept(String head, String loc) {
		this.head = head;
		this.location = loc;
	}
	public String getHeadName() {
		return head;
	}
	public String getLocation() {
		return location;
	}
	
	public void display() {
		System.out.println(this.name()+ " " + this.ordinal());
	}
}
public class EnumDemo {

	public static void main(String[] args) {
		Dept d = Dept.CS;
		System.out.println(d.getHeadName());
		System.out.println(d.getLocation());
		//		System.out.println(d.ordinal());
		//		System.out.println(d.name());
		//		System.out.println(d.valueOf("IT"));

		//		Dept list[] = Dept.values();
		//		
		//		for(Dept x : list)
		//			System.out.println(x);

//		switch(d)
//		{
//		case CS: System.out.println("Head: Ankush \nBlock: A");
//		break;
//		case IT: System.out.println("Head: Nagesh \nBlock: B");
//		break;
//		case CIVIL: System.out.println("Head: Yogesh \nBlock: C");
//		break;
//		case ECE: System.out.println("Head: Sandip \nBlock: D");
//		break;
//		}

	}

}
