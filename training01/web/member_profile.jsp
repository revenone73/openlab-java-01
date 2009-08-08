
<%@page import="cn.openlab.game.entity.Member"%>
<html>
	<head>
		<title>Home page</title>
	</head>
<body>
<%
	Member member = (Member)session.getAttribute("CurrentMember");
%>
<form action="profile" method="post">
	User Name:<input name="userName" value="<%=member.getUserName() %>"/><br/>
	Password:<input name="password" value="<%=member.getPassword() %>"/><br/>
	E-mail:<input name="email" value="<%=member.getEmail() %>"/><br/>
	<input type="submit" value="Save"/>
</form>
</body>
</html>