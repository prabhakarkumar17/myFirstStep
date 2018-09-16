package com.by_SERVLET;

import java.io.IOException;

import java.sql.*;
import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/insert_value")
public class insert_value extends HttpServlet 
{
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		PrintWriter pw = response.getWriter();
		  String URL = "jdbc:mysql://localhost:8082/student";
		  
		  try
		  {
			  
		  String name = request.getParameter("name");
		  String roll_no = request.getParameter("roll_no");
		  int adm_no =Integer.parseInt(request.getParameter("adm_no"));
		  String adress = request.getParameter("adress");
		  String college = request.getParameter("college");
		  
	
		  Class.forName("com.mysql.jdbc.Driver");		  
		  Connection con= DriverManager.getConnection(URL, "root", "");
		  PreparedStatement pst = con.prepareStatement("insert into info values(?,?,?,?,?)");
		  
		  
		  pst.setString(1,name);
		  pst.setString(2,roll_no);
		  pst.setInt(3,adm_no);
		  pst.setString(4,adress);
		  pst.setString(5,college);
		  
		  
		  int i = pst.executeUpdate();
		  if(i!=0)
		  {
		  pw.println("Record has been inserted");
		  }
		  else
		  {
		  pw.println("failed to insert the data");
		  }
		  }
		  catch (Exception e){
		  pw.println(e);
		  }
		  }
		

	}


