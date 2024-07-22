package com.conn;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBconnect {
	
	private static Connection conn;
	
	public static Connection getconn() {
		
		try {
			
			if(conn==null) {
				 Class.forName("com.mysql.cj.jdbc.Driver");

	              // Creating connection
	              String url = "jdbc:mysql://localhost:3306/phonebook";
	              String username = "root";
	              String password = "sarvesh1122#";

	              conn = DriverManager.getConnection(url, username, password);
			}
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
		return conn;
		
	}
	

}
