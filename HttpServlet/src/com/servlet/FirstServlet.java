package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FirstServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {

		String name = req.getParameter("user_name");
		String pass = req.getParameter("password");

		System.out.println("NAME::" + name);
		// System.out.println("PASSWORD::"+pass);

		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		out.print("<html><body>");
		out.print("<h3> Hi ! " +name+" Welcome to Http Servlet</h3>");
		out.print("</body></html>");
	}

}
