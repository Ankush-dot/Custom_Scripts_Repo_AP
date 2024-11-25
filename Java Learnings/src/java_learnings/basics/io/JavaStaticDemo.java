package java_learnings.basics.io;

import java.util.Date;

class Student{
	
	private String rollNo;
	private static int count =  1;
	
	private String genrateRollNo()
	{
		Date date = new Date();
		
		String rn = "Univ-"+(date.getYear()+1900+"-"+count);
		count++;
		Math.sqrt(count);
		return rn;
		
		
	}
	public Student()
	{
		rollNo = genrateRollNo();
	}
	public String getAccountNO() {
		return rollNo;
	}
	
}

class Bank{
	
	private String accountNo;
	private static int count =  1;
	
	private String genrateAccountNO()
	{
		Date date = new Date();
		
		String rn = "SBI-"+(date.getYear()+1900+"-"+count);
		count++;
		return rn;
		
	}
	public Bank()
	{
		accountNo = genrateAccountNO();
	}
	public String getAccountNO() {
		return accountNo;
	}
	
}


public class JavaStaticDemo {
	public static void main(String[] args) {
		Bank b = new Bank();
		Bank b1 = new Bank();

		System.out.println("Account no of User is : "+ b.getAccountNO() );
		System.out.println("Account no of User is : "+ b1.getAccountNO() );
	}
	
	
}
