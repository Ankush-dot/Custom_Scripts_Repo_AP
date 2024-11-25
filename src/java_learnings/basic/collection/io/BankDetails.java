package java_learnings.basic.collection.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Scanner;


class Account implements Serializable {

	//Scanner sc = new Scanner(System.in);

	String accNo;
	String name;
	Double balance;

	public Account()
	{

	}

	public Account(String accNo, String name, Double balance) {
		super();
		this.accNo = accNo;
		this.name = name;
		this.balance = balance;
	}


	@Override
	public String toString() {
		return "Account [accNo=" + accNo + ", name=" + name + ", balance=" + balance + "]";
	}

}
public class BankDetails {

	public static void main(String[] args) throws Exception {

		Scanner sc = new Scanner(System.in);

		Account acc = null;
		HashMap<String, Account> hm = new HashMap<String, Account>();

		try {
			FileInputStream file = new FileInputStream("Account.txt");
			ObjectInputStream ois = new ObjectInputStream(file);
		int count = ois.readInt();
		for(int i=0; i<count;i++)
		{
			acc = (Account)ois.readObject();
			System.out.println(acc);
			hm.put(acc.accNo, acc);
		}
		file.close();
		ois.close();
		}
		catch(Exception e)
		{
			
		}
		
		FileOutputStream fos = new FileOutputStream("Account.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		System.out.println("Menu");
		
		int choice;
		String accno,name;
		Double balance;
		
		do
		{
			System.out.println("1: Create Account");
			System.out.println("2: Delete Account");
			System.out.println("3: View Account");
			System.out.println("4: View All Account");
			System.out.println("5: Save Account");
			System.out.println("6: Exit ");
			System.out.println("Enter your Choice: ");
			choice = sc.nextInt();
			sc.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
			
			switch(choice)
			{
				case 1: System.out.println("Enter Details AccNo, Name, Balance ");
						accno = sc.nextLine();
						name = sc.nextLine();
						balance = sc.nextDouble();
						acc = new Account(accno,name,balance);
						hm.put(accno, acc);
						System.out.println("account Created for " + name);
				
						break;
				case 2: System.out.println("Enter AccNo ");
						//sc.nextLine();
						accno = sc.nextLine();
						hm.remove(accno);
						System.out.println(accno + " has been deleted Successfully!! ");
						break;
				case 3: System.out.println("Enter accno ");
						accno = sc.nextLine();
						acc = hm.get(accno);
						System.out.println(acc);
						break;
				case 4: 
						for(Account a: hm.values())
							System.out.println(a);
						break;
				case 5:
				case 6: oos.writeInt(hm.size());
						for(Account a:hm.values())
							oos.writeObject(a);
			}
		}while(choice!=6);
		oos.flush();
		oos.close();
		fos.close();

		
		}

	}
