<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>create</title>
</head>
<body>
<h2>Enter customer info</h2>
<form action="saveLeads" method="post">
<a href="getLeads">Leads Info</a>
<pre>
First Name<input type="text" name ="firstName"/>
Last Name<input type="text" name ="lastName"/>
Company<input type="text" name ="company"/>
Email<input type="text" name ="email"/>
Mobile<input type="text" name ="mobile"/>
<label for="leadssource">Choose leads source:</label>

<select name="leadSource" id="leads">
  <option value="Paper Ads">Paper Ads</option>
  <option value="TV Ads">TV Ads</option>
  <option value="Online">"Online"</option>
  <option value="Radio">Radio</option>
</select>
<input type="submit" value="save lead"/>
</pre>
</form>
${msg}

</body>
</html>