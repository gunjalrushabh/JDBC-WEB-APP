package com.dbutil;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DButil {
private static Connection con;

public static void openConnection() throws SQLException, ClassNotFoundException
{
	
	Class.forName("com.mysql.cj.jdbc.Driver");//reflection
	//com.mysql.cj.jdbc.Driver.class
	System.out.println("Driver are Loaded....");
//	
	
	con=DriverManager.getConnection("jdbc:mysql://localhost:3307/facebook","root","root123");
	System.out.println("Connection name : "+con);
	System.out.println("Connected to FACBBOOK DATABaSE");
}

public static Connection getCon() {
	return con;
}
public static void closeConnection() throws SQLException
{
	con.close();
}
}
