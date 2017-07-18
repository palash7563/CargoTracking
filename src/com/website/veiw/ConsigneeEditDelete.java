package com.website.veiw;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import org.softech.FileUpload;

import com.website.Controller.ConsigneeController;

import com.website.model.Consignee;


/**
 * Servlet implementation class ConsigneeEditDelete
 */
@WebServlet("/ConsigneeEditDelete")
@MultipartConfig(fileSizeThreshold=1024*1024*2,//2MB
maxFileSize=1024*1024*10,//10MB
maxRequestSize=1024*1024*50)

public class ConsigneeEditDelete extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ConsigneeEditDelete() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		PrintWriter out=response.getWriter();
		String btn=request.getParameter("btn");
		if(btn.equals("Edit"))
		{
			Consignee C=new Consignee();
			C.setId(Integer.parseInt(request.getParameter("cid")));
			C.setFirmname(request.getParameter("firmname"));
			C.setRegistration_no(request.getParameter("registrationno"));
			C.setOwnername(request.getParameter("ownername"));
	        C.setContactperson(request.getParameter("contactperson"));
	        C.setMobileno(request.getParameter("mobileno"));
	        C.setPhoneno(request.getParameter("phoneno"));
	        C.setEmail(request.getParameter("email"));
	        C.setAddress(request.getParameter("address"));
	        if(request.getParameter("city").equals("-Select-"))
	        { C.setCountry(request.getParameter("icountry"));
	        C.setState(request.getParameter("istate"));
	        C.setCity(request.getParameter("icity"));}
	        else
	        {
	        C.setCountry(request.getParameter("country"));
	        C.setState(request.getParameter("state"));
	        C.setCity(request.getParameter("city"));
	        }
	        C.setDeals_in(request.getParameter("dealsin"));
	        C.setWebsite(request.getParameter("website"));
			boolean st=ConsigneeController.editRecord(C);
			response.sendRedirect("ConsigneeDisplayAll");
		}
		else if(btn.equals("Delete"))
		{boolean st=ConsigneeController.deleteRecord(Integer.parseInt(request.getParameter("cid")));
		response.sendRedirect("ConsigneeDisplayAll");
		}
		else if(btn.equals("Update"))
		{Consignee C=new Consignee();
			C.setId(Integer.parseInt(request.getParameter("cid")));
		
			Part part=request.getPart("firmlogo");
	        String path="F:/Eclipse Mars/eclipse/CargoTracking/WebContent/images";
	        FileUpload F=new FileUpload(part,path);
	        C.setFirmlogo(F.filename);
	        boolean st=ConsigneeController.updatePicture(C);
			response.sendRedirect("ConsigneeDisplayAll");
		}
		
		 

	
	
	}

}
