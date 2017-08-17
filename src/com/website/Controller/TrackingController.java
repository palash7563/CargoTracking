package com.website.Controller;

import java.sql.Connection;
import java.sql.ResultSet;

import com.website.model.Tracking;

public class TrackingController {

	public static boolean addNewRecord(Tracking T)
	{
	  	   try
	  	   {
	  		   Connection cn=Dbhelper.openConnection();                                                                                                                                        
	           String q="insert into tracking (trackingid,employeeid,tdate,ttime,description,lat,lng) values ('"+T.getTrackingid()+"','"+T.getEmployeeid()+"','"+T.getTdate()+"','"+T.getTtime()+"','"+T.getDescription()+"','"+T.getLat()+"','"+T.getLng()+"')";
	           boolean st=Dbhelper.executeupdate(cn, q);
	           return (st);
	  	   }
	  	   catch(Exception e)
	  	   {
	  		   System.out.println("Tracking Controller addNewRecord:"+e);
	  		   return false;	
	  	   }
     }
	
	public static ResultSet trackingbyid(int tid)
	{
		try
		{
			Connection cn=Dbhelper.openConnection();
			String q="select T.*,d.*,C.ownername CNO ,C.firmname CNF,CE.ownername CEO,CE.firmname CEF,CE.contactperson CEC,C.contactperson CNC from tracking T,dispatch D,consignee CE,consigner C where T.trackingid='"+tid+"' and D.transactionid='"+tid+"' and D.consignerid=C.id and D.consigneeid=CE.id"; 
			ResultSet rs=Dbhelper.executequery(cn, q);
			return rs;
		}
		catch(Exception e)
		{
			System.out.println("Tracking controller tracking by id");
			return null;
		}
	}
}
