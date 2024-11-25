package practice_code.java.io;

import java.awt.dnd.Autoscroll;
import java.util.Scanner;

public class JavaWhileLoopPratice {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Number : ");
		int num = sc.nextInt();
		//Amstrong number
		
//		int copy = num;
//		int rem = 0;
//		int cube = 0;
//		
//		while(num>0) {
//			rem = num%10;
//			num = num/10;
//			cube = cube + rem*rem*rem;
////			/System.out.println(cube);
//			
//		}
//		System.out.println(num);
//		if(cube == copy) {
//			System.out.println("It's an amstrong number!!");
//		}
//		else
//		{
//			System.out.println("It's not an amstrong number!!");
//		}
		
		//To Reverse a number
//		int rem = 0;
//		int rev = 0;
//		int copy = num;
//		while(num>0) {
//			rem = num%10;
//			
//			num = num/10;
//			rev = rev*10+rem;
//			
//			//System.out.println(rem);
//		}
//		System.out.println(rev);
		
		
		//finding a given number is palindrome or not
//		int rem = 0;
//		int rev = 0;
//		int copy = num;
//		while(num>0) {
//			rem = num%10;
//			
//			num = num/10;
//			rev = rev*10+rem;
//			
//			//System.out.println(rem);
//		}
//		System.out.println(rev);
//		if(rev == copy) {
//			System.out.println("it's a palindrome number");
//		
//		}
//		else
//		{
//			System.out.println("it's not a palindrome number");
//		}
		
		//Display the number in with words even with tailing Zero
		int rem = 0;
		String str = "";
		
		while(num>0) {
			rem = num%10;
			num = num/10;
			str = str + rem;
			//rev = rev*10+rem;
			//System.out.println(rem);
			
		}
		//System.out.println(str);
		char c = 0;
		for(int i = str.length()-1;i>=0; i--)
		{
			
			c = str.charAt(i);
			//system.out.println(c);
			switch(c)
			{
			case '1' : System.out.println(c + " = " + "One");
			break;
			case '2' : System.out.println(c + " = " + "Two");
			break;
			case '3' : System.out.println(c + " = " + "Three");
			break;
			case '4' : System.out.println(c + " = " + "Four");
			break;
			case '5' : System.out.println(c + " = " + "Five");
			break;
			case '6' : System.out.println(c + " = " + "Six");
			break;
			case '7' : System.out.println(c + " = " + "Seven");
			break;
			case '8' : System.out.println(c + " = " + "Eight");
			break;
			case '9' : System.out.println(c + " = " + "Nine");
			break;
			case '0' : System.out.println(c + " = " + "Zero");
			break;
			}
		}
		
	}

}
