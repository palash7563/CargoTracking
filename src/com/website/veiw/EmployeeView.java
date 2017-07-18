package com.website.veiw;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class EmployeeView
 */
@WebServlet("/EmployeeView")
public class EmployeeView extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EmployeeView() {
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
	        out.println("<a href=EmployeeDisplayAll>Display All Employee</a><br>");
	        
	        out.println("<form action=EmployeeSubmit method=post enctype='multipart/form-data'>");
	        out.println("<table width=100%>");
	        out.println("<caption>Employee Registration</caption>");
	        out.println("<tr>");
	        out.println("<td>Employee Name:</td><td><input type=text name=employeename required size=30></td>");
	        out.println("</tr>");
	        
	        out.println("<tr>");
	        out.println("<td>Dob:</td><td><input type=text  required name=dob size=30></td>");
	        out.println("</tr>");
	        
	        out.println("<tr>");
	        out.println("<td>Address:</td><td><input type=text name=address required size=30></td>");
	        out.println("</tr>");
	        
	        out.println("<tr>");
	        out.println("<td>Country:</td><td><select id=country name=country></select></td>");
	        out.println("</tr>");
	        
	        out.println("<tr>");
	        out.println("<td>State:</td><td><select id=state name=state><option>-Select-</option></select></td>");
	        out.println("</tr>");
	        
	        out.println("<tr>");
	        out.println("<td>City:</td><td><select id=city name=city><option>-Select-</option></select></td>");
	        out.println("</tr>");
	        
	        
	        out.println("<tr>");
	        out.println("<td>Phone No:</td><td><input type=text name=phoneno required size=30></td>");
	        out.println("</tr>");
	        
	        
	        out.println("<tr>");
	        out.println("<td>Mobile No:</td><td><input type=text name=mobileno required size=30></td>");
	        out.println("</tr>");
	        
	        out.println("<tr>");
	        out.println("<td>Qualification:</td><td><input type=text name=qualification required size=30></td>");
	        out.println("</tr>");
	        
	        
	        out.println("<tr>");
	        out.println("<td>Designation:</td><td><input type=text name=designation required size=30></td>");
	        out.println("</tr>");
	        
			
	        out.println("<tr>");
	        out.println("<td>Photograph:</td><td><input type=file required name=photograph></td>");
	        out.println("</tr>");
	        
			
	        out.println("<tr>");
	        out.println("<td>Password:</td><td><input type=password required name=password size=30 id=password></td>");
	        out.println("</tr>");
	        
	        out.println("<tr>");
	        out.println("<td>Confirm Password:</td><td><input type=password required name=cpassword size=30 id=cpassword>&nbsp;&nbsp;&nbsp;<span id=msg></span></td>");
	        out.println("</tr>");
	    
		
	        out.println("<tr>");
	        out.println("<td><input type=submit id=btn></td><td><input type=reset></td>");
	        out.println("</tr>");
	        out.println("</table></form></html>");
	        out.flush();
			

	
	
	}

}
