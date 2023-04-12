<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Show | Lead</title>
</head>
<body>
	<h2 align="center">Show | Lead</h2><hr>
	<table border="1" align="center">
		<tr>
			<th>ID</th>
			<th>NAME</th>
			<th>EMAIL</th>
			<th>MOBILE</th>
			<th>UPDATE</th>
			<th>DELETE</th>
		</tr>
		<c:forEach var="all" items="${all}">
			<tr>
				<td>${all.id}</td>
				<td>${all.name}</td>
				<td>${all.email}</td>
				<td>${all.mobile}</td>
				<td><a href="delete?id=${all.id}">delete</a></td>
				<td><a href="update?id=${all.id}">update</a></td>
			</tr>
		</c:forEach>
	</table>
	${delete}
	${update}
</body>
</html>