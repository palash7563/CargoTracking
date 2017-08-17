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
 * Servlet implementation class TrackingVeiw
 */
@WebServlet("/TrackingVeiw")
public class TrackingVeiw extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TrackingVeiw() {
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
		out.println("<head>");
		out.println("<script src='filesa/jquery-2.2.1.min.js'></script>");
		out.println("<script src='filesa/tracking.js'></script>");
		out.println("</head>");
		out.println("<body>");
		int eid=0;
		HttpSession ses=request.getSession();
		try{
			 Employee E=(Employee)ses.getValue("SEMPLOYEE");	
			  eid=E.getEmployeeid(); 
			}catch(Exception e)
			{
		     response.sendRedirect("EmployeeLogin");		
			}
		//System.out.println(eid);
		out.println("<input type=hidden id=eid value="+eid+">");
		out.println("Tracking Id:&nbsp;&nbsp;&nbsp;");
		out.println("<input type=text name='tid' id='tid'/>");
		out.println("<input type=button name='btn' value='Search' id='btn'/><br>");
		out.println("<span id='result'></span>");
		out.println("</body>");
		out.println("</html>");
	}
}
