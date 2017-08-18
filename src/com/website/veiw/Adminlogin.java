package com.website.veiw;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Adminlogin
 */
@WebServlet("/Adminlogin")
public class Adminlogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Adminlogin() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out=response.getWriter();
		Cookie c[]=request.getCookies();
		if(c!=null)
		{
			response.sendRedirect("http://localhost:8080/CargoTracking/AdminHome");
		}
		else
		{
			out.println("<html>");
			out.println("<form action=CheckAdminLogin method=post>");
			out.println("<table>");
			out.println("<caption>Administrator Login</caption>");
			out.println("<tr><td>Admin Id:</td><td><input type=text name=aid></td></tr>");
			out.println("<tr><td>Password:</td><td><input type=password name=password></td></tr>");
			out.println("<tr><td><input type=submit value='Sign In'></td><td>&nbsp;</td></tr>");
			out.println("</table></form></html>");
			out.flush();
		}
	}

}
