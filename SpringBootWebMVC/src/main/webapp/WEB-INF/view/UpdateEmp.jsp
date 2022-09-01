<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>

<body>
	<h1>Update Form</h1>
	<form action="saveData">
		Id : <input type="text" name="id" value="${updateEmp.id }" readonly="readonly"> <br>
		<br> Name : <input type="text" name="name" value="${updateEmp.name }"> <br>
		<br> Last : <input type="text" name="last" value="${updateEmp.last }"> <br>
		<br> Email: <input type="text" name="email" value="${updateEmp.email }"> <br>
		<br> <input type="submit" value="Submit">
	</form>

</body>
</html>