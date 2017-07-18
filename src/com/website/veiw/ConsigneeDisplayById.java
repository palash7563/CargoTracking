package com.website.veiw;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.website.Controller.ConsigneeController;
import com.website.model.Consignee;

/**
 * Servlet implementation class ConsigneeDisplayById
 */
@WebServlet("/ConsigneeDisplayById")
public class ConsigneeDisplayById extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ConsigneeDisplayById() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out=response.getWriter();
		Consignee C=ConsigneeController.displayById(Integer.parseInt(request.getParameter("cid")));
		if(C==null)
		{out.println("Not Found");
 		}
		else
		{out.println("<script src='filesa/jquery-2.2.1.min.js'></script>");
        out.println("<script src='filesa/countrycitystate.js'></script>");
        out.println("<script src='filesa/passwordcheck.js'></script>");
        out.println("<html>");
        
        out.println("<a href=ConsigneeDisplayAll>Display All Consignee</a><br>");
        out.println("<form action=ConsigneeEditDelete method=post enctype='multipart/form-data'>");
        out.println("<table><tr><td>");
        out.println("<table width=100%>");
        
        
        out.println("<caption><b><i>Consingee Registration</i></b></caption>");
        out.println("<input type=hidden value='"+C.getId()+"' name=cid>");
        out.println("<tr>");
        out.println("<td>Firm Name:</td><td><input type=text name=firmname value='"+C.getFirmname()+"' size=30></td>");
        out.println("</tr>");
        
        out.println("<tr>");
        out.println("<td>Registration No:</td><td><input type=text   value='"+C.getRegistration_no()+"' name=registrationno size=30></td>");
        out.println("</tr>");
        
        out.println("<tr>");
        out.println("<td>Owner Name:</td><td><input type=text name=ownername  value='"+C.getOwnername()+"' size=30></td>");
        out.println("</tr>");
        
        out.println("<tr>");
        out.println("<td>Contact Person:</td><td><input type=text  value='"+C.getContactperson()+"' name=contactperson size=30></td>");
        out.println("</tr>");
        
        out.println("<tr>");
        out.println("<td>Mobile No:</td><td><input type=text name=mobileno  value='"+C.getMobileno()+"' size=30></td>");
        out.println("</tr>");
        
        out.println("<tr>");
        out.println("<td>Phone No:</td><td><input type=text name=phoneno  value='"+C.getPhoneno()+"' size=30></td>");
        out.println("</tr>");
        
        out.println("<tr>");
        out.println("<td>Email Id:</td><td><input type=text name=email   value='"+C.getEmail()+"'size=30></td>");
        out.println("</tr>");
        
        out.println("<tr>");
        out.println("<td>Address:</td><td><input type=text name=address  value='"+C.getAddress()+"' size=30></td>");
        out.println("</tr>");
        
        out.println("<tr>");
        String cnt[]=C.getCountry().split(",");
        out.println("<td>Country:</td><td><input type=hidden value='"+cnt[0]+"' name=icountry><b>"+cnt[1]+"<b><br><select id=country name=country></select></td>");
        out.println("</tr>");
        
        out.println("<tr>");
        String st[]=C.getState().split(",");
        out.println("<td>State:</td><td><input type=hidden value='"+st[0]+"' name=istate><b>"+st[1]+"<b><br><select id=state name=state><option>-Select-</option></select></td>");
        out.println("</tr>");
        String ct[]=C.getCity().split(",");
        out.println("<tr>");
        out.println("<td>City:</td><td><input type=hidden value='"+ct[0]+"' name=icity><b>"+ct[1]+"<b><br><select id=city name=city><option>-Select-</option></select></td>");
        out.println("</tr>");
        
        
        out.println("<tr>");
        out.println("<td>Deals In:</td><td><input type=text name=dealsin  value='"+C.getDeals_in()+"' size=30></td>");
        out.println("</tr>");
        
        
        out.println("<tr>");
        out.println("<td>Website:</td><td><input type=text name=website  value='"+C.getWebsite()+"' size=30></td>");
        out.println("</tr>");
        
		
         
	
        out.println("<tr>");
        out.println("<td><input type=submit name=btn value=Edit></td><td><input type=Submit name=btn value=Delete></td>");
        out.println("</tr>");
        out.println("</table>");
        out.println("</td><td valign=top>");
        out.println("<img src=images/"+C.getFirmlogo()+" width=250 height=250><br><br><b><i>Update Picture:<i><br><input type=file name=firmlogo><br><br><input type=submit name=btn value=Update></td></tr></table>");
        out.println("</form></html>");
         	
			
	
			
	
	
	
	}

	}
}
