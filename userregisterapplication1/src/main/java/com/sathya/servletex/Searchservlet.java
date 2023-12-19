package com.sathya.servletex;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Searchservlet")
public class Searchservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	    String email=request.getParameter("email");	
	    //calling the dao method layer by passing email
	    Dao dao=new Dao();
        Userinfo userinfo=dao.findByEmail(email);
        //set the data to the  request object
        request.setAttribute("userinfo", userinfo);
        RequestDispatcher dispatcher=request.getRequestDispatcher("Searchresult.jsp");
        dispatcher.forward(request, response);
  }

}
