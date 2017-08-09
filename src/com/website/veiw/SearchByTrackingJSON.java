package com.website.veiw;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.JSONObject;

import com.website.Controller.Dbhelper;
import com.website.Controller.TrackingController;

/**
 * Servlet implementation class SearchByTrackingJSON
 */
@WebServlet("/SearchByTrackingJSON")
public class SearchByTrackingJSON extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SearchByTrackingJSON() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out=response.getWriter();
		try
		{
			//System.out.println(request.getParameter("tid"));
			ResultSet rs=TrackingController.trackingbyid(Integer.parseInt(request.getParameter("tid")));
			ArrayList<JSONObject>obj;
			obj=Dbhelper.JsonEngine(rs);
			out.println(obj);
		}
		catch(Exception e)
		{
			System.out.println("SearchByTrackingJSON "+e);
		}
	}

}
