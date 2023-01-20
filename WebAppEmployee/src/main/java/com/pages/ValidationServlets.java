package com.pages;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dal.UserDALImpli;
import com.dbutil.DButil;

//step1
@WebServlet(value="/loginservlet")


public class ValidationServlets extends HttpServlet {

	
	private static final long serialVersionUID = 1L;

	UserDALImpli uobj;
	
	@Override
	public void init() throws ServletException {
	System.out.println("Excution Starts Here: Inside init method ");
	
	try {
		DButil.openConnection();
		uobj=new UserDALImpli();
	} catch (SQLException e) {
		System.out.println("Error : "+e);
		e.printStackTrace();
	} catch (ClassNotFoundException e) {
		e.printStackTrace();
	}
	
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		System.out.println("......inside DoPost Method.....");
		resp.setContentType("text/html");
		try(PrintWriter pobj = resp.getWriter())
		{
		pobj.write("<hr>");
		
		String username=req.getParameter("login");
		String pwd=req.getParameter("password");
		System.out.println("Password entered : "+pwd+" ,  UserName: "+username);
	if(pobj!=null)
	{
	pobj.write("<h1>valid user name :"+username+"</h1>");	
	pobj.write("<h1>valid paasword: "+pwd+"</h1>");
	}
	else {
		System.out.println("<h1>invalid user"+username+"</h1>");
	}
		}
		catch( Exception e)
		
		{
		System.out.println(e.getMessage());	
		}
		
	}


	@Override
	public void destroy() {
	
		System.out.println("...Implicitely calling when server get stopped:Inside destroy......");
	}

	
}
/*
 * INFO: Server startup in [1662] milliseconds
Excution Starts Here: Inside init method 
Driver are Loaded....
Connection name : com.mysql.cj.jdbc.ConnectionImpl@35f408ec
Connected to FACBBOOK DATABaSE
getting connection
inside userDALimplented class constructor
......inside DoPost Method.....
Password entered : abc ,  UserName: ranka
Jan 20, 2023 3:03:03 PM org.apache.catalina.core.StandardServer await
INFO: A valid shutdown command was received via the shutdown port. Stopping the Server instance.
Jan 20, 2023 3:03:03 PM org.apache.coyote.AbstractProtocol pause
INFO: Pausing ProtocolHandler ["http-nio-8080"]
Jan 20, 2023 3:03:03 PM org.apache.catalina.core.StandardService stopInternal
INFO: Stopping service [Catalina]
...Implicitely calling when server get stopped:Inside destroy......
 * */




