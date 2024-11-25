package com.java_learnings.basic.Multithreading;
class ATM{
	
	synchronized public void checkBalance(String cName) {
		System.out.println(cName + " Person is checking his balance");
		try{Thread.sleep(1000);}catch (Exception e) {}
		System.out.println("Balance");
	}
	
	 synchronized public void withdraw(String custName, int amount) {
		System.out.println(custName + " Person is withdrawnig : " + amount+ "$");
		try{Thread.sleep(1000);}catch (Exception e) {}
		System.out.println(amount);
	 }
}

class Customer extends Thread{
	ATM atm;
	String custName;
	int amount;
	
	public Customer(String custName, int amount, ATM atm) {
		this.atm = atm;
		this.custName = custName;
		this.amount = amount;
	}
	
	public void run() {
		atm.checkBalance(custName);
		atm.withdraw(custName, amount);
	}
}
public class ATMDemo {
	public static void main(String[] args) {
		ATM atm = new ATM();
		Customer cust1 = new Customer("Ankush",1000,atm);
		Customer cust2 = new Customer("Nagesh",2500, atm);
		cust1.start();
		cust2.start();
		
		
	}

}
