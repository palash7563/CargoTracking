package com.website.veiw;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.website.Controller.ConsigneeController;
import com.website.model.Consignee;

/**
 * Servlet implementation class ConsigneeCheckLogin
 */
@WebServlet("/ConsigneeCheckLogin")
public class ConsigneeCheckLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ConsigneeCheckLogin() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out=response.getWriter();
		String aid=request.getParameter("aid");
		String password=request.getParameter("password");
		Consignee C=ConsigneeController.checkpassword(Integer.parseInt(aid), password);
		if(C!=null)
		{
			HttpSession ses=request.getSession();
			response.sendRedirect("ConsigneeHome");
		}
		else
		{
			out.println("Wrong UserId/Password");
			response.sendRedirect("ConsigneeLogin");
		}
	}

}
