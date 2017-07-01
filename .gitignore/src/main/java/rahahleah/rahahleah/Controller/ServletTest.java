package rahahleah.rahahleah.Controller;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

import rahahleah.rahahleah.User.Users;

/**
 * This Servlet used as a controller to get a values from JSON objects and display them in JSP page
 * 
 */
@WebServlet("/ServletTest")
public class ServletTest extends HttpServlet {
	private static final String PAGE_NAME = "Display.jsp";
	private static final String JSONPageURL = "https://offersvc.expedia.com/offers/v2/getOffers?scenario=deal-finder&page=foo&uid=foo&productType=Hotel";
	private static final long serialVersionUID = 1L;
    public ServletTest() {
    }

	/**
	 * This method to get the JSON object then forward it to the JSP page
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		   URL url;
		   url = new URL(JSONPageURL);
	       InputStreamReader reader = new InputStreamReader(url.openStream());
	       Gson gs = new Gson();
	       Users Objects= gs.fromJson(reader, Users.class); 	       
	       request.setAttribute("Objects",Objects);
	       request.getRequestDispatcher(PAGE_NAME).forward(request, response);	
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

}
