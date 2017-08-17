package com.website.veiw;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.json.JSONObject;

import com.website.Controller.TrackingController;
import com.website.model.Employee;
import com.website.model.Tracking;

/**
 * Servlet implementation class InsertTrackingJSON
 */
@WebServlet("/InsertTrackingJSON")
public class InsertTrackingJSON extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public InsertTrackingJSON() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRhequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out=response.getWriter();
		try
		{
			HttpSession ses=request.getSession();
			Employee E=(Employee)ses.getValue("SEMPLOYEE");
			Tracking t=new Tracking();
			t.setTrackingid(Integer.parseInt(request.getParameter("tid")));
			t.setEmployeeid(Integer.parseInt(request.getParameter("eid")));
			t.setTdate(request.getParameter("tcd"));
			t.setTtime(request.getParameter("tct"));
			t.setDescription(request.getParameter("td"));
			t.setLat(request.getParameter("lat"));
			t.setLng(request.getParameter("lng"));
			
			boolean st=TrackingController.addNewRecord(t);
			JSONObject obj=new JSONObject();
			if(st)
			{
				obj.put("message", "<font Color=green><i>Record Submitted</i></font>");
			}
			else
			{
				obj.put("message", "<font Color=red><i>Fail to Submit Record</i></font>");   
			}
			out.println(obj);
		}
		catch(Exception E)
		{
			System.out.println("InsertTrackingJSON"+E);
		}
	}

}
