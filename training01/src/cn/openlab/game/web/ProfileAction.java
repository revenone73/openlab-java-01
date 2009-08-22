package cn.openlab.game.web;

import cn.openlab.game.dao.MemberDao;
import cn.openlab.game.dao.MemberDaoImpl;
import cn.openlab.game.entity.Member;

public class ProfileAction {

	private Member member;
	private MemberDao memberDao = new MemberDaoImpl();

	public Member getMember() {
		return member;
	}

	public void setMember(Member member) {
		this.member = member;
	}

	public String execute() {
		String userName = member.getUserName();
		member = memberDao.getMemberByUserName(userName);
		return "success";
	}
	
	public String register() {
		memberDao.saveMember(member);
		return "success";
	}
}
