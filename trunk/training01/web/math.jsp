<%@ taglib prefix="sx" 
	uri="/struts-dojo-tags" %>
<html>
	<head>
		<sx:head/>
	</head>
	<body>
		<form action="math.do">
			Number 1:<input name="op1"><br/>
			Number 2:<input name="op2"><br/>
			<sx:datetimepicker name="dateOfBirth"/><br/>
			<input type="submit">
		</form>
	</body>

</html>