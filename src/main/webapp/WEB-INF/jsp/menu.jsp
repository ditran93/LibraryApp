<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1> Welcome to the Library Application Main Menu </h1>

	<h2> ${menu} </h2>
	
<form action="bookslist.jsp" method="GET">
	<input type="submit" value="Get book list "/>
</form>

<form action="addbook.jsp" method="get">
	<input type="submit" value="Add a new book">
</form>

<a href="index.jsp"> Go back to home page </a>
</body>
</html>