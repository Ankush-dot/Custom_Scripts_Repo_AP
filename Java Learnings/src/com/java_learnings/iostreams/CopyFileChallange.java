package com.java_learnings.iostreams;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFileChallange {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		// TODO Auto-generated method stub


		try(FileInputStream fs = new FileInputStream("C:/Users/Ankus/Documents/Java IO Operations files/Text.txt")) {
			byte b[] = new byte[fs.available()];
			fs.read(b);
			String str = new String(b);
			fs.close();
			

			
			
			try (FileOutputStream fos = new FileOutputStream("C:/Users/Ankus/Documents/Java IO Operations files/CopyText.txt")) {
				byte[] b1 = str.toLowerCase().getBytes();
				fos.write(b1);
				fos.close();
			}

		}

	}

}
