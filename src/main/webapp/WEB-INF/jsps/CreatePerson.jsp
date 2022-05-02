<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Create Person</title>
</head>
<body>
<form action=" " method="post">
<pre>
	Number: <input type="text" id="number" placeholder="enter mobile number">
	Name: <input type="text" id="name" placeholder="enter your name">
	Age: <Input type="number" id="age" placeholder="enter your age">
	Gender: <input type="text" id="gender" placeholder="enter your gender">
	Address:
		Street: <input type="text" id="street"  placeholder="enter your street">
		City:	<input type="text" id="city"  placeholder="enter your city">
		Pin Code: <input type="number" id="pincode"  placeholder="enter your pincode">
	<input type="submit" value="save" />
	<a href="displayPerson">View All</a>
</pre>
</form>
</body>
</html>