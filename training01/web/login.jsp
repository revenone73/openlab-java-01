<html>
	<head>
		<title>Login</title>
	</head>
<body>
<%
	String msg = (String)request.getAttribute("FailedMsg");
	if(msg != null) {
%>
	<font color='red'><%=msg %></font>
<%
	}
%>
	<form action="login" method="post">
		User Name:
		<input name="userName"/><br/>
		Password:
		<input type="password" name="password"/><br/>
		<input type="submit" value="Login"/>
	</form>

</body>
</html>