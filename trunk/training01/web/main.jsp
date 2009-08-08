
<%@page import="cn.openlab.game.entity.Member"%>
<html>
	<head>
		<title>Home page</title>
	</head>
<body>
<%
	Member member = (Member)request.getAttribute("Member");
%>
	Welcome, <%=member.getUserName() %>!
<a href="profile">Edit my profile!</a>
</body>
</html>