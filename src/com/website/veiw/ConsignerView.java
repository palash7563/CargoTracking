package com.website.veiw;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ConsignerView
 */
@WebServlet("/ConsignerView")
public class ConsignerView extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ConsignerView() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out=response.getWriter();
		
		out.println("<script src=filesa/jquery-2.2.1.min.js></script>");
		out.println("<script src=filesa/countrycitystate.js></script>");
		
		out.println("<html>");
		out.println("<body>");
		out.println("<form action=ConsignerSubmit method='post' enctype='multipart/form-data'>");
		out.println("<table>");
		out.println("<tr>");
		out.println("<caption>Registration Form</caption>");
		out.println("</tr>");
		
		out.println("<tr>");
		out.println("<td>");
		out.println("Firm Name : ");
		out.println("</td>");
		out.println("<td>");
		out.println("<input type=text required name=firmname>");
		out.println("</td>");
		out.println("</tr>");
		
		out.println("<tr>");
		out.println("<td>");
		out.println("Resigtration No : ");
		out.println("</td>");
		out.println("<td>");
		out.println("<input type=text required name=registration_no>");
		out.println("</td>");
		out.println("</tr>");
		
		out.println("<tr>");
		out.println("<td>");
		out.println("Owner Name : ");
		out.println("</td>");
		out.println("<td>");
		out.println("<input type=text required name=ownername>");
		out.println("</td>");
		out.println("</tr>");
		
		out.println("<tr>");
		out.println("<td>");
		out.println("Contact Person : ");
		out.println("</td>");
		out.println("<td>");
		out.println("<input type=text required name=contactperson>");
		out.println("</td>");
		out.println("</tr>");
		
		out.println("<tr>");
		out.println("<td>");
		out.println("Mobile No : ");
		out.println("</td>");
		out.println("<td>");
		out.println("<input type=text required name=mobileno>");
		out.println("</td>");
		out.println("</tr>");
		
		out.println("<tr>");
		out.println("<td>");
		out.println("Phone No : ");
		out.println("</td>");
		out.println("<td>");
		out.println("<input type=text size=10 required name=phoneno>");
		out.println("</td>");
		out.println("</tr>");
		
		out.println("<tr>");
		out.println("<td>");
		out.println("E-Mail : ");
		out.println("</td>");
		out.println("<td>");
		out.println("<input type=email  name=email>");
		out.println("</td>");
		out.println("</tr>");
		
		out.println("<tr>");
		out.println("<td>");
		out.println("Address : ");
		out.println("</td>");
		out.println("<td>");
		out.println("<input type=textarea required size=20 name=address>");
		out.println("</td>");
		out.println("</tr>");
		
		out.println("<tr>");
		out.println("<td>");
		out.println("Country : ");
		out.println("</td>");
		out.println("<td>");
		out.println("<select id=country required name=country></select>");
		out.println("</td>");
		out.println("</tr>");
		
		out.println("<tr>");
		out.println("<td>");
		out.println("State : ");
		out.println("</td>");
		out.println("<td>");
		out.println("<select id=state required name=state><option>-Select-</option></select>");
		out.println("</td>");
		out.println("</tr>");
		
		out.println("<tr>");
		out.println("<td>");
		out.println("City : ");
		out.println("</td>");
		out.println("<td>");
		out.println("<select name=city  id=city></select>");
		out.println("</td>");
		out.println("</tr>");
		
		out.println("<tr>");
		out.println("<td>");
		out.println("Deals In : ");
		out.println("</td>");
		out.println("<td>");
		out.println("<input type=text required name=deals_in>");
		out.println("</td>");
		out.println("</tr>");
		
		out.println("<tr>");
		out.println("<td>");
		out.println("Website : ");
		out.println("</td>");
		out.println("<td>");
		out.println("<input type=text name=website>");
		out.println("</td>");
		out.println("</tr>");
		
		out.println("<tr>");
		out.println("<td>");
		out.println("FirmLogo : ");
		out.println("</td>");
		out.println("<td>");
		out.println("<input type=file name=firmlogo>");
		out.println("</td>");
		out.println("</tr>");
		
		out.println("<tr>");
		out.println("<td>");
		out.println("Passoword : ");
		out.println("</td>");
		out.println("<td>");
		out.println("<input type=password required id=password name=password>");
		out.println("</td>");
		out.println("</tr>");
		
		out.println("<tr>");
		out.println("<td>");
		out.println("Confirm Passoword : ");
		out.println("</td>");
		out.println("<td>");
		out.println("<input type=password required id=cpassword name=cpassword>");
		out.println("</td>");
		out.println("</tr>");
	
		out.println("<tr>");
		out.println("<td>");
		out.println("<input type=submit>");
		out.println("</td>");
		out.println("<td>");
		out.println("<input type=reset>");
		out.println("</td>");
		out.println("</tr>");
		
		
		out.println("</table>");
		out.println("</form>");
		//out.println("<a href=mainpage>Main Page</a>");
		out.println("</body>");
		out.println("</html>");
	}

}
