package cn.openlab.game.web;

import cn.openlab.game.dao.MemberDao;
import cn.openlab.game.dao.MemberDaoImpl;
import cn.openlab.game.entity.Member;

public class LoginAction {

	private MemberDao memberDao = new MemberDaoImpl();
	private Member member;
	
	public void setMember(Member member) {
		System.out.println("set member");
		this.member = member;
	}

	public Member getMember() {
		System.out.println("get member");
		return member;
	}

	public String execute(){
		String userName = member.getUserName();
		Member temp = memberDao.getMemberByUserName(userName);
		if(temp != null && temp.getPassword().equals(member.getPassword())) {
			
			return "success";
		}
		return "fail";
	}
}
