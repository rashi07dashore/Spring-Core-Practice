<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%-- <%@page import = "java.lang.*"%> --%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>about page invoked</h1>
	<h2>Another page available is home page</h2>
	
	<%
	Integer rollno = (Integer) request.getAttribute("rollno");
	%>
	Roll number is
	<%=rollno%> 

	<h3>Bye now</h3>
</body>
</html>