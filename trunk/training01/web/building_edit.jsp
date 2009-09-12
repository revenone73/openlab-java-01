<%@ page contentType="text/html;charset=UTF-8" %>
<%@ page pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
	<head>
		<title>Home page</title>
	</head>
<body>

<form action="building!save.do" method="post">
	Name: <s:textfield name="building.name"/> <br/>
	Picture:<s:textfield name="building.picture"/><br/>
	Level:<s:textfield name="building.level"/><br/>
	<input type="submit" value="Save"/>
</form>
</body>
</html>