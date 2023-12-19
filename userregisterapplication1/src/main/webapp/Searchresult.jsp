<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
  <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Search result</title>
</head>
<body bgcolor="pink">
<c:if test="${not empty userinfo}">
<h1>Search Result is success</h1>
user name....:${userinfo.username}<br>
password....:${userinfo.password}<br>
email....:${userinfo.email}<br>
mobile....:${userinfo.mobile}<br>
<button onclick="window.location.href='home.html'">Home page</button>
</c:if>
<c:if test="${empty userinfo}">
<h1>Search result is not found..</h1>
<jsp:include page="Searchservlet.html"></jsp:include>
</c:if>


</body>
</html>