package com.website.veiw;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.website.Controller.ConsignerController;
import com.website.model.Consigner;

/**
 * Servlet implementation class DisplayById
 */
@WebServlet("/DisplayById")
public class DisplayById extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DisplayById() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out=response.getWriter();
		Consigner C=ConsignerController.displayById(Integer.parseInt(request.getParameter("cid")));
		System.out.println(Integer.parseInt(request.getParameter("cid")));
		if(C==null)
		{
			out.println("<span>Result Not Found</span>");
		}
		else
		{
			out.println("<script src=filesa/jquery-2.2.1.min.js></script>");
			out.println("<script src=filesa/countrycitystate.js></script>");
			
			out.println("<html>");
			out.println("<body>");
			out.println("<form action=ConsignerEditDelete method='post' enctype='multipart/form-data'>");
			out.println("<table>");
			out.println("<tr>");
			out.println("<td>");
			out.println("<table>");
			out.println("<tr>");
			out.println("<caption>Edit Information</caption>");
			out.println("</tr>");
			
			out.println("<tr>");
			out.println("<td>");
			out.println("Firm Name : ");
			out.println("</td>");
			out.println("<td>");
			out.println("<input type=text value='"+C.getFirmname()+"' name=firmname>");
			out.println("</td>");
			out.println("</tr>");
			
			out.println("<tr>");
			out.println("<td>");
			out.println("Resigtration No : ");
			out.println("</td>");
			out.println("<td>");
			out.println("<input type=text value='"+C.getRegistration_no()+"' name=registration_no>");
			out.println("</td>");
			out.println("</tr>");
			
			out.println("<tr>");
			out.println("<td>");
			out.println("Owner Name : ");
			out.println("</td>");
			out.println("<td>");
			out.println("<input type=text value='"+C.getOwnername()+"' required name=ownername>");
			out.println("</td>");
			out.println("</tr>");
			
			out.println("<tr>");
			out.println("<td>");
			out.println("Contact Person : ");
			out.println("</td>");
			out.println("<td>");
			out.println("<input type=text value='"+C.getContactperson()+"' name=contactperson>");
			out.println("</td>");
			out.println("</tr>");
			
			out.println("<tr>");
			out.println("<td>");
			out.println("Mobile No : ");
			out.println("</td>");
			out.println("<td>");
			out.println("<input type=no value='"+C.getMobileno()+"' size=10 name=mobileno>");
			out.println("</td>");
			out.println("</tr>");
			
			out.println("<tr>");
			out.println("<td>");
			out.println("Phone No : ");
			out.println("</td>");
			out.println("<td>");
			out.println("<input type=no size=10 value='"+C.getPhoneno()+"' name=phoneno>");
			out.println("</td>");
			out.println("</tr>");
			
			out.println("<tr>");
			out.println("<td>");
			out.println("E-Mail : ");
			out.println("</td>");
			out.println("<td>");
			out.println("<input type=email  value='"+C.getEmail()+"' name=email>");
			out.println("</td>");
			out.println("</tr>");
			
			out.println("<tr>");
			out.println("<td>");
			out.println("Address : ");
			out.println("</td>");
			out.println("<td>");
			out.println("<input type=textarea value='"+C.getAddress()+"' size=20 name=address>");
			out.println("</td>");
			out.println("</tr>");
			
			out.println("<tr>");
		    String cnt[]=C.getCountry().split(",");
		    out.println("<td><b><i>Country:</i></b></td><td><input type=hidden value='"+cnt[0]+"' name=icountry><b>"+cnt[1]+"<b><br><select id=country name=country></select></td>");
		    out.println("</tr>");
		        
		    out.println("<tr>");
		    String st[]=C.getState().split(",");
		    out.println("<td><b><i>State:</i></b></td><td><input type=hidden value='"+st[0]+"' name=istate><b>"+st[1]+"<b><br><select id=state name=state><option>-Select-</option></select></td>");
		        
		    out.println("</tr>");
		    String ct[]=C.getCity().split(",");
		    out.println("<tr>");
		    out.println("<td><b><i>City:</i></b></td><td><input type=hidden value='"+ct[0]+"' name=icity><b>"+ct[1]+"<b><br><select id=city name=city><option>-Select-</option></select></td>");
		    out.println("</tr>");
			
			out.println("<tr>");
			out.println("<td>");
			out.println("Deals In : ");
			out.println("</td>");
			out.println("<td>");
			out.println("<input type=text value='"+C.getDeals_in()+"' name=deals_in>");
			out.println("</td>");
			out.println("</tr>");
			
			out.println("<tr>");
			out.println("<td>");
			out.println("Website : ");
			out.println("</td>");
			out.println("<td>");
			out.println("<input type=text value='"+C.getWebsite()+"' name=website>");
			out.println("</td>");
			out.println("</tr>");
		
			out.println("<tr>");
			out.println("<td>");
			out.println("<input type=submit name=btn value=Edit>");
			out.println("</td>");
			out.println("<td>");
			out.println("<input type=reset name=btn value=Reset>");
			out.println("</td>");
			out.println("</tr>");
			
			
			out.println("</table>");

			out.println("</td>");
			out.println("<td>");
			out.println("</td><td valign=top>");
	        out.println("<img src=images/"+C.getFirmlogo()+" width=250 height=250><br><br><b><i>Update Picture:<i><br><input type=file name=firmlogo><br><br><input type=submit name=btn value=Update></td></tr></table>");
			out.println("</td>");
			out.println("</tr>");
			out.println("</table>");
			out.println("</form>");
			out.println("<a href=ConsignerDisplayAll>Go back</a>");
			out.println("</body>");
			out.println("</html>");
		}
	}

}
