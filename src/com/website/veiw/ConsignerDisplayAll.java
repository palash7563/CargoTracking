package com.website.veiw;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.website.Controller.ConsignerController;

/**
 * Servlet implementation class ConsignerDisplayAll
 */
@WebServlet("/ConsignerDisplayAll")
public class ConsignerDisplayAll extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ConsignerDisplayAll() {
        super();
        // TODO Auto-generated constructor stub
    }
    

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		try{
			PrintWriter out=response.getWriter();
			ResultSet rs=ConsignerController.displayAll();
			out.println("<html>");
	
			if(rs.next())
				
			{out.print("<table border=1>");
			out.print("<caption><i><b>List of Consinger</b></i></caption>");
			  out.println("<tr>");
			  
			  out.println("<th>Sno</th><th>Firm Name</th><th>Owner Name/<br>Registration</th><th>Contact Person</th><th>Deals In</th><th>Website</th><th>Update</th></tr>");
		 		int sn=1;
				do{
				out.println("<tr><td>"+sn+"</td><td>"+rs.getString(2)+"</td><td>"+rs.getString(4)+"/<br>"+rs.getString(3)+"</td><td>"+rs.getString(5)+"<br>"+rs.getString(9)+"<br>"+rs.getString(12)+","+rs.getString(11)+"<br>"+rs.getString(10)+"<br>"+rs.getString(8)+"<br>Mob:"+rs.getString(6)+" Ph:"+rs.getString(7)+"</td><td>"+rs.getString(13)+"</td><td><img src=images/"+rs.getString(15)+" width=45 height=45><br><a href="+rs.getString(14)+">"+rs.getString(14)+"</a></td><td><a href=DisplayById?cid="+rs.getString(1)+">Edit/Delete</a></td></tr>");
				
				sn++;
			}while(rs.next());
				//out.println("<a href=mainpage>Main Page</a>");
			out.println("</table></html>");
					
			}
			else
			{
				out.println("Record Not Found");	
			}
				
			}
			catch(Exception e)
			{
				System.out.println(e);	
			}
	}

}
