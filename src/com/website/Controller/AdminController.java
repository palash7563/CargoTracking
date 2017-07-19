package com.website.Controller;

import java.sql.Connection;
import java.sql.ResultSet;

import com.website.model.Admin;

public class AdminController {
	public static Admin checkpassword(String id,String password)
	{
		try
		{
			Connection cn=Dbhelper.openConnection();
			String q="select * from admin where adminid='"+id+"' and password='"+password+"'";
			ResultSet rs=Dbhelper.executequery(cn, q);
			if(rs.next())
			{
				Admin a=new Admin();
				a.setAdminid(rs.getString(1));
				a.setAdminname(rs.getString(2));
				a.setPicture(rs.getString(4));
				return a;
			}
			else
			{
				return null;
			}
		}
		catch(Exception E)
		{
			System.out.println("Admin Controller checkpassword "+E);
			return null;
		}
	}

}
