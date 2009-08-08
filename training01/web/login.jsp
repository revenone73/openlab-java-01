<html>
	<head>
		<title>Login</title>
	</head>
<body>
<%
	String msg = (String)request.getAttribute("FailedMsg");
	String userName = (String) request.getAttribute("UserName");
	if(msg != null) {
%>
	<font color='red'><%=msg %></font>
<%
	}
%>
	<form action="login" method="post">
		User Name:
		<input name="userName" value="<%=userName==null?"":userName %>"/><br/>
		Password:
		<input type="password" name="password"/><br/>
		<input type="submit" value="Login"/>
	</form>

</body>
</html>