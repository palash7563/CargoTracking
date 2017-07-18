package com.website.veiw;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.website.Controller.EmployeeController;


/**
 * Servlet implementation class EmployeeDisplayAll
 */
@WebServlet("/EmployeeDisplayAll")
public class EmployeeDisplayAll extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EmployeeDisplayAll() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out=response.getWriter();
		try{
		ResultSet rs=EmployeeController.displayAll();
		out.println("<html>");
		out.println("<a href=EmployeeView>Add  New Employee</a><br>");

		if(rs.next())
		{out.print("<table border=1>");
		out.print("<caption><i><b>List of Employee</b></i></caption>");
		  out.println("<tr>");  
		  out.println("<th>Sno</th><th>Id/EmployeeName</th><th>DOB</th><th>Address</th><th>Qualifications</th><th>Designation</th><th>Photograph</th><th>Update</th></tr>");
	 		int sn=1;
			do{
				out.println("<tr><td>"+sn+"</td><td>"+rs.getString(1)+"/<br>"+rs.getString(2)+"</td><td>"+rs.getString(3)+"</td><td>"+rs.getString(4)+"<br>"+rs.getString(7)+","+rs.getString(6)+"<br>"+rs.getString(5)+"<br>Mob:"+rs.getString(8)+" Ph:"+rs.getString(9)+"</td><td>"+rs.getString(10)+"</td><td>"+rs.getString(11)+"</td><td><img src=images/"+rs.getString(12)+" width=45 height=45><br>"+"</a></td><td><a href=EmployeeDisplayById?cid="+rs.getString(1)+">Edit/Delete</a></td></tr>");
			sn++;
		}
			while(rs.next());
			out.println("</table></html>");
		}
		else
		{

			out.println("Record Not Found");	
		}
			
		}catch(Exception e)
		{
			out.println(e);	
		}

	
	
	}

}
