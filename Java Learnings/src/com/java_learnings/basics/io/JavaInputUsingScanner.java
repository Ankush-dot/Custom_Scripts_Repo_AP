package com.java_learnings.basics.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class JavaInputUsingScanner {
	public static void main(String[] args) throws IOException {
		System.out.println("Enter a number");
		
//		InputStreamReader n = new InputStreamReader(System.in);
//		BufferedReader bf = new BufferedReader(n);
//		
//		int num = Integer.parseInt(bf.readLine());
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		System.out.println(num);
		
	}

}
