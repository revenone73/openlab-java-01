<%@ page contentType="text/html;charset=UTF-8" %>
<%@ page pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
	<head>
		<title>All buildings</title>
	</head>
<body>
	<table border="1">
		<thead>
			<tr>
				<td>ID</td><td>Picture</td><td>Level</td>
			</tr>
		</thead>
		<s:iterator value="buildings">
			<tr>
				<td><s:property value="id"/></td>
				<td align="center"><img src="game_imgs/<s:property value="picture"/>"/>
					<br/><s:property value="name"/>
				</td>
				<td><s:property value="level"/></td>
			</tr>
		</s:iterator>
	</table>
</body>
</html>