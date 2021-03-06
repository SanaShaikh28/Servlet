package com.bridgelabz.servletJdbc;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RegistrationInsert extends HttpServlet {

	Connection connection = null;
	PreparedStatement preparedStatement = null;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		
        String id=req.getParameter("id");
		String name = req.getParameter("name");
		String password = req.getParameter("password");

		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/bidgelabz_db", "root", "root");
			System.out.println("Connection established with DataBase..");
			//System.out.println("connection done");

			preparedStatement = connection.prepareStatement("INSERT into registration VALUES(?,?,?)");
			preparedStatement.setString(1, id);
			preparedStatement.setString(2, name);
			preparedStatement.setString(3, password);

			preparedStatement.executeUpdate();
			//System.out.println("DAta inserted Successfully..");
			
			out.print("<html><body>");
			out.print("<h3>Your Data inserted Successfully in Database</h3>" +name);
			out.print("</body></html>");

		} catch (Exception e) {
			System.out.println(e);
		} finally {
			if (preparedStatement != null) {
				try {
					preparedStatement.close();
				} catch (SQLException e) {
					System.out.println(e);
				}
				if (connection != null) {
					try {
						connection.close();
					} catch (Exception e) {
						System.out.println(e);
					}
				}
			}
		}
	}
}
