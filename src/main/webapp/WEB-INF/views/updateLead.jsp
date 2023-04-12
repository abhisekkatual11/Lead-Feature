<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Create | Lead</title>
</head>
<body>
	<form action="updateLead" method="post">
	<h2 align="center"><a href="show">show all records</a></h2>
				<pre>
					<h2 align="center">Update | Lead</h2><hr>
												<input type="hidden" name="id" value="${id2.id}"/><br>
										Name:~  <input type="text" name="name" value="${id2.name}"/><br>
										Email:~ <input type="email" name="email" value="${id2.email}"/><br>
										Mobile:~<input type="tel" name="mobile" value="${id2.mobile}"/><br>
											  <input type="submit" value="update"/>
											  <hr>
				</pre>
	</form>
</body>
</html>