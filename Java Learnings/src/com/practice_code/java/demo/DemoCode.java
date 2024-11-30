package com.practice_code.java.demo;

import com.practice_code.java.io.Computer;
import com.practice_code.java.io.Desktop;

public class DemoCode {
	
	public static void main(String[] args) {
		
		
		Computer lap = new Laptop();
		
		Computer desk = new Desktop();
		
		Developer dev = new Developer();
		
		dev.devApp(desk);
		
		
	}

}