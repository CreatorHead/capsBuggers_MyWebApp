package com.caps.controller;

import java.io.IOException;
import java.net.SocketTimeoutException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.caps.beans.User;
import com.caps.service.UserServices;

@WebServlet("/login")
public class LoginServ extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String userId = req.getParameter("userId");
		String passwd = req.getParameter("passwd");
		
		System.out.println("Inside LoginServ");
		UserServices userServices = new UserServices();
		User u = userServices.userLogin(userId, passwd);
		if(u != null) {
			HttpSession session = req.getSession();
			session.setAttribute("user", u);
			//Login Successful
			resp.sendRedirect("./Home.jsp");
		}else {
			//Login Failed
			System.out.println("Login Failed");
			resp.sendRedirect("./Login.html");
		}
	}
}





