<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>information</h2>
name:${lead.firstName}<br/>
name:${lead.lastName}<br/>
company:${lead.company}<br/>
email:${lead.email}<br/>
mobile:${lead.mobile}<br/>
source:${lead.leadSource}<br/>
<form action="sendEmail" method="post">
    <input type="hidden" name="email" value="${lead.email}"/>
    <input type="submit" value="send email"/>


</form>

   <form action="contacts" method="post">
   <input type="hidden" name="firstName" value="${lead.firstName}"/>
   <input type="hidden" name="lastName" value="${lead.lastName}"/>
   <input type="hidden" name="company" value="${lead.company}"/>
   <input type="hidden" name="email" value="${lead.email}"/>
   <input type="hidden" name="mobile" value="${lead.mobile}"/>
   <input type="hidden" name="leadSource" value="${lead.leadSource}"/>
   
     <input type="submit" value="convert to sales"/>
   </form>

</body>
</html>