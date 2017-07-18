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

import com.website.Controller.EmployeeController;
import com.website.model.Employee;

/**
 * Servlet implementation class EmployeeSubmit
 */
@WebServlet("/EmployeeSubmit")
@MultipartConfig(fileSizeThreshold=1024*1024*2,//2MB
maxFileSize=1024*1024*10,//10MB
maxRequestSize=1024*1024*50)


public class EmployeeSubmit extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EmployeeSubmit() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
PrintWriter out=response.getWriter();
Employee E=new Employee();

//Employee

E.setEmployeename(request.getParameter("employeename"));
E.setDob(request.getParameter("dob"));
E.setAddress(request.getParameter("address"));
E.setCountry(request.getParameter("country"));
E.setState(request.getParameter("state"));
E.setCity(request.getParameter("city"));
E.setPhone(request.getParameter("phoneno"));
E.setMobile(request.getParameter("mobileno"));
E.setQualification(request.getParameter("qualification"));
E.setDesignation(request.getParameter("designation"));

Part part=request.getPart("photograph");
String path="C:/Users/Palash/Desktop/CargoTracking/WebContent/images";
FileUpload F=new FileUpload(part,path);
E.setPhotograph(F.filename);
E.setPassword(request.getParameter("password"));


boolean st=EmployeeController.addNewRecord(E);


out.println("<html>");
if(st)
{
	out.println("Record Submitted");
}
else
{
	out.println("Fail to Submit Record");
}
out.println("</html>");
out.flush();	
	}

}
