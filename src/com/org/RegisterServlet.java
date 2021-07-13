package com.org;

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

import org.apache.log4j.Logger;


public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	Logger logger=Logger.getLogger(RegisterServlet.class);
       
   
    public RegisterServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		
		
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		String customerID=request.getParameter("customerID");
		String customerName=request.getParameter("customerName");
		String customerAddress=request.getParameter("customerAddress");
		String password=request.getParameter("password");
		try{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=DriverManager.getConnection(
		"jdbc:oracle:thin:@localhost:1521:xe","system","root");
		PreparedStatement ps=con.prepareStatement(
		"insert into customers(customerID,customerName,customerAddress,password) values(?,?,?,?)");
		ps.setString(1, customerID);
		ps.setString(2,customerName);
		ps.setString(3,customerAddress);
		ps.setString(4, password);
		ps.executeUpdate();
		logger.info("You are successfully registered");
		//out.print("You are successfully registered");
		response.sendRedirect("login.jsp");
		}catch (ClassNotFoundException e) {
		e.printStackTrace();
		} catch (SQLException e) {
		e.printStackTrace();
		}
		out.close();
	}

}
