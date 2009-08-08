
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
</body>
</html>