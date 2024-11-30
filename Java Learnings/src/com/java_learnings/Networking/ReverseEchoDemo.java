package com.java_learnings.Networking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ReverseEchoDemo {
	
	public static void main(String[] args) throws IOException {
		
		ServerSocket ss = new ServerSocket(2000);
		
		Socket stk = ss.accept();
		
		BufferedReader br = new BufferedReader(new InputStreamReader(stk.getInputStream()));
		PrintStream ps = new PrintStream(stk.getOutputStream());
		
		String msg;
		do {
			msg = br.readLine();
			StringBuilder sb = new StringBuilder(msg);
			sb.reverse();
			
			msg=sb.toString();
			ps.println(msg);
		}while(msg.equals("dne"));
	}

}

class Client {
	
	public static void main(String[] args) throws IOException {
		
		Socket stk = new Socket("192.168.0.108", 2000);
		
//		Socket stk = ss.accept();
		
		BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
		BufferedReader br = new BufferedReader(new InputStreamReader(stk.getInputStream()));
		PrintStream ps = new PrintStream(stk.getOutputStream());
		
		String msg;
		do {
			msg = br1.readLine();
			ps.println(msg);
			msg=br.readLine();
			System.out.println("from Server : " + msg);
			
		}while(!msg.equals("dne"));
	}

}