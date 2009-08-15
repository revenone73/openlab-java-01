<%@page import="cn.openlab.game.entity.Member"%>
<%@include file="/force_login.jsp" %>

<html>
	<head>
		<title>Home page</title>
	</head>
<body>
	Welcome, <%=member.getUserName() %>!
<a href="profile">Edit my profile!</a>
</body>
</html>