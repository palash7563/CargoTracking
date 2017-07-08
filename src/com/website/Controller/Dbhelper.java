package com.website.Controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Dbhelper {

	public static Connection openConnection()
	{
		try
		{
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			Connection cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/consignertracking","root","palash98989");
			return cn;
		}catch(Exception e)
		{
			System.out.println("Dbhelper openconnection"+e);
			return null;
		}
	
}
	public static ResultSet executequery(Connection cn,String query)
	{
		try
		{
			Statement smt=cn.createStatement();
			ResultSet rs=smt.executeQuery(query);
			
			return rs;
		}
		catch(Exception e)
		{
			System.out.println("Dbhelper Execute query" +e);
			return null;
		}
	}
	
	public static boolean executeupdate(Connection cn,String query)
	{
		try
		{
			Statement smt=cn.createStatement();
			smt.executeUpdate(query);
			
			return true;
		}
		catch(Exception e)
		{
			System.out.println("Dbhelper Execute Update" +e);
			return false;
		}
	}
	

	}