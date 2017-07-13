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

import com.website.Controller.ConsignerController;
import com.website.model.Consigner;

@WebServlet("/ConsignerSubmit")
@MultipartConfig(fileSizeThreshold=1024*1024*2,//2MB
maxFileSize=1024*1024*10,//10MB
maxRequestSize=1024*1024*50)
public class ConsignerSubmit extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ConsignerSubmit() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out=response.getWriter();
		Consigner C=new Consigner();
		C.setFirmname(request.getParameter("firmname"));
		C.setRegistration_no(request.getParameter("registration_no"));
		C.setOwnername(request.getParameter("ownername"));
		C.setContactperson(request.getParameter("contactperson"));
		C.setMobileno(request.getParameter("mobileno"));
		C.setPhoneno(request.getParameter("phoneno"));
		C.setEmail(request.getParameter("email"));
		C.setAddress(request.getParameter("address"));
		C.setCountry(request.getParameter("country"));
		C.setState(request.getParameter("state"));
		C.setCity(request.getParameter("city"));
		C.setDeals_in(request.getParameter("deals_in"));
		C.setWebsite(request.getParameter("website"));
		C.setPassword(request.getParameter("password"));
		
		//firmlogopath
		String Path="C:/Users/Palash/Desktop/CargoTracking/WebContent/images";
		Part part=request.getPart("firmlogo");
		FileUpload F=new FileUpload(part,Path);
		C.setFirmlogo(F.filename);
		
		boolean st=ConsignerController.addrecord(C);
		out.println("<html>");
		if(st)
		{
			out.println("Record Submitted<br>");
			out.println("<a href=ConsignerView>Insert Another</a>");
		}
		else
		{
			out.println("Not Submitted");
		}
		out.println("</html>");
		out.flush();
	}
}