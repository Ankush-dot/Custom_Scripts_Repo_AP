package java_learnings.basic.oops.io;

import practice_code.java.io.Member;

class Customer implements Member
{
	String name;
	
	public Customer(String name) {
		// TODO Auto-generated constructor stub
		this.name = name;
	}

	@Override
	public void callBack() {
		// TODO Auto-generated method stub
		System.out.println("Ok I'll Visit " + name);
	}
	
}

class Store

{
	
	Member mem[] = new Member[10];
	int count = 0;
	
	public void register(Member m)
	{
		mem[count++] = m;
		//System.out.println(count);
	}
	
	
	public void inviteSale() {
		for(int x=0;x<count;x++) {
			//System.out.println("Inside InviteSale for loop");
			mem[x].callBack();
		}
	}
}




public class JavaInterfacePractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Store st = new Store();
		Customer c1 = new Customer("Ankush");
		Customer c2 = new Customer("John");

		st.register(c1);
		st.register(c2);
		st.inviteSale();
		
		
	}

}
