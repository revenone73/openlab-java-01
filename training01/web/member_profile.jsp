
<%@page import="cn.openlab.game.entity.Member"%>
<%@include file="/force_login.jsp" %>
<html>
	<head>
		<title>Home page</title>
	</head>
<body>

<form action="profile" method="post">
	User Name:<input name="userName" value="<%=member.getUserName() %>"/><br/>
	Password:<input name="password" value="<%=member.getPassword() %>"/><br/>
	E-mail:<input name="email" value="<%=member.getEmail() %>"/><br/>
	<input type="submit" value="Save"/>
</form>
</body>
</html>