<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
	<head>
		<title>Select an image</title>
	</head>
<body>
<s:property value="homeMap.buildings"/>
<s:iterator value="homeMap.buildings">
<div style="position:absolute; left:<s:property value="x"/>px; top:<s:property value="y"/>px; width:<s:property value="w"/>px; height:<s:property value="h"/>px">
	<img src="user_buildings/<s:property value="id"/>" width="172" height="131">
</div>
</s:iterator>
<table>
	<tr>
		<td><img src="user_imgs/<s:property value="homeMap.id"/>"/></td>
		<td>
			<table>
				<tr>
					<td></td>
					<td></td>
					<td></td>
					<td></td>
					<td></td>
				</tr>
			</table>
			<table>
				<form action="homeMapDetail!insertBuilding.do" method="post" enctype="multipart/form-data">
					<s:hidden name="homeMap.id"/>
					Left:<input name="homeBuilding.x"/><br/>
					Top:<input name="homeBuilding.y"/><br/>
					Width:<input name="homeBuilding.w"/><br/>
					Height:<input name="homeBuilding.h"/><br/>
					Image:<input type="file" name="imageFile"/><br/>
					<input type="submit" value="Save"/>
				</form>
			</table>
		</td>
	</tr>
</table>
</body>
</html>