<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add Book</title>
</head>
<body>

<h3>Add Book</h3>
<form:form action="addbook.jsp" method="GET" modelAttribute="book">
	ISBN : <form:input path="ID"/><br/>
	ISBN : <form:input path="ISBN"/><br/>
	Author : <form:input path="author"/><br/>
	Genre: <form:input path="genre"/><br/>
	Title : <form:input path="Title"/> <br/>
	<input type="submit" value="Add Book"/><br/>
	<a href="index.jsp"> Go back to home page </a>
</form:form>

</body>
</html>