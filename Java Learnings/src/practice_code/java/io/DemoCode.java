package practice_code.java.io;

import com.practice_code1.java.io.Computer;
import com.practice_code1.java.io.Desktop;

public class DemoCode {
	
	public static void main(String[] args) {
		
		
		Computer lap = new Laptop();
		
		Computer desk = new Desktop();
		
		Developer dev = new Developer();
		
		dev.devApp(desk);
		
		
	}

}