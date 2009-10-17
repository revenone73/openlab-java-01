<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
	<head>
		<title>Select an image</title>
	</head>
<body>
	<form action="imageUpload!upload.do" method="post" enctype="multipart/form-data">
		Image:<input type="file" name="imgFile"><br/>
		Image Name:<input type="text" name="userDefName"><br/>
		<input type="submit" value="Upload"> 
	</form>
</body>
</html>