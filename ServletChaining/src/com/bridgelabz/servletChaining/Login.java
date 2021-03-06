package com.bridgelabz.servletChaining;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Login extends HttpServlet {

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		String name = request.getParameter("name");
		String password = request.getParameter("password");

		String msg = "Hey, User...";
		request.setAttribute("msg", msg);
		
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("servlet2");
		requestDispatcher.include(request, response);

	}

}
