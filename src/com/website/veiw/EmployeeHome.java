package com.website.veiw;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.website.model.Employee;

/**
 * Servlet implementation class EmployeeHome
 */
@WebServlet("/EmployeeHome")
public class EmployeeHome extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EmployeeHome() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out=response.getWriter();
		HttpSession ses=request.getSession();
		out.println("<html>");
		try
		{
		 Employee E=(Employee)ses.getValue("SEMPLOYEE");	
		 String nav="<h5><i>Employee id:"+E.getEmployeeid()+"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"+E.getEmployeename()+"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"+ses.getValue("DATE")+"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<img src=images/"+E.getPhotograph()+" width=35 height=35></i></h5><hr>";	
		 out.println(nav);		 	
		}
		catch(Exception e)
		{
	     response.sendRedirect("EmployeeLogin");		
		}
	   out.println("<table>");
	   out.println("<tr><td valign=top><a href=DispatchVeiw target=mw>Dispatch Register</a></td>");
	   out.println("<tr><td valign=top><a href=TrackingVeiw target=mw>Tracking</a></td>");
	   out.println("<td><iframe name=mw width=800 height=600 frameborder=0></iframe></td></tr>");
	   out.print("</table></html>"); 	
	   out.flush();
	}
}
