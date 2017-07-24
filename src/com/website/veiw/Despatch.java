package com.website.veiw;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Despatch
 */
@WebServlet("/Despatch")
public class Despatch extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Despatch() {
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
		out.println("<title>Disptach</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<form action='SetDispatch' method='post'>");
		out.println("<table>");
		
		out.println("<tr>");
		out.println("<caption>Disptach Registration</caption>");
		out.println("</tr>");
		
		out.println("<tr>");
		out.println("<td>");
		out.println("Employee Id");
		out.println("</td>");
		out.println("<td>");
		out.println("<input type=text name=employeeid>");
		out.println("</td>");
		out.println("</tr>");
		
		out.println("<tr>");
		out.println("<td>");
		out.println("Dispatch Date:");
		out.println("</td>");
		out.println("<td>");
		out.println("<input type=date name=dispatchdate>");
		out.println("</td>");
		out.println("</tr>");
		
		out.println("<tr>");
		out.println("<td>");
		out.println("Disptach Time:");
		out.println("</td>");
		out.println("<td>");
		out.println("<input type=time name=dispatchtime>");
		out.println("</td>");
		out.println("</tr>");
		
		out.println("<tr>");
		out.println("<td>");
		out.println("Consigner Id:");
		out.println("</td>");
		out.println("<td>");
		out.println("<input type=text name=consignerid>");
		out.println("</td>");
		out.println("</tr>");
		
		out.println("<tr>");
		out.println("<td>");
		out.println("Consignee Id:");
		out.println("</td>");
		out.println("<td>");
		out.println("<input type=text name=consigneeid>");
		out.println("</td>");
		out.println("</tr>");
		
		out.println("<tr>");
		out.println("<td>");
		out.println("Product Despcription:");
		out.println("</td>");
		out.println("<td>");
		out.println("<input type=text name=productdescription>");
		out.println("</td>");
		out.println("</tr>");
		
		out.println("<tr>");
		out.println("<td>");
		out.println("Product Type:");
		out.println("</td>");
		out.println("<td>");
		out.println("<input type=text name=producttype>");
		out.println("</td>");
		out.println("</tr>");
		
		out.println("<tr>");
		out.println("<td>");
		out.println("Total Box:");
		out.println("</td>");
		out.println("<td>");
		out.println("<input type=text name=totalbox>");
		out.println("</td>");
		out.println("</tr>");
		
		out.println("<tr>");
		out.println("<td>");
		out.println("Quantity:");
		out.println("</td>");
		out.println("<td>");
		out.println("<input type=text name=quantity>");
		out.println("</td>");
		out.println("</tr>");
		
		out.println("<tr>");
		out.println("<td>");
		out.println("Amount:");
		out.println("</td>");
		out.println("<td>");
		out.println("<input type=text name=amount>");
		out.println("</td>");
		out.println("</tr>");
		
		out.println("<tr>");
		out.println("<td>");
		out.println("Charge Of Dispatch:");
		out.println("</td>");
		out.println("<td>");
		out.println("<input type=text name=chargeofdispatch>");
		out.println("</td>");
		out.println("</tr>");
		
		out.println("<tr>");
		out.println("<td>");
		out.println("Dispatch From:");
		out.println("</td>");
		out.println("<td>");
		out.println("<input type=text name=dispatchfrom>");
		out.println("</td>");
		out.println("</tr>");
		
		out.println("<tr>");
		out.println("<td>");
		out.println("Dispatch To:");
		out.println("</td>");
		out.println("<td>");
		out.println("<input type=text name=dispatchto>");
		out.println("</td>");
		out.println("</tr>");
		
		out.println("<tr>");
		out.println("<td>");
		out.println("By:");
		out.println("</td>");
		out.println("<td>");
		out.println("<input type=text name=by>");
		out.println("</td>");
		out.println("</tr>");
		
		out.println("<tr>");
		out.println("<td>");
		out.println("Vechile No:");
		out.println("</td>");
		out.println("<td>");
		out.println("<input type=text name=vehicleno>");
		out.println("</td>");
		out.println("</tr>");
		
		out.println("<tr>");
		out.println("<td>");
		out.println("Approx Days:");
		out.println("</td>");
		out.println("<td>");
		out.println("<input type=text name=approxdays>");
		out.println("</td>");
		out.println("</tr>");
		
		out.println("<tr>");
		out.println("<td>");
		out.println("<input type='submit'>");
		out.println("</td>");
		out.println("<td>");
		out.println("<input type=reset>");
		out.println("</td>");
		out.println("</tr>");
		
		out.println("</table>");
		out.println("</form>");
		out.println("</body>");
		out.println("</html>");
		out.flush();
	}

}
