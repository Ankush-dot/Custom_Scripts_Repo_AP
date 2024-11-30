package com.java_learnings.Networking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

public class MultiReverseEcho extends Thread {
	Socket stk;
	
	public MultiReverseEcho(Socket st) {
		stk=st;
	}
	public void run() {
		try {
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
			stk.close();
		}catch(Exception e) {}
	}

	public static void main(String[] args) throws IOException {
		ServerSocket ss = new ServerSocket(2000);
		Socket stk;
		MultiReverseEcho re;
		int count =0;
		do {
			stk = ss.accept();
			System.out.println("Client Connected : "+ count++);
			re = new MultiReverseEcho(stk);
			re.start();
			
		}while(true);
		


	}
}

class Client1 {

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