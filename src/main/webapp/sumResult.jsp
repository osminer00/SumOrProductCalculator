<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix ="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Sum Result</title>
</head>
<body>
	<h1> Result of Sum: </h1>
	<p>  
		${sumOutput.getNum1() } + ${sumOutput.getNum2() } = <strong>${sumOutput.getNumResult() }</strong>
	</p>
	
	<p><a href = "index.jsp"> Click Here to Do Another Calculation </a> </p>
	
</body>
</html>