package com.fssa.learn.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
       
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// get the value through the parameter 
		String name = request.getParameter("name");
		String Password = request.getParameter("password");
		
		/**
		 * Below the code for httpsessions 
		 * This will take the value from the cilent and send the different servlet
		 * 
		 */
		HttpSession session = request.getSession();
		session.setAttribute("userName", name);
		
		/**
		 * Create a Printwriter for the show the data to the client
		 *In servlet we can use the printwriter obj
		 */
		PrintWriter out = response.getWriter();
		out.println("Email and pass valid");
//		response.sendRedirect("home.html");
		RequestDispatcher dispatcher = request.getRequestDispatcher("home.html");
		dispatcher.forward(request, response);
	}

}