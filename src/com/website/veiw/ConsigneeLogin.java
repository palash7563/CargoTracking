package com.website.veiw;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ConsigneeLogin
 */
@WebServlet("/ConsigneeLogin")
public class ConsigneeLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ConsigneeLogin() {
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
		out.println("<form action=ConsigneeCheckLogin method='post'>");
		out.println("<table>");
		out.println("<tr>");
		out.println("<caption>Consignee Login</caption>");
		out.println("</tr>");
		
		out.println("<tr>");
		out.println("<td>");
		out.println("ID:");
		out.println("</td>");
		out.println("<td>");
		out.println("<input type=text name='aid'/>");
		out.println("</td>");
		out.println("</tr>");
		
		out.println("<tr>");
		out.println("<td>");
		out.println("Password:");
		out.println("</td>");
		out.println("<td>");
		out.println("<input type=password name='password'/>");
		out.println("</td>");
		out.println("</tr>");
		
		out.println("<tr>");
		out.println("<td>");
		out.println("<input type='submit' value=Signin>");
		out.println("</td>");
		out.println("<td>");
		out.println("<input type='reset'>");
		out.println("</td>");
		out.println("</tr>");
		
		
		out.println("</table>");

		out.println("</form>");
		out.println("</body>");
		out.println("</hmtl>");
	}

}
