<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Hello world process Form</title>
</head>
<body>
<%-- To get parameter value from other for use ${param.studentName} --%>
Hi, ${param.studentName} <br>
Hi ${nameOfStudent}, This is model data. <br>
Hi ${nameOfStudent}, this is example to load data using @RequestParam
</body>
</html>