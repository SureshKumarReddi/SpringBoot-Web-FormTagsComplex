<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>	
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Success Page data goes here</title>
</head>
<body>
	Data saved to db
	<a href="/loadform">goback</a><br>

	 ${student.name} <br>
	 ${student.email} <br>
	 ${student.phno}<br>
	 ${student.gender} <br>
	 ${student.course}<br>
		<ul>
			<c:forEach var="time" items="${student.timings}">
				<li>${time}</li>
			</c:forEach>
		</ul>
	

</body>
</html>