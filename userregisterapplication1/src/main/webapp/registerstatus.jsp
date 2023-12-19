<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User registration form</title>
</head>
<body bgcolor="aqua">
User Registration is  success.....<br><br>
<c:if test="${result==1}">

<a href="home.html">Click here to goto the home page</a>
</c:if>
<c:if test="${result==0}">
User Registration is  fail......
<jsp:include page="user-register-form.html"></jsp:include>
</c:if>
</body>
</html>