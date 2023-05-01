package com.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.servlets.dao.AlienDao;
import com.servlets.model.Alien;

//@WebServlet("/GetDetails")
public class GetDetailsController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		int aid = Integer.parseInt(request.getParameter("aid"));
		
		AlienDao  adao = new AlienDao();
		Alien a1= adao.getAlien(aid);
		
		request.setAttribute("alien", a1);
		
		RequestDispatcher rd = request.getRequestDispatcher("ShowAlienjsp.jsp");
		rd.forward(request, response);
	}

}
