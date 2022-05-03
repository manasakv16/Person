<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Create Person</title>

</head>
<body>
<h2>Person details</h2>
<form action="savedPerson" method="post">
<pre>
	Number: <input type="text" name="number" placeholder="enter mobile number"> 
	Name: <input type="text" name="name" placeholder="enter your name">
	Gender: <input type="text" name="gender" placeholder="enter your gender">
	Age: <Input type="number" name="age" placeholder="enter your age">
	
	Address:
		Street: <input type="text" name="street"  placeholder="enter your street">
		City:	<input type="text" name="city"  placeholder="enter your city">
		Pin Code: <input type="number" name="pincode"  placeholder="enter your pincode">
		<br>
	<input type="submit" value="save" />
</pre>
</form>
<br>
${msg}
<br>
<a href="displayPerson">View All</a>
</body>
</html>