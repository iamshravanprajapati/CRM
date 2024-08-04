<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>compose</title>
</head>
<body>
  <form action="send" method="post">
  To<input type="text" name="toEmail" value="${email}"/><br/>
  Sub<input type="text" name="subject"/><br/>
  <textarea name="emailBody" rows="8" cols="50">
  </textarea><br/>
  
  <input type="submit" value="Submit">
  
  
  
  </form>

</body>
</html>