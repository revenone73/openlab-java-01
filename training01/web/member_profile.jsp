<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ taglib prefix="sx" uri="/struts-dojo-tags" %>
<html>
	<head>
<sx:head/>
		<title>Home page</title>
	</head>
<body>

<form action="profile!register.do" method="post">
	User Name: <s:textfield name="member.userName"/> <br/>
	Password:<s:password name="member.password" showPassword="true"/><br/>
	E-mail:<s:textfield name="member.email"/><br/>
	<sx:datetimepicker name="birth"></sx:datetimepicker>
	<input type="submit" value="Save"/>
</form>
</body>
</html>