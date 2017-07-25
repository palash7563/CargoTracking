package com.website.veiw;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class EmployeeLogin
 */
@WebServlet("/EmployeeLogin")
public class EmployeeLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EmployeeLogin() {
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
		out.println("<form action=CheckEmployeeLogin method=post>");
		out.println("<table>");
		out.println("<caption>Employee Login</caption>");
		out.println("<tr><td>Employee Id:</td><td><input type=text name=aid></td></tr>");
		out.println("<tr><td>Password:</td><td><input type=password name=password></td></tr>");
		out.println("<tr><td><input type=submit value='Sign In'></td><td><input type='reset'></td></tr>");
		out.println("</table></form></html>");
		out.flush();
	}

}
