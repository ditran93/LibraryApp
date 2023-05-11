<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Books List</title>
</head>
<body>
	<h1> Books List</h1>
	Id       |     ISBN		|		Author      |     GENRE		|     TITLE		| <br/>
	----------------------------------------------------<br/>
	
	<c:forEach var="student" items="${studentsList}">
		${book.id}	|	${book.ISBN}	|	${book.Author}	|   ${book.Genre}   |	 ${book.Title}	|
		</br>
	</c:forEach>
	
<br/>
Above should display the list of books in the system...

<form action="newspringstudent.jsp" method="get">
	<input type="submit" value="Add a new book">
</form>

</body>
</html>