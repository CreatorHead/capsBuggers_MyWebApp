<%@page import="com.caps.beans.User"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page session="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home</title>
</head>
<body>
	<%
		HttpSession session = request.getSession(false);
		if(session == null){
			response.sendRedirect("./Login.html");
		}
	%>
	<%
		User u = null;
		if(session != null){
			u = (User)session.getAttribute("user");
		}
	
		if(u != null){
			out.print(u.getName());
			out.print("<br>");
			out.print(u.getEmail());
		}
		%>
	<br>
	<a href="./logout" >Logout</a>
</body>
</html>