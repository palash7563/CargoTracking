package com.website.Controller;

import java.sql.Connection;
import java.sql.ResultSet;

public class CountryStateCity {

	public static ResultSet getallcountry()
	{
		try
		{
			Connection cn=Dbhelper.openConnection();
			ResultSet rs=Dbhelper.executequery(cn, "Select * from country");
			return rs;
		}
		catch(Exception E)
		{
			System.out.println("COUNTRYSTATECITY GETALLCOUNTRY "+E);
			return null;
		}
	}
	public static ResultSet getallState(int countryid)
	{
		try
		{
			Connection cn=Dbhelper.openConnection();
			ResultSet rs=Dbhelper.executequery(cn, "Select * from state where countryid="+countryid);
			return rs;
		}catch(Exception E)
		{
			System.out.println("Countrystatecity getallstate "+E);
			return null;
		}
	}
	public static ResultSet getallCity(int stateid)
	{
		try
		{
			Connection cn=Dbhelper.openConnection();
			ResultSet rs=Dbhelper.executequery(cn, "Select * from city where stateid="+stateid);
			return rs;
		}catch(Exception E)
		{
			System.out.println("Countrystatecity getallcity "+E);
			return null;
		}
	}
}
