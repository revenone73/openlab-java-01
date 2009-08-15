<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
	<head>
		<title>Home page</title>
	</head>
<body>
	Welcome, <s:property value="member.userName"/>!
<a href="profile">Edit my profile!</a>
</body>
</html>