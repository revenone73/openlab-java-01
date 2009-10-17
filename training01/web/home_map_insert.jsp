<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
	<head>
		<title>Select an image</title>
	</head>
<body>
	<form action="homeMap.do" method="post" enctype="multipart/form-data">
		Description:<input name="description"/><br/>
		File:<input type="file" name="imageFile"/><br/>
		<input type="submit" value="upload"/>
	</form>
</body>
</html>