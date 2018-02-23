package com.bridgelabz.servletJdbc;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RegistrationDelete extends HttpServlet {

	Connection connection = null;
	PreparedStatement preparedStatement = null;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		resp.setContentType("text/html");
		PrintWriter printWriter = resp.getWriter();

		String id = req.getParameter("id");
		//System.out.println("Hiiiii...");
		try {
			Class.forName("com.mysql.jdbc.Driver");

			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/bidgelabz_db", "root", "root");
			System.out.println("Connection established with DataBase..");
			System.out.println("connection done");

			preparedStatement = connection.prepareStatement("DELETE from registration WHERE id=?");
			preparedStatement.setString(1, id);

			preparedStatement.executeUpdate();

			printWriter.print("<html><body>");
			printWriter.print("<h5>DEleted Successfully..</h5>" + id);
			printWriter.print("</body></html>");

		} catch (Exception e) {
			printWriter.print(e);
		}
	}

}
