package com.java_learnings.basic.iostreams;

import java.io.FileInputStream;

public class IOClasses {

	public static void main(String[] args) throws Exception{
		//OutputFileStream

		//		try {
		//			FileOutputStream fos = new FileOutputStream("C:/Users/Ankus/Documents/Java IO Operations files/Text.txt");
		//			String str = "My Self Ankush Pawar";
		//			byte[] b = str.getBytes();  
		//			
		//			fos.write(b);
		//			/*byte[] b = str.getBytes(); //write a data inside file using loop
		//			for(byte x: b){
		//				fos.write(x);
		//			}*/
		//			
		// 			//fos.write(str.getBytes());  //Write a data inside file
		//			
		//			
		////			byte[] b = str.getBytes();  
		////			fos.write(b, 3, str.length()-3); // writing a specific data inside file.
		//			
		//			fos.close();
		//		}
		//		catch(FileNotFoundException fnf) {
		//			System.out.println(fnf);
		//		}
		//		catch(IOException io) {
		//			System.out.println(io);
		//		}
		//		

		//InputFileStream
		try (FileInputStream fis = new FileInputStream("C:/Users/Ankus/Documents/Java IO Operations files/Text.txt")){
			
			//Approach-1
			//			byte b[] = new byte[fis.available()];
			// 			fis.read(b);
			// 			
			// 			String str = new String(b);
			// 			System.out.println(str);

			//Approach-2
			
			int x;
			
			while((x=fis.read())!=-1)
			{
				System.out.print((char)x);
			}
			
			//Approach-3
			
//			do 
//			{
//				x=fis.read();
//				if(x!= -1)
//					System.out.print((char)x);
//			}while(x!= -1);

		}

	}

}
