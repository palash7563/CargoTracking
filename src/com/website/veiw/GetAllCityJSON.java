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

import com.website.Controller.CountryStateCity;
import com.website.Controller.Dbhelper;

/**
 * Servlet implementation class GetAllCityJSON
 */
@WebServlet("/GetAllCityJSON")
public class GetAllCityJSON extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GetAllCityJSON() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		try
		{
			System.out.println(request.getParameter("stateid"));
			PrintWriter out=response.getWriter();
			ResultSet rs=CountryStateCity.getallCity(Integer.parseInt(request.getParameter("stateid")));
			ArrayList<JSONObject> obj;
			obj=Dbhelper.JsonEngine(rs);
			out.println(obj);
		}catch(Exception E)
		{
			System.out.println("GETALLCITY"+E);
		}
	}
}
