<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Sum of Two Numbers</title>
</head>
<body>
	<h1>Sum of Two Numbers </h1>
	<form action = "sumServlet" method = "post">
	
	Enter your 1st number: 
	<input type = "text" name = "sumNum1" size = "10">
	
	Enter your 2nd number: 
	<input type = "text" name = "sumNum2" size = "10">
	
	<input type = "submit" value = "Display Sum">
	</form>
	
</body>
</html>