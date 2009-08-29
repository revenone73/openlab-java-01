<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=gb2312">
<title>chat</title>
</head>

<body>
<s:iterator value="messages">
	From:<s:property value="from.userName"/>,
	Message:<s:property value="body"/>,
	Send Time:<s:date name="sendTime" format="HH:mm:ss"/>
<hr/>
</s:iterator>
</body>
</html>
