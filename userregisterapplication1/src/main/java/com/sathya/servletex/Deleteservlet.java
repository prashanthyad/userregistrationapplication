package com.sathya.servletex;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Deleteservlet")
public class Deleteservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String moblie=request.getParameter("mobile");
		Dao dao=new Dao();
		int result=dao.deleteByMobile(moblie);
		request.setAttribute("result", result);
		RequestDispatcher dispatcher=request.getRequestDispatcher("Deleteresult.jsp");
		dispatcher.forward(request, response);
		
	}

}
