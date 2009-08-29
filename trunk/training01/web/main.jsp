<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=gb2312">
<title>welcome</title>
</head>

<body>
<table width="100%" border="0" cellspacing="0" cellpadding="0">
  <tr> 
    <td colspan="7">Game title and logo <a href="login!logout.do">[Logout]</a></td>
  </tr>
  <tr> 
    <td>food:<s:property value="#session['Resource'].food"/></td>
    <td>wood:<s:property value="#session['Resource'].wood"/></td>
    <td>stone:<s:property value="#session['Resource'].stone"/></td>
    <td>gold:<s:property value="#session['Resource'].gold"/></td>
    <td>land:<s:property value="#session['Resource'].dynLand"/></td>
    <td>people:<s:property value="#session['Resource'].people"/></td>
    <td>datetime</td>
  </tr>
  <tr> 
    <td colspan="6">map</td>
    <td>message</td>
  </tr>
  <tr> 
    <td colspan="3">direction</td>
    <td>icon</td>
    <td><s:property value="#session['Member'].userName"/></td>
    <td>&nbsp;</td>
    <td>&nbsp;</td>
  </tr>
<a href="chat.do">Chat</a>
</table>
</body>
</html>
