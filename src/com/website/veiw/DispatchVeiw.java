package com.website.veiw;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DispatchVeiw
 */
@WebServlet("/DispatchVeiw")
public class DispatchVeiw extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DispatchVeiw() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		PrintWriter out=response.getWriter();
		out.println("<script type=text/javascript src='filesa/jquery-2.2.1.min.js'></script>");
		out.println("<script type=text/javascript src='filesa/route.js'></script>");
		out.println("<script type=text/javascript src='filesa/dispatchconsignerid.js'></script>");
		out.println("<script type=text/javascript src='filesa/dispatchconsigneeid.js'></script>");
		out.println("<script type=text/javascript src='filesa/producttype.js'></script>");
		
		out.println("<html>");
		out.println("<head>");
		out.println("<title>Disptach</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<form action='DispatchSubmit' method='post'>");
		out.println("<table>");
		
		out.println("<tr>");
		out.println("<caption>Disptach Registration</caption>");
		out.println("</tr>");
		
		out.println("<tr>");
		out.println("<td>");
		out.println("Employee Id");
		out.println("</td>");
		out.println("<td>");
		out.println("<input type=text name=employeeid required>");
		out.println("</td>");
		out.println("</tr>");
		
		out.println("<tr>");
		out.println("<td>");
		out.println("Dispatch Date:");
		out.println("</td>");
		out.println("<td>");
		out.println("<input type=date name=dispatchdate required>");
		out.println("</td>");
		out.println("</tr>");
		
		out.println("<tr>");
		out.println("<td>");
		out.println("Disptach Time:");
		out.println("</td>");
		out.println("<td>");
		out.println("<input type=time name=dispatchtime required>");
		out.println("</td>");
		out.println("</tr>");
		
		out.println("<tr>");
		out.println("<td>");
		out.println("Consigner Id:");
		out.println("</td>");
		out.println("<td>");
		out.println("<select id=consignerid required name=consignerid><option>-Select-</option></select>");
		out.println("</td>");
		out.println("</tr>");
		
		out.println("<tr>");
		out.println("<td>");
		out.println("Consignee Id:");
		out.println("</td>");
		out.println("<td>");
		out.println("<select id='consigneeid' required name='consigneeid'><option>-Select-</option></select>");
		out.println("</td>");
		out.println("</tr>");
		
		out.println("<tr>");
		out.println("<td>");
		out.println("Product Despcription:");
		out.println("</td>");
		out.println("<td>");
		out.println("<input type=text required name=productdescription>");
		out.println("</td>");
		out.println("</tr>");
		
		out.println("<tr>");
		out.println("<td>");
		out.println("Product Type:");
		out.println("</td>");
		out.println("<td>");
		out.println("<select name='producttype' id='producttype'><option>-Select-</option></select>");
		out.println("</td>");
		out.println("</tr>");
		
		out.println("<tr>");
		out.println("<td>");
		out.println("Total Box:");
		out.println("</td>");
		out.println("<td>");
		out.println("<input type=text required name=totalbox>");
		out.println("</td>");
		out.println("</tr>");
		
		out.println("<tr>");
		out.println("<td>");
		out.println("Quantity:");
		out.println("</td>");
		out.println("<td>");
		out.println("<input type=text required name=quantity>");
		out.println("</td>");
		out.println("</tr>");
		
		out.println("<tr>");
		out.println("<td>");
		out.println("Amount:");
		out.println("</td>");
		out.println("<td>");
		out.println("<input type=text required name=amount>");
		out.println("</td>");
		out.println("</tr>");
		
		out.println("<tr>");
		out.println("<td>");
		out.println("Charge Of Dispatch:");
		out.println("</td>");
		out.println("<td>");
		out.println("<input type=text required name=chargeofdispatch>");
		out.println("</td>");
		out.println("</tr>");
		
		out.println("<tr>");
		out.println("<td>");
		out.println("Dispatch From:");
		out.println("</td>");
		out.println("<td>");
		out.println("<input type=text required name=dispatchfrom>");
		out.println("</td>");
		out.println("</tr>");
		
		out.println("<tr>");
		out.println("<td>");
		out.println("Dispatch To:");
		out.println("</td>");
		out.println("<td>");
		out.println("<input type=text required name=dispatchto>");
		out.println("</td>");
		out.println("</tr>");
		
		out.println("<tr>");
		out.println("<td>");
		out.println("Route:");
		out.println("</td>");
		out.println("<td>");
		out.println("<select id='route' required name='route'><option>-Select-</option></select>");
		out.println("</td>");
		out.println("</tr>");
		
		out.println("<tr>");
		out.println("<td>");
		out.println("Vechile No:");
		out.println("</td>");
		out.println("<td>");
		out.println("<input type=text required name=vehicleno>");
		out.println("</td>");
		out.println("</tr>");
		
		out.println("<tr>");
		out.println("<td>");
		out.println("Approx Days:");
		out.println("</td>");
		out.println("<td>");
		out.println("<input type=text required name=approxdays>");
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
