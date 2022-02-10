<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Product Result</title>
</head>
<body>
	<h1> Product Results: </h1>
	<p>  
		${prodOutput.getNum1() } * ${prodOutput.getNum2() } = <strong>${prodOutput.getNumResult() }</strong>
	</p>
	
	<p><a href = "index.jsp"> Click Here to Do Another Calculation </a> </p>


</body>
</html>