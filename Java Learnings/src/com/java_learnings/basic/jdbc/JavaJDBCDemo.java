package com.java_learnings.basic.jdbc;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.*;
import java.util.Properties;  

public class JavaJDBCDemo{  
	public static void main(String args[]){  

		Properties properties = new Properties();
		FileInputStream input;
		try {
			input = new FileInputStream("DB_Credentials.properties");

			properties.load(input);


			String url = "jdbc:mysql://localhost:3306/departments";
			String userName = properties.getProperty("DB_UserName");
			String Password = properties.getProperty("DB_Password"); 
			//System.out.println(Password);

			//Connecting JDBC Driver
			Class.forName("com.mysql.cj.jdbc.Driver");  
			Connection con=DriverManager.getConnection(url,userName,Password);  

			//Writing query using Stem
			Statement stmt=con.createStatement();  
			ResultSet rs=stmt.executeQuery("select * from dept");  

			while(rs.next())  {
				System.out.println(rs.getInt("deptno")+"  "+rs.getString("dname"));  
			}
			con.close();

		}catch (IOException | ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}   

	}  
}  