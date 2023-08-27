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

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public LoginServlet() {
		super();

	}
	
	

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException 
			
	{
		response.setContentType("text/html");
		
		String userName = request.getParameter("name");
		String userPassword = request.getParameter("pass");
		
		// Below the code for printing the data to the server
		PrintWriter out  = response.getWriter();
		
		HttpSession session = request.getSession();
		session.setAttribute("userName", userName);
		/**
		 * This refer that get the request from the client and use the same servlet and show the books .
		 */
		RequestDispatcher dispatcher = request.getRequestDispatcher("home.html");
		dispatcher.forward(request, response); // Get the response and send the request to the client.
		
//		response.sendRedirect("home.html"); // This will redirect to that whole home html page and url will be changed.
		
	}

}
