<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">
<meta charset="ISO-8859-1">
<title>Form Success</title>
</head>
<body>
<h1 class="bg-danger text-white text-center">${successHeader }</h1>
<h2 class="p-3 mb-2 bg-success text-white text-center">${msg }</h2>
<h1>Form has been successfully submitted</h1>
<h2>Your name is <%-- ${name } --%> 
${user.userName }
</h2>
<h2> And email id entered is ${user.userEmail } <%-- ${email } --%></h2>
<h3>with password ${user.userPassword } <%-- ${password } --%></h3>
</body>
</html>