package com.website.Controller;

import java.sql.Connection;

import com.website.model.Consigner;

public class ConsignerController {

	public static boolean addrecord(Consigner C)
	{
		try
		{
			Connection cn=Dbhelper.openConnection();
			String q="insert into consigner(firmname,registration_no,ownername,contactperson,mobileno,phoneno,email,address,country,state,city,deals_in,website,firmlogo,password) values('"+C.getFirmname()+"', '"+C.getRegistration_no()+"','"+C.getOwnername()+"','"+C.getContactperson()+"','"+C.getMobileno()+"', '"+C.getPhoneno()+"', '"+C.getEmail()+"', '"+C.getAddress()+"', '"+C.getCountry()+"','"+C.getState()+"','"+C.getCity()+"','"+C.getDeals_in()+"','"+C.getWebsite()+"','"+C.getFirmlogo()+"','"+C.getPassword()+"')";
			boolean st=Dbhelper.executeupdate(cn, q);
			return (st);
			
		}catch(Exception e)
		{
			System.out.println("Controller addrecord"+e);
			return false;
		}
	}
}
