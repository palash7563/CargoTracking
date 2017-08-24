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

/**
 * Servlet implementation class AdminLogout
 */
@WebServlet("/AdminLogout")
public class AdminLogout extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AdminLogout() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession ses=request.getSession();
		ses.invalidate();
		Cookie cc[]=request.getCookies();
		for(int i=0;i<cc.length;i++)
		{
			if(cc[i].getName().equals("LoginId"))
			{
				cc[i].setValue(null);
				cc[i].setMaxAge(0);
			}
			if(cc[i].getName().equals("LoginPassword"))
			{
				cc[i].setValue(null);
				cc[i].setMaxAge(0);
			}
		}
		response.sendRedirect("Adminlogin");
		
	}

}
