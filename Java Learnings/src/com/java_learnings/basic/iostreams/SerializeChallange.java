package com.java_learnings.basic.iostreams;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Scanner;

class Customer implements Serializable{
	
	String custId;
	String name;
	String phoneNo;
	
	static int count =0;
	
	//public Customer() {}

	public Customer( String name, String phoneNo) {
		super();
		this.custId = "c"+count;
		count++;
		this.name = name;
		this.phoneNo = phoneNo;
	}

	@Override
	public String toString() {
		return "Customer [custId=" + custId + ", name=" + name + ", phoneNo=" + phoneNo + "]";
	}
	
	
	
}
public class SerializeChallange {

//	public static void main(String[] args) throws IOException {
//		// TODO Auto-generated method stub
//		
//		Customer c[] = {new Customer("Ankush", "5426124526"),new Customer("Yogesh", "5445124526"),new Customer("Nagesh", "5426124523")};
//		
//		FileOutputStream fos = new FileOutputStream("Customer.txt");
//		ObjectOutputStream oos = new ObjectOutputStream(fos);
//		
//		oos.writeInt(c.length);
//		for(Customer c1: c) {
//			oos.writeObject(c1);
//		}
//		
//		oos.close();
//		fos.close();
	
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		 Scanner sc = new Scanner(System.in);
		 
		 FileInputStream fis = new FileInputStream("Customer.txt");
		 ObjectInputStream ois = new ObjectInputStream(fis);
		 
		 int length = ois.readInt();
		 
		 Customer c[] = new Customer[length];
		 
		 for(int i = 0; i<length;i++) {
			 c[i] = (Customer) ois.readObject();
			 System.out.println(c[i]);
			 
		 }
		 
//		 System.out.println("Enter Name of Customer : ");
//		 String name = sc.nextLine();
//		 
//		 for(int j=0; j<length;j++) {
//			 
//			 if(name.equalsIgnoreCase(c[j].name))
//				 System.out.println(c[j]);
//			 
//		 }
		 
		
		
		 ois.close();
		 fis.close();
	}

}
