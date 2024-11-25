package java_learnings.basic.oops.io;

import java.util.Scanner;

class StackOverFlowException extends Exception
{
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "StackOverFLowException";
	}
}

class StackUnderFlowException extends Exception
{
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "StackUnderFlowException";
	}
}

class Stack
{

	private int size;
	private int top=-1;
	private int s[];

	public Stack(int sz) {
		// TODO Auto-generated constructor stub
		this.size = sz;
		s = new int[sz];

	}

	public void push(int x) throws StackOverFlowException
	{
		if(top==size-1)
			throw new StackOverFlowException();
		top++;
		s[top]=x;
	}
	public int pop() throws StackUnderFlowException
	{
		int x=-1;

		if(top == -1)
			throw new StackUnderFlowException();
		x = s[top];
		top--;
		return x;
	}

}


public class JavaUserDefinedException {

	public static void main(String[] args)
	{

		Stack st = new Stack(5);
		boolean stackOverflowOccurred = false;

		try
		{
			st.push(10);
			st.push(16);
			st.push(17);
			st.push(12);
			st.push(18);
			//st.push(13);
		}
		catch(StackOverFlowException s1)
		{
			System.out.println(s1);
			stackOverflowOccurred = true;
		}
		if(!stackOverflowOccurred)
			try
		{
				st.pop();
				st.pop();
				st.pop();
				st.pop();
				st.pop();
				st.pop();
				
		}
		catch(StackUnderFlowException s2)
		{
			System.out.println(s2);
		}

	}

}
