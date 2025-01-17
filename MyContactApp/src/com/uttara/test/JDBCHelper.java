package com.uttara.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCHelper {

	public static void close(Connection x)
	{
		try
		{
			if(x!=null)
				x.close();
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
	}
	
	public static void close(Statement x)
	{
		try
		{
			if(x!=null)
				x.close();
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
	}	
	
	public static void close(ResultSet x)
	{
		try
		{
			if(x!=null)
				x.close();
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
	}
	
	public static Connection getConnection()
	{		
		String url = "jdbc:hsqldb:hsql://localhost/";
		String uid = "SA";
		String pwd = "";

		Connection con = null;
		try
		{
			Class.forName("org.hsqldb.jdbcDriver");
			con = DriverManager.getConnection(url,uid,pwd);
			return con;
		}
		catch(SQLException e)
		{
			e.printStackTrace();
			return null;
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
		
	}
	
}

