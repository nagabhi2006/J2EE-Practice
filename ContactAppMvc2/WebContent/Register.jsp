<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Registration form</h1>
<form action="RegInt.jsp" method="post">
Enter the name:<input type="text" name="name"/><br>
Enter the Email:<input type="text" name="email"/><br>
Enter the password:<input type="password" name="pword"/><br>
Re-Enter the password:<input type="password" name="rpword"/><br>
<input type="submit"/>
</form>
<%
String msg=(String)request.getAttribute("error msg");
if(msg!=null)
{
	out.println(msg);
}
%>
</body>
</html>  