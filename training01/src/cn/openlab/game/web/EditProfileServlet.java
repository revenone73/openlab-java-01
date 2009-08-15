package cn.openlab.game.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cn.openlab.game.dao.MemberDao;
import cn.openlab.game.dao.MemberDaoImpl;
import cn.openlab.game.entity.Member;

public class EditProfileServlet extends HttpServlet {

	private MemberDao memberDao = new MemberDaoImpl();
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		String name = req.getParameter("userName");
		if(name == null) {
			req.getRequestDispatcher("member_profile.jsp").forward(req, resp);
		} else {
			Member member = new Member();
			member.setEmail(req.getParameter(""));
			member.setPassword(req.getParameter(""));
			member.setUserName(name);
			memberDao.updateMember(member);
			req.getRequestDispatcher("main.jsp").forward(req, resp);
		}
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		doGet(req, resp);
	}
}
