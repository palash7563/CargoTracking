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
			out.println("<script src='asset/jquery-2.2.1.min.js'></script>");
	        out.println("<script src='asset/csc.js'></script>");
	        out.println("<script src='asset/cnsCheck.js'></script>");
	        out.println("<html>");
	        out.println("<html>");
	        out.println("<a href=ConsigneeDisplayAll>Display All Consignee</a><br>");
	        
	        out.println("<form action=ConsigneeSubmit method=post enctype='multipart/form-data'>");
	        out.println("<table width=70%>");
	        out.println("<caption><b><i>Consingee Registration</i></b></caption>");
	        out.println("<tr>");
	        out.println("<td><b><i>Firm Name:</i></b></td><td><input type=text name=firmname required size=30></td>");
	        out.println("</tr>");
	        
	        out.println("<tr>");
	        out.println("<td><b><i>Registration No:</i></b></td><td><input type=text  required name=registrationno size=30></td>");
	        out.println("</tr>");
	        
	        out.println("<tr>");
	        out.println("<td><b><i>Owner Name:</i></b></td><td><input type=text name=ownername required size=30></td>");
	        out.println("</tr>");
	        
	        out.println("<tr>");
	        out.println("<td><b><i>Contact Person:</i></b></td><td><input type=text required name=contactperson size=30></td>");
	        out.println("</tr>");
	        
	        out.println("<tr>");
	        out.println("<td><b><i>Mobile No:</i></b></td><td><input type=text name=mobileno required size=30></td>");
	        out.println("</tr>");
	        
	        out.println("<tr>");
	        out.println("<td><b><i>Phone No:</i></b></td><td><input type=text name=phoneno required size=30></td>");
	        out.println("</tr>");
	        
	        out.println("<tr>");
	        out.println("<td><b><i>Email Id:</i></b></td><td><input type=text name=email  required size=30></td>");
	        out.println("</tr>");
	        
	        out.println("<tr>");
	        out.println("<td><b><i>Address:</i></b></td><td><input type=text name=address required size=30></td>");
	        out.println("</tr>");
	        
	        out.println("<tr>");
	        out.println("<td><b><i>Country:</i></b></td><td><select id=country name=country></select></td>");
	        out.println("</tr>");
	        
	        out.println("<tr>");
	        out.println("<td><b><i>State:</i></b></td><td><select id=state name=state><option>-Select-</option></select></td>");
	        out.println("</tr>");
	        
	        out.println("<tr>");
	        out.println("<td><b><i>City:</i></b></td><td><select id=city name=city><option>-Select-</option></select></td>");
	        out.println("</tr>");
	        
	        
	        out.println("<tr>");
	        out.println("<td><b><i>Deals In:</i></b></td><td><input type=text name=dealsin required size=30></td>");
	        out.println("</tr>");
	        
	        
	        out.println("<tr>");
	        out.println("<td><b><i>Website:</i></b></td><td><input type=text name=website required size=30></td>");
	        out.println("</tr>");
	        
			
	        out.println("<tr>");
	        out.println("<td><b><i>Firm Logo:</i></b></td><td><input type=file required name=firmlogo></td>");
	        out.println("</tr>");
	        
			
	        out.println("<tr>");
	        out.println("<td><b><i>Password:</i></b></td><td><input type=password required name=password size=30 id=password></td>");
	        out.println("</tr>");
	        
	        out.println("<tr>");
	        out.println("<td><b><i>Confirm Password:</i></b></td><td><input type=password required name=cpassword size=30 id=cpassword>&nbsp;&nbsp;&nbsp;<span id=msg></span></td>");
	        out.println("</tr>");
	    
		
	        out.println("<tr>");
	        out.println("<td><input type=submit id=btn></td><td><input type=reset></td>");
	        out.println("</tr>");
	        out.println("</table></form></html>");
	        out.flush();
			

	
	}

}
