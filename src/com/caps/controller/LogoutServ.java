package com.caps.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/logout")
public class LogoutServ extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession session = req.getSession(false);
		if(session != null) {
			session.invalidate();
		}
		
		Cookie[] cookies = req.getCookies();
		if(cookies != null) {
			for(Cookie c: cookies) {
				if(c.getName().equals("JSESSIONID")){
					c.setMaxAge(0);
					resp.addCookie(c);
				}
			}
		}
		resp.sendRedirect("./Login.html");
	}
}
