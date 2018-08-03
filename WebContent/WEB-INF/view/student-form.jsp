<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Student Form</title>
</head>
<body>
	<form action="processStudentForm" modelAttribute="student">
		First Name : <input name="firstName" />
		<form:errors name="firstName" cssClass="error"/>
		<br>
		<br>
		Last  Name : <input name="lastName" />
					<form:errors name="lastName" cssClass="error"/>
		<br>
		<br>
		<input type="submit" value="Submit" />


	</form>
</body>
</html>