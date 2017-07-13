package com.website.Controller;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

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
	public static ResultSet displayAll()
	{
		try
		{
			Connection cn=Dbhelper.openConnection();
			String q="select id,firmname,registration_no,ownername,contactperson,mobileno,phoneno,email,address,(Select countryname from country C where C.countryid=CC.country),(select statename from state S where S.stateid=CC.state),(select cityname from city Ci where Ci.cityid=CC.city),deals_in,website,firmlogo from consigner CC";
			ResultSet rs=Dbhelper.executequery(cn, q);
			return rs;
		}
		catch(Exception e)
		{
			System.out.println("ConsignerController:displayAll:"+e);
			return null;	
		}
	}
	public static Consigner displayById(int cid)
	{
		try
		{
		Connection cn=Dbhelper.openConnection();
		String q="select id,firmname,registration_no,ownername,contactperson,mobileno,phoneno,email,address,country,(select countryname from country C where C.countryid=CC.country),state,(select statename from state S where S.stateid=CC.state),city, (select cityname from city CI where CI.cityid=CC.city) ,deals_in,website,firmlogo from consigner CC where CC.id="+cid;
		ResultSet rs=Dbhelper.executequery(cn, q);
		if(rs.next())
		{ Consigner C=new Consigner();
		  C.setId(Integer.parseInt(rs.getString(1)));
		  C.setFirmname(rs.getString(2));
		  C.setRegistration_no(rs.getString(3));
		  C.setOwnername(rs.getString(4));
		  C.setContactperson(rs.getString(5));
		  C.setMobileno(rs.getString(6));
		   C.setPhoneno(rs.getString(7));
		   C.setEmail(rs.getString(8));
		   C.setAddress(rs.getString(9));
		   C.setCountry(rs.getString(10)+","+rs.getString(11));
		   C.setState(rs.getString(12)+","+rs.getString(13));
		   C.setCity(rs.getString(14)+","+rs.getString(15));
		   C.setDeals_in(rs.getString(16));
		   C.setWebsite(rs.getString(17));
		   C.setFirmlogo(rs.getString(18));
			
			return(C);
		}
		else
		{
		return(null);	
		}
		 
	  }
	catch(Exception e)
	{System.out.println("ConsignerController:displayAll:"+e);
	return null;	
	}
	}

}
