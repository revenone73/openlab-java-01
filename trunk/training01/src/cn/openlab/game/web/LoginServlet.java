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
		if(member == null) {
			req.setAttribute("FailedMsg", "member doesn't exist");
			req.getRequestDispatcher("login.jsp").forward(req, resp);
		} else if(!member.getPassword().equals(password)) {
			req.setAttribute("FailedMsg", "password not match");
			req.getRequestDispatcher("login.jsp").forward(req, resp);
		} else {
			req.setAttribute("Member", member);
			req.getRequestDispatcher("main.jsp").forward(req, resp);
		}
	}
}
