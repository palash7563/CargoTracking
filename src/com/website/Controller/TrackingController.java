package com.website.Controller;

import java.sql.Connection;

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
	  		   System.out.println("TrackingController:addNewRecord:"+e);
	  		   return false;	
	  	   }
     }
}
