<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>

<html>
<head>

<title>Insert title here</title>
</head>
<body bgcolor="pink">
   <c:if test="${result==1}">
   <h1>Data deleted successfully...<%=request.getParameter("mobile") %></h1>
   <a href="home.html">click here to goto home page</a>
   </c:if>
   <c:if test="${result==0}">
   <h1>Data  not available with the given mobile...<%=request.getParameter("mobile") %></h1>
   <jsp:include page="Deleteuser.html"/>
   </c:if>
   
</body>
</html>