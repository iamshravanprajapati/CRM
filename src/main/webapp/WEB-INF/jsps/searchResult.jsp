<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@include file="menu.jsp" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>save results</title>
</head>
<body>
<h2>Results</h2>
 <table border="1"> 
 <tr>
  <th>firstName</th>
  <th>lastName</th>
  <th>company</th>
  <th>email</th>
  <th>mobile</th>
  <th>leadSource</th>
  </tr>
  <c:forEach items="${leads}" var="lead">
  <tr>
  <td><a href="getLeadInfo?id=${lead.id}">${lead.firstName}</a></td>
  <td>${lead.lastName}</td>
  <td>${lead.company}</td>
  <td>${lead.email}</td>
  <td>${lead.mobile}</td>
  <td>${lead.leadSource}</td>
  </tr>
  </c:forEach>
   </table>
</body>
</html>
