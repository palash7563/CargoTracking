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

import com.website.Controller.AdminController;
import com.website.model.Admin;

/**
 * Servlet implementation class CheckAdminLogin
 */
@WebServlet("/CheckAdminLogin")
public class CheckAdminLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CheckAdminLogin() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	@SuppressWarnings("deprecation")
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		String aid=request.getParameter("aid");
		String password=request.getParameter("password");
		Admin a=AdminController.checkpassword(aid, password);
		Cookie c[]=request.getCookies();
		if(c==null && a!=null)
		{
			Cookie loginid=new Cookie("LoginId",aid);
			loginid.setMaxAge(999999999);
			response.addCookie(loginid);
			Cookie loginpassword=new Cookie("LoginPassword",password);
			loginpassword.setMaxAge(999999999);
			response.addCookie(loginpassword);
		}
		else
		{
			Cookie cc=null;
			for(int i=0;i<c.length;i++)
			{
				if(c[i].getName().equals("LoginId"))
				{
					cc=c[i];
					continue;
				}
				if(c[i].getName().equals("LoginPassword"))
				{
					cc=c[i];
					continue;
				}
			}
		}
		if(a!=null)
		{
			HttpSession ses=request.getSession();
			ses.putValue("SADMIN", a);
			ses.putValue("LTIME", new java.util.Date());
			response.sendRedirect("AdminHome");
		}
		else
		{
			out.println("Invalid Password/ID !!!");
		}
	}
}