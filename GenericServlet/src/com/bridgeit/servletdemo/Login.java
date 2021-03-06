package com.bridgeit.servletdemo;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

@SuppressWarnings("serial")
public class Login extends GenericServlet {
	
	//A convenience method which can be overridden so that there's no need to call super.init(config).
	@Override
	public void init() throws ServletException {
		super.init();
	}

	//Called by the servlet container to allow the servlet to respond to a request.
	@Override
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("user_name");
		
		String pass = request.getParameter("password");

		System.out.println("NAME::" + name);
		// System.out.println("PASSWORD::"+pass);

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.print("<html><body>");
		out.print("<h3> Hi ! " + name + " Welcome to generic Servlet</h3>");
		out.print("</body></html>");

		//method to destroy Servlet
		destroy();

	}

}
