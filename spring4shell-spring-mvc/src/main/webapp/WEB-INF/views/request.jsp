<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<body>
	<h2>${helloWorld.message}</h2>
	<h4>You hit the ${helloWorld.isVulnerable() ? "vulnerable" : ""}<b>${helloWorld.endpoint}</b> endpoint using <b>${request.getMethod()}</b></h4>
	<h4>Server date time is : ${helloWorld.dateTime}</h4>
</body>
</html>