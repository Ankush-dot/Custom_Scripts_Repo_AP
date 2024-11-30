package com.practice_code.java.demo;

public class TypeOfWebsites {
	
	public static void main(String[] args) {
		
		String url = "https://www.org.gle.net";
		
		String protocal = url.substring(0, url.indexOf(":"));
		
		if(protocal.equals("https"))
		{
			System.out.println("it's a 'Hyper Test transfer protocal'");
		}else if(protocal.equals("ftp"))
		{
			System.out.println("it's a 'File transfer protocal'");
		}
		
		String ext = url.substring(url.lastIndexOf("."));
		
		
		if(ext.equals(".com"))
		{
			System.out.println("it's a comertial Site!! ");
		}else if(ext.equals(".net")) 
		{
			System.out.println("it's a network Site!! ");
		}else if(ext.equals(".org")) 
		{
			System.out.println("it's a organisational Site!! ");
		}else {
			System.out.println("Not Sure!!");
		}
	}

}
