package com.website.veiw;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.website.Controller.EmployeeController;
import com.website.model.Employee;

/**
 * Servlet implementation class EmployeeDisplayById
 */
@WebServlet("/EmployeeDisplayById")
public class EmployeeDisplayById extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EmployeeDisplayById() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		PrintWriter out=response.getWriter();
		Employee E=EmployeeController.displayById(Integer.parseInt(request.getParameter("cid")));
		if(E==null)
		{out.println("Not Found");
 		}
		else
		{
	    out.println("<script src='asset/jquery-2.2.1.min.js'></script>");
        out.println("<script src='asset/csc.js'></script>");  
        out.println("<html>");
        out.println("<a href=EmployeeDisplayAll>Display All Employee</a><br>");
        out.println("<form action=EmployeeEditDelete method=post enctype='multipart/form-data'>");
        out.println("<table><tr><td>");
        out.println("<table width=100%>");
        out.println("<caption><b><i>Employee Registration</i></b></caption>");
        out.println("<input type=hidden value='"+E.getEmployeeid()+"' name=cid>");
        out.println("<tr>");
        out.println("<td><b><i>Employee Name:</i></b></td><td><input type=text name=employeename value='"+E.getEmployeename()+"' size=30></td>");
        out.println("</tr>");
        
        out.println("<tr>");
        out.println("<td><b><i>DOB:</i></b></td><td><input type=text   value='"+E.getDob()+"' name=dob size=30></td>");
        out.println("</tr>");
        
        
        out.println("<tr>");
        out.println("<td><b><i>Address:</i></b></td><td><input type=text name=address  value='"+E.getAddress()+"' size=30></td>");
        out.println("</tr>");
        
        out.println("<tr>");
        String cnt[]=E.getCountry().split(",");
        out.println("<td><b><i>Country:</i></b></td><td><input type=hidden value='"+cnt[0]+"' name=icountry><b>"+cnt[1]+"<b><br><select id=country name=country></select></td>");
        out.println("</tr>");
        
        out.println("<tr>");
        String st[]=E.getState().split(",");
        out.println("<td><b><i>State:</i></b></td><td><input type=hidden value='"+st[0]+"' name=istate><b>"+st[1]+"<b><br><select id=state name=state><option>-Select-</option></select></td>");
        out.println("</tr>");
        String ct[]=E.getCity().split(",");
        out.println("<tr>");
        out.println("<td><b><i>City:</i></b></td><td><input type=hidden value='"+ct[0]+"' name=icity><b>"+ct[1]+"<b><br><select id=city name=city><option>-Select-</option></select></td>");
        out.println("</tr>");
    
        out.println("<tr>");
        out.println("<td><b><i>Phone No:</i></b></td><td><input type=text name=phoneno  value='"+E.getPhone()+"' size=30></td>");
        out.println("</tr>");
    
        out.println("<tr>");
        out.println("<td><b><i>Mobile No:</i></b></td><td><input type=text name=mobileno  value='"+E.getMobile()+"' size=30></td>");
        out.println("</tr>");
     
        out.println("<tr>");
        out.println("<td><b><i>Qualifications:</i></b></td><td><input type=text name=qualification  value='"+E.getQualification()+"' size=30></td>");
        out.println("</tr>");
        
        
        out.println("<tr>");
        out.println("<td><b><i>Designation:</i></b></td><td><input type=text name=designation  value='"+E.getDesignation()+"' size=30></td>");
        out.println("</tr>");
        
		
         
	
        out.println("<tr>");
        out.println("<td><input type=submit name=btn value=Edit></td><td><input type=Submit name=btn value=Delete></td>");
        out.println("</tr>");
        out.println("</table>");
        out.println("</td><td valign=top>");
        out.println("<img src=images/"+E.getPhotograph()+" width=250 height=250><br><br><b><i>Update Picture:<i><br><input type=file name=photograph><br><br><input type=submit name=btn value=Update></td></tr></table>");
        out.println("</form></html>");
         	
			
		}

	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
