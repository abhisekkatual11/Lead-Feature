<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Create | Lead</title>
</head>
<body>
	<form action="create" method="post">
	<h2 align="center"><a href="show">show all records</a></h2>
				<pre>
					<h2 align="center">Create | Lead</h2><hr>
										Name:~  <input type="text" name="name"/><br>
										Email:~ <input type="email" name="email"/><br>
										Mobile:~<input type="tel" name="mobile"/><br>
											  <input type="submit" value="create"/>
											  <hr>
				</pre>
	</form>
	${create}
</body>
</html>