<%@page import="com.servlets.model.Alien"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="skyblue">
in show alien...
<%

Alien a1 = (Alien)request.getAttribute("alien");
out.println(a1);

%>

</body>
</html>