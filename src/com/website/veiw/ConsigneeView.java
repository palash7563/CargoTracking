package com.website.veiw;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ConsigneeView
 */
@WebServlet("/ConsigneeView")
public class ConsigneeView extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ConsigneeView() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
	   PrintWriter out=response.getWriter();
			out.println("<script src='filesa/jquery-2.2.1.min.js'></script>");
	        out.println("<script src='filesa/countrycitystate.js'></script>");
	        out.println("<script src='filesa/passwordcheck.js'></script>");
	        out.println("<html>");
	        out.println("<html>");
	        out.println("<a href=ConsigneeDisplayAll>Display All Consignee</a><br>");
	        
	        out.println("<form action=ConsigneeSubmit method=post enctype='multipart/form-data'>");
	        out.println("<table>");
	        out.println("<tr>");
	        out.println("<caption>Consingee Registration</caption>");
	        out.println("</tr>");
	        out.println("<tr>");
	        out.println("<td>Firm Name:</td><td><input type=text name=firmname required size=30></td>");
	        out.println("</tr>");
	        
	        out.println("<tr>");
	        out.println("<td>Registration No:</td><td><input type=text  required name=registrationno size=30></td>");
	        out.println("</tr>");
	        
	        out.println("<tr>");
	        out.println("<td>Owner Name:</td><td><input type=text name=ownername required size=30></td>");
	        out.println("</tr>");
	        
	        out.println("<tr>");
	        out.println("<td>Contact Person:</td><td><input type=text required name=contactperson size=30></td>");
	        out.println("</tr>");
	        
	        out.println("<tr>");
	        out.println("<td>Mobile No:</td><td><input type=text name=mobileno required size=30></td>");
	        out.println("</tr>");
	        
	        out.println("<tr>");
	        out.println("<td>Phone No:</td><td><input type=text name=phoneno required size=30></td>");
	        out.println("</tr>");
	        
	        out.println("<tr>");
	        out.println("<td>Email Id:</td><td><input type=email name=email  required size=30></td>");
	        out.println("</tr>");
	        
	        out.println("<tr>");
	        out.println("<td>Address:</td><td><input type=text name=address required size=30></td>");
	        out.println("</tr>");
	        
	        out.println("<tr>");
	        out.println("<td>Country :</td><td><select id=country name=country><option>-Select-</option></select></td>");
	        out.println("</tr>");
	        
	        out.println("<tr>");
	        out.println("<td>State :</td><td><select id=state name=state><option>-Select-</option></select></td>");
	        out.println("</tr>");
	        
	        out.println("<tr>");
	        out.println("<td>City :</td><td><select id=city name=city><option>-Select-</option></select></td>");
	        out.println("</tr>");
	        
	        
	        out.println("<tr>");
	        out.println("<td>Deals In :</td><td><input type=text name=dealsin required size=30></td>");
	        out.println("</tr>");
	        
	        
	        out.println("<tr>");
	        out.println("<td>Website :</td><td><input type=text name=website required size=30></td>");
	        out.println("</tr>");
	        
			
	        out.println("<tr>");
	        out.println("<td>Firm Logo :</td><td><input type=file required name=firmlogo></td>");
	        out.println("</tr>");
	        
			
	        out.println("<tr>");
	        out.println("<td>Password :</td><td><input type=password required name=password size=30 id=password></td>");
	        out.println("</tr>");
	        
	        out.println("<tr>");
	        out.println("<td>Confirm Password :</td><td><input type=password required name=cpassword size=30 id=cpassword>&nbsp;&nbsp;&nbsp;<span id=msg></span></td>");
	        out.println("</tr>");
	    
		
	        out.println("<tr>");
	        out.println("<td><input type=submit id=btn></td><td><input type=reset></td>");
	        out.println("</tr>");
	        out.println("</table></form></html>");
	        out.flush();
			

	
	}

}
