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

import com.website.Controller.ConsignerController;
import com.website.Controller.Dbhelper;
import com.website.Controller.DispatchController;

/**
 * Servlet implementation class DisptachProducttypeJSON
 */
@WebServlet("/DisptachProducttypeJSON")
public class DisptachProducttypeJSON extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DisptachProducttypeJSON() {
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
			PrintWriter out=response.getWriter();
			ResultSet rs=DispatchController.getallproducttype();
			ArrayList<JSONObject> obj;
			obj=Dbhelper.JsonEngine(rs);
			out.println(obj);
		}
		catch(Exception E)
		{
			System.out.println("Get all Product type "+E);
		}
	}

}
