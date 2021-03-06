package com.bridgelabz.servletChaining;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FirstServlet extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name= req.getParameter("name");
		//System.out.println("Name.."+name);

		req.setAttribute("name", name);
		
		RequestDispatcher requestDispatcher=req.getRequestDispatcher("index.jsp");
		requestDispatcher.forward(req, resp);
	}

}
