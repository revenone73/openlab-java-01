package cn.openlab.game.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cn.openlab.game.dao.MemberDao;
import cn.openlab.game.dao.MemberDaoImpl;
import cn.openlab.game.entity.Member;

public class LoginServlet extends HttpServlet {

	private MemberDao memberDao = new MemberDaoImpl();

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		String name = req.getParameter("userName");
		String password = req.getParameter("password");
		Member member = memberDao.getMemberByUserName(name);
		ServletOutputStream out = resp.getOutputStream();
		String msg;
		if(member == null) {
			msg = "member doesn't exist";
		} else if(!member.getPassword().equals(password)) {
			msg = "password not match";
		} else {
			msg = "login succeed";
		}
		out.println(msg);
	}
}
