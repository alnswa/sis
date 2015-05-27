<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<table border="2">
		<tr>
			<th>StudentId</th>
			<th>Fullname</th>
			<th>Email</th>
			<th>College</th>
			<th>City</th>
			<th>State</th>
		</tr>
		<c:forEach items="${studentList}" var="student">
			<tr>
				<td>${student.studentId}</td>
				<td>${student.fullName}</td>
				<td>${student.email}</td>
				<td>${student.college}</td>
				<td>${student.city}</td>
				<td>${student.state}</td>
			</tr>
		</c:forEach>
	</table>
	<br>
	<a href="homepage">Home</a>
</body>
</html>