package com.website.veiw;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.website.model.Admin;

/**
 * Servlet implementation class AdminHome
 */
@WebServlet("/AdminHome")
public class AdminHome extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AdminHome() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	@SuppressWarnings({ "unused", "deprecation" })
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out=response.getWriter();
		HttpSession ses=request.getSession();
		out.println("<html>");
		String nav="";
		try
		{
			Admin A=(Admin)ses.getValue("SADMIN");
			nav="<h5>Admin id:"+A.getAdminid()+"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"+A.getAdminname()+"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"+ses.getValue("LTIME")+"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<img src=images/"+A.getPicture()+" width=35 height=35></h5>";	
			out.println(nav);
		}
		catch(Exception E)
		{
			Cookie c[]=request.getCookies();
			if(c==null && nav==null)
			response.sendRedirect("Adminlogin");
			
		}

		out.println("<table>");
		out.println("<tr>");
		out.println("<td valign=top>");
		out.println("<a href=ConsignerView target=mw>Consigner Register</a><br>");
		out.println("<a href=ConsignerDisplayAll target=mw>Update Consigner</a><br>");
		out.println("<a href=ConsigneeView target=mw>Consignee Register</a><br>");
		out.println("<a href=ConsigneeDisplayAll target=mw>Update Consignee</a><br>");
		out.println("<a href=EmployeeView target=mw>Employee Register</a><br>");
		out.println("<a href=EmployeeDisplayAll target=mw>UpdateEmployee</a><br>");
		out.println("<a href=AdminLogout>Logout</a><br>");
		out.println("</td>");
		out.println("<td valign=top>");
		out.println("<iframe name=mw width=700 height=800 frameborder=0></iframe>");
		out.println("</td>");
		out.println("</tr></table></html>");		
	}
}
