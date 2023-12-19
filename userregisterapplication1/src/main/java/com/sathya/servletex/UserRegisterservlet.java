package com.sathya.servletex;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/UserRegister")
public class UserRegisterservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    
    
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//Get the requested data 
				String username = request.getParameter("username");
				String password = request.getParameter("password");
				String email = request.getParameter("email");
				String mobile = request.getParameter("mobile");
				
				//Give the Data to DAO layer 
				Dao dao = new Dao();
				int result=dao.saveUser(username, password, email, mobile);
				
				// to send result to jsp file and stores into request object
				 request.setAttribute("result", result);
				 //
				 RequestDispatcher dispatcher=request.getRequestDispatcher("registerstatus.jsp");
				 dispatcher.forward(request, response);
				 
				
	}

}
