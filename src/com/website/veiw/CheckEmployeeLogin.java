package com.website.veiw;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.website.Controller.EmployeeController;
import com.website.model.Employee;

/**
 * Servlet implementation class CheckEmployeeLogin
 */
@WebServlet("/CheckEmployeeLogin")
public class CheckEmployeeLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CheckEmployeeLogin() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	@SuppressWarnings("deprecation")
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String aid=request.getParameter("aid");
		String password=request.getParameter("password");
		Employee E=EmployeeController.checkpassword(Integer.parseInt(aid), password);
		if(E!=null)
		{
			HttpSession ses=request.getSession();
			ses.putValue("SEMPLOYEE", E);
			ses.putValue("DATE", new java.util.Date());
			response.sendRedirect("EmployeeHome");
		}
		else
		{
			response.sendRedirect("EmployeeLogin");
		}
		
	}

}