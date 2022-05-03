<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <%@page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Display Person</title>
</head>
<body>
<h2> Person Table</h2>
<table>
<tr> 
	<th>number</th>
	<th>name</th>
	<th>gender</th>
	<th>age</th>
	<th>street</th>
	<th>city</th>
	<th>pin code</th>
</tr>
<c:forEach items="${person}" var="person" >
<tr>
<td>${person.number}</td>
<td>${person.name}</td>
<td>${person.gender}</td>
<td>${person.age}</td>
<td>${person.street}</td>
<td>${person.city}</td>
<td>${person.pincode}</td>

</tr>
</c:forEach>							

</table>

</body>
</html>