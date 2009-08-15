<%@page import="cn.openlab.game.entity.Member"%>
<%
	Member member = (Member)session.getAttribute("CurrentMember");
	if(member == null) {
		request.getRequestDispatcher("login.jsp").forward(request,response);
		return;
	}
%>