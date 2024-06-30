<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@page import = "java.util.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>index page</title>
</head>
<body>
	<h1>This is the home page</h1>
	<h2>Called by home controller</h2>
	<h1>url /home</h1>

	<%
	String name = (String) request.getAttribute("name"); //give key here
	
	List<String> f = (List<String>) request.getAttribute("f");
	%>
	<h2> Name is <%=name%>. This name was sent from controller to view</h2>
	My friends are
	<% 
	for(String s: f)
	{
		out.println(s);
	}
	%>
</body>
</html>