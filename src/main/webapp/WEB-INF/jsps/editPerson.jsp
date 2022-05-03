<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <%@page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Create Person</title>

</head>
<body>
<h2>Person details</h2>
<form action="updPerson" method="post">
<pre>
	Number: <input type="text" name="number" value="${person.number}" Readonly > 
	Name: <input type="text" name="name"  value="${person.name}">
	Gender: <input type="text" name="gender" value="${person.gender}" >
	Age: <Input type="number" name="age" value="${person.age}">
	
	Address:
		Street: <input type="text" name="street" value="${person.street}" >
		City:	<input type="text" name="city" value="${person.city}" >
		Pin Code: <input type="number" name="pincode" value="${person.pincode}" >
		<br>
	<input type="submit" value="save" />
</pre>
</form>
</body>
</html>