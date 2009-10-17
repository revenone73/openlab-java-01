<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
	<head>
		<title>Select an image</title>
	</head>
<body>
	<table>
		<tr>
			<td>description</td>
			<td>image</td>
		</tr>
<s:iterator value="maps">
		<tr>
			<td><s:property value="description"/></td>
			<td><a href="homeMapDetail.do?homeMap.id=<s:property value="id"/>"><img src="user_imgs/<s:property value="id"/>" width="300" height="200"/></a></td>
		</tr>
</s:iterator>
	</table>
</body>
</html>