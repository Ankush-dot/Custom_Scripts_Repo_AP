package com.java_learnings.basics.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class JavaTryWithResource {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		int num = 0;
		BufferedReader bf = null;
		try
		{
			bf = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter a number : ");
			num = Integer.parseInt(bf.readLine());
			System.out.println(num);
			
		}
		finally //to closing the resources
		{
			bf.close();  
		}

	}

}
