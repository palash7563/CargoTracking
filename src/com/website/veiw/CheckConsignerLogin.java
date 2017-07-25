package com.website.veiw;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.website.Controller.ConsignerController;
import com.website.model.Consigner;

/**
 * Servlet implementation class CheckConsignerLogin
 */
@WebServlet("/CheckConsignerLogin")
public class CheckConsignerLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CheckConsignerLogin() {
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
		Consigner C=ConsignerController.checkpassword(Integer.parseInt(aid), password);
		if(C!=null)
		{
			HttpSession ses=request.getSession();
			ses.putValue("SCONSIG", C);
			ses.putValue("DATE", new java.util.Date());
			response.sendRedirect("ConsignerHome");
		}
		else
		{
			response.sendRedirect("ConsignerLogin");
			out.println("<script src=filesa/jquery-2.2.1.min.js></script>");
			out.println("<script>$(document).ready(function(){alert('Wrong UserID/Password');});</script>");
			
		}
		
	}

}
