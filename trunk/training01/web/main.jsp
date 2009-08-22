<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
	<head>
		<title>Home page</title>
	</head>
<body>
	Welcome, <s:property value="member.userName"/>!
<a href="profile.do?member.userName=<s:property value="member.userName"/>">Edit my profile!</a>
</body>
</html>