<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page import="java.time.*"%>
<%@page isELIgnored="false"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!-- Found this taglib form jstl uri oracle website -->
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Help Page</title>
</head>
<body>
	<h1>Hello</h1>
	<h2>Do you need help?</h2>
	<h2>Contact us</h2>
	<%
	/* String name = (String) request.getAttribute("name");
	Integer id = (Integer) request.getAttribute("id");
	LocalDateTime time = (LocalDateTime) request.getAttribute("time"); */
	%>
	<h2>
		My name is
		<%-- <%=name %> --%>
		${name }     <!-- By using the JSP Expression language -->
		and my id is ${id }
		<%-- <%=id %> --%>
	</h2>
	<h3>
		current time is ${time }
		<%-- <%=time %> --%>
	</h3>
	<h2> Marks were ${marks } <!-- Marks as list --> </h2>
	For Traversing using for each 
	<c:forEach var="item" items= "${marks }"> 
	<h1> ${item }</h1>
	</c:forEach> 
	<%-- <h3><c:out value="${item }"></c:out></h3>  --%>
 </body>
</html>