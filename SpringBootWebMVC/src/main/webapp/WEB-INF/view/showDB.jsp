<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>

<body>
	<h1>All Employee Data</h1>

	<table>
		<tr>
			<th>Id</th>
			<th>Name</th>
			<th>Last</th>
			<th>Last</th>
		</tr>
		<c:forEach var="temp" items="${EmpData}">
			<tr>
				<td>${temp.id }</td>
				<td>${temp.name }</td>
				<td>${temp.last }</td>
				<td>${temp.email }</td>
				<td><a href="deleteData?id=${temp.id}">Delete</a></td>
				<td><a href="updateData?id=${temp.id}">Update</a></td>
			</tr>
		</c:forEach>

	</table>


</body>
</html>