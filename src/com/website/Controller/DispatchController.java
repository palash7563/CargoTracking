package com.website.Controller;

import java.sql.Connection;
import java.sql.ResultSet;

import com.website.model.Dispatch;

public class DispatchController {

	public static boolean addrecord(Dispatch D)
	{
		try
		{
			
			Connection cn=Dbhelper.openConnection();
			String q="insert into dispatch(employeeid,dispatchdate,dispatchtime,consignerid,consigneeid,productdescription,producttype,totalbox,quantitybox,amount,chargeofdispatch,dispatchfrom,dispatchto,route,vehicleno,approxdays) values('"+D.getEmployeeid()+"','"+D.getDispatchdate()+"','"+D.getDispatchtime()+"','"+D.getConsignerid()+"','"+D.getConsigneeid()+"','"+D.getProductdescription()+"','"+D.getProducttype()+"','"+D.getTotalbox()+"','"+D.getQuantitybox()+"','"+D.getAmount()+"','"+D.getChargeofdispatch()+"','"+D.getDispatchfrom()+"','"+D.getDispatchto()+"','"+D.getRoute()+"','"+D.getVehicleno()+"','"+D.getApproxdays()+"')";
			boolean st=Dbhelper.executeupdate(cn,q);
			return st;
		}
		catch(Exception e)
		{
			System.out.println("Disptach Controller addrecord"+e);
			return false;
		}
	}
	public static ResultSet getallreturn()
	{
		try
		{
			Connection cn=Dbhelper.openConnection();
			ResultSet rs=Dbhelper.executequery(cn, "select * from route");
			return rs;
		}
		catch(Exception E)
		{
			System.out.println("Dispatch Controller getallreturn "+E);
			return null;
		}
	}
	
	public static ResultSet getallproducttype()
	{
		try
		{
			Connection cn=Dbhelper.openConnection();
			ResultSet rs=Dbhelper.executequery(cn, "select * from producttype");
			return rs;
		}
		catch(Exception E)
		{
			System.out.println("Dispatch Controller getallproducttype "+E);
			return null;
		}
	}
	
	public static int getTrackingid(){
	  	   try{
	  		   
	  		   		Connection cn=Dbhelper.openConnection();
	  		                                                                                
	  		   		String q="select max(transactionid) from dispatch";
	  		   		ResultSet rs=Dbhelper.executequery(cn, q);
	  		   		if(rs.next())
	  		   		{
	  		   			int tid=Integer.parseInt(rs.getString(1));
	  		   			return(tid);
	  		   		}
	  		   		else
	  		   		{
	  		   			return(-1);
	  		   		}
	         	}
	  	   		catch(Exception e)
	  	   		{
	  	   				System.out.println("DispatchController:addNewRecord:"+e);
	  	   				return -1;	
	  	   		}
	     }

}
