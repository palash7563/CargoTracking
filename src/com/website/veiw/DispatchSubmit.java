package com.website.veiw;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.website.Controller.ConsigneeController;
import com.website.Controller.ConsignerController;
import com.website.Controller.DispatchController;
import com.website.Controller.TrackingController;
import com.website.model.Consignee;
import com.website.model.Consigner;
import com.website.model.Dispatch;
import com.website.model.Tracking;

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
			int tid=DispatchController.getTrackingid();
			
			//add record to tracking
			Tracking t=new Tracking();
			t.setTrackingid(tid);
			t.setEmployeeid(D.getEmployeeid());
			t.setTdate(D.getDispatchdate());
			t.setTtime(D.getDispatchtime());
			StringBuffer des=new StringBuffer();
			des.append("Dispatch From: "+D.getDispatchfrom()+"\r");
			des.append("Dispatch To:"+D.getDispatchto()+"\r");
			des.append("Disptach By :"+D.getRoute()+"\r");
			t.setDescription(des.toString());
			t.setLat("0");
			t.setLng("0");
			TrackingController.addNewRecord(t);
			
			//sms to consigner and consignee
			
			 SmsServlet sms=new SmsServlet();
	         Consigner Cr=new Consigner();
	         
	         Cr=ConsignerController.displayById(D.getConsignerid());
	          System.out.print(Cr.getMobileno());
	         sms.SendSms("COM5",Cr.getMobileno() ,"Your Product Has Been Dispatched..Ur Tracking is "+tid);
	       Consignee Ce=new  Consignee();
	       Ce=ConsigneeController.displayById(D.getConsigneeid());
	       sms.SendSms("COM5",Ce.getMobileno() ,"Your Product Has Been Dispatched..Ur Tracking is "+tid);
		}
		if(st==false)
		{
			out.println("Record Not Submitted");
		}
		out.println("</body>");
		out.println("</html>");
	}
}
