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
		out.println("<html>");
		out.println("<body>");
		out.println("<form action=ConsignerSubmit>");
		out.println("<table>");
		out.println("<tr>");
		out.println("<caption>Registration Form</caption>");
		out.println("</tr>");
		
		out.println("<tr>");
		out.println("<td>");
		out.println("Firm Name : ");
		out.println("</td>");
		out.println("<td>");
		out.println("<input type=text name=firmname>");
		out.println("</td>");
		out.println("</tr>");
		
		out.println("<tr>");
		out.println("<td>");
		out.println("Resigtration No : ");
		out.println("</td>");
		out.println("<td>");
		out.println("<input type=text name=registration_no>");
		out.println("</td>");
		out.println("</tr>");
		
		out.println("<tr>");
		out.println("<td>");
		out.println("Owner Name : ");
		out.println("</td>");
		out.println("<td>");
		out.println("<input type=text name=ownername>");
		out.println("</td>");
		out.println("</tr>");
		
		out.println("<tr>");
		out.println("<td>");
		out.println("Contact Person : ");
		out.println("</td>");
		out.println("<td>");
		out.println("<input type=text name=contactperson>");
		out.println("</td>");
		out.println("</tr>");
		
		out.println("<tr>");
		out.println("<td>");
		out.println("Mobile No : ");
		out.println("</td>");
		out.println("<td>");
		out.println("<input type=text name=mobileno>");
		out.println("</td>");
		out.println("</tr>");
		
		out.println("<tr>");
		out.println("<td>");
		out.println("Phone No : ");
		out.println("</td>");
		out.println("<td>");
		out.println("<input type=text name=phoneno>");
		out.println("</td>");
		out.println("</tr>");
		
		out.println("<tr>");
		out.println("<td>");
		out.println("E-Mail : ");
		out.println("</td>");
		out.println("<td>");
		out.println("<input type=text name=email>");
		out.println("</td>");
		out.println("</tr>");
		
		out.println("<tr>");
		out.println("<td>");
		out.println("Address : ");
		out.println("</td>");
		out.println("<td>");
		out.println("<input type=text name=address>");
		out.println("</td>");
		out.println("</tr>");
		
		out.println("<tr>");
		out.println("<td>");
		out.println("Country : ");
		out.println("</td>");
		out.println("<td>");
		out.println("<input type=text name=country>");
		out.println("</td>");
		out.println("</tr>");
		
		out.println("<tr>");
		out.println("<td>");
		out.println("State : ");
		out.println("</td>");
		out.println("<td>");
		out.println("<input type=text name=state>");
		out.println("</td>");
		out.println("</tr>");
		
		out.println("<tr>");
		out.println("<td>");
		out.println("City : ");
		out.println("</td>");
		out.println("<td>");
		out.println("<input type=text name=city>");
		out.println("</td>");
		out.println("</tr>");
		
		out.println("<tr>");
		out.println("<td>");
		out.println("Deals In : ");
		out.println("</td>");
		out.println("<td>");
		out.println("<input type=text name=deals_in>");
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
		out.println("<input type=text name=firmlogo>");
		out.println("</td>");
		out.println("</tr>");
		
		out.println("<tr>");
		out.println("<td>");
		out.println("Passoword : ");
		out.println("</td>");
		out.println("<td>");
		out.println("<input type=text name=password>");
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
		out.println("</body>");
		out.println("</html>");
	}

}
