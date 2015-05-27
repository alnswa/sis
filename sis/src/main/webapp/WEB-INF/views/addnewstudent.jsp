<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="addstudent" method="post">
		<fieldset>
			<legend>Add New Student</legend>
			<p>
				<label>StudentId</label> <input type="text" name="studentId"
					id="studentid">
			</p>
			<p>
				<label>Fullname</label> <input type="text" name="fullName"
					id="fname">
			</p>
			<p>
				<label>Email</label> <input type="text" name="email" id="email">
			</p>
			<p>
				<label>Batch</label> <input type="text" name="batch" id="batch">
			</p>
			<p>
				<label>Qualification</label> <input type="text" name="qualification"
					id="qualification">
			</p>
			<p>
				<label>College</label> <input type="text" name="college"
					id="college">
			</p>
			<p>
				<label>Percentage</label> <input type="text" name="percentage"
					id="percentage">
			</p>
			<p>
				<label>Branch</label> <input type="text" name="branch" id="branch">
			</p>
			<p>
				<label>City</label> <input type="text" name="city" id="city">
			</p>
			<p>
				<label>State</label> <input type="text" name="state" id="state">
			</p>
			<p>
				<input type="submit" value="Add New Student">
				<input type="reset" value="Clear">
			</p>
		</fieldset>


	</form>
</body>
</html>