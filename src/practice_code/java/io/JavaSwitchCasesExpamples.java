package practice_code.java.io;

import java.util.Scanner;

public class JavaSwitchCasesExpamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		//Find Day based on number
		//		Scanner sc = new Scanner(System.in);
		//
		//		System.out.println("Enter a number : ");
		//		int num = sc.nextInt();
		//		if(num>0 && num<=31)
		//		{
		//			switch(num)
		//			{
		//			case 1: System.out.println("Monday");
		//			break;
		//
		//			case 2: System.out.println("Tuesday");
		//			break;
		//
		//			case 3: System.out.println("Wenesday");
		//			break;
		//
		//			case 4: System.out.println("Thursday");
		//			break;
		//
		//			case 5: System.out.println("Friday");
		//			break;
		//
		//			case 6: System.out.println("Saturday");
		//			break;
		//
		//			case 7: System.out.println("Sunday");
		//			break;
		//
		//			default : System.out.println("Invalid Number!!");
		//			}
		//		}else {
		//			System.out.println("Please type number between 1 to 31");
		//		}


		//Find Month based on num.

		//		Scanner sc = new Scanner(System.in);
		//
		//		System.out.println("Enter a number : ");
		//		int num = sc.nextInt();
		//		if(num>0 && num<=12)
		//		{
		//			switch(num)
		//			{
		//			case 1: System.out.println("Jan");
		//			break;
		//
		//			case 2: System.out.println("Feb");
		//			break;
		//
		//			case 3: System.out.println("Mar");
		//			break;
		//
		//			case 4: System.out.println("Apr");
		//			break;
		//
		//			case 5: System.out.println("May");
		//			break;
		//
		//			case 6: System.out.println("June");
		//			break;
		//
		//			case 7: System.out.println("July");
		//			break;
		//			
		//			case 8: System.out.println("Aug");
		//			break;
		//			
		//			case 9: System.out.println("Sept");
		//			break;
		//			
		//			case 10: System.out.println("Oct");
		//			break;
		//			
		//			case 11: System.out.println("Nov");
		//			break;
		//			
		//			case 12: System.out.println("Dec");
		//			break;
		//			}
		//		}else {
		//			System.out.println("Please type number between 1 to 12");
		//		}

		//Find Type of Website

		//		String url = "http://www.google.com";
		//
		//		String ext = url.substring(url.lastIndexOf("."));
		//		String protocol = url.substring(0, url.indexOf(":"));
		//
		//		switch(protocol)
		//		{
		//		case "http": System.out.println("it's a Hyper Text Markup protocol");
		//		break;
		//
		//		case "ftp": System.out.println("it's a File transfer protocol");
		//		break;
		//		
		//		default : System.out.println("Not sure about protocol");
		//		}
		////		System.out.println(ext);
		////		System.out.println(protocol);
		//		switch(ext)
		//		{
		//		case ".com": System.out.println("it's a commertial Site");
		//		break;
		//
		//		case ".org": System.out.println("it's a Organizational Site");
		//		break;
		//
		//		case ".net": System.out.println("it's a network Site");
		//		break;
		//
		//		default: System.out.println("Not Sure");
		//		}

		Scanner sc = new Scanner(System.in);


		System.out.println("Enter two Number : ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();


		System.out.println("Options are : " 
				+ '\n' + "ADD" 
				+ '\n' + "SUB"
				+ '\n' + "MUL"
				+ '\n' + "DIV");

		System.out.println("Please Type your option from above options : ");
		String str = sc.next().toUpperCase();
		

		switch(str)
		{
		case "ADD": System.out.println("Addition is : " + (num1 + num2));
		break;
		case "SUB": System.out.println("Substraction is : " + (num1 - num2));
		break;
		case "MUL": System.out.println("Multipicaton is : " + (num1 * num2));
		break;
		case "DIV": System.out.println("Dvision is : " + (num1 / num2));
		break;
		default : System.out.println("Entered Option is wrong");
		}
	}

}
