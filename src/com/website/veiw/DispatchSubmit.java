package com.website.veiw;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.website.Controller.DispatchController;
import com.website.model.Dispatch;

/**
 * Servlet implementation class DispatchSubmit
 */
@WebServlet("/DispatchSubmit")


public class DispatchSubmit extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DispatchSubmit() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		
		Dispatch D=new Dispatch();
		D.setEmployeeid(Integer.parseInt(request.getParameter("employeeid")));
		D.setDispatchdate(request.getParameter("dispatchdate"));
		D.setDispatchtime(request.getParameter("dispatchtime"));
		D.setConsignerid(Integer.parseInt(request.getParameter("consignerid")));
		D.setConsigneeid(Integer.parseInt(request.getParameter("consigneeid")));
		D.setProductdescription(request.getParameter("productdescription"));
		D.setProducttype(request.getParameter("producttype"));
		D.setTotalbox(request.getParameter("totalbox"));
		D.setQuantitybox(request.getParameter("quantitybox"));
		D.setAmount(request.getParameter("amount"));
		D.setChargeofdispatch(request.getParameter("chargeofdispatch"));
		D.setDispatchfrom(request.getParameter("dispatchfrom"));
		D.setDispatchto(request.getParameter("dispatchto"));
		D.setRoute(request.getParameter("route"));
		D.setVehicleno(request.getParameter("vehicleno"));
		D.setApproxdays(request.getParameter("approxdays"));
		
		boolean st=DispatchController.addrecord(D);
		out.println("<html>");
		out.println("<body>");
		if(st==true)
		{
			out.println("Record Submitted");
			
			
		}
		if(st==false)
		{
			out.println("Record Not Submitted");
		}
		out.println("</body>");
		out.println("</html>");
	}
}
