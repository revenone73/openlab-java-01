package cn.openlab.game.web;

import org.apache.struts2.dispatcher.SessionMap;

import com.opensymphony.xwork2.ActionContext;

import cn.openlab.game.dao.MemberDao;
import cn.openlab.game.dao.MemberDaoImpl;
import cn.openlab.game.dao.MemberResourceDao;
import cn.openlab.game.dao.MemberResourceDaoImpl;
import cn.openlab.game.entity.Member;
import cn.openlab.game.entity.MemberResource;

public class LoginAction {

	private MemberDao memberDao = new MemberDaoImpl();
	private Member member;
	private MemberResourceDao memberResourceDao = new MemberResourceDaoImpl();
	
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
			SessionMap<String, Object> o = 
				(SessionMap<String, Object>)ActionContext.getContext()
				.get(ActionContext.SESSION);
			MemberResource resource = memberResourceDao.getMemberResourceByMemberId(temp.getId());
			o.put("Member", temp);
			o.put("Resource", resource);
			return "success";
		}
		return "fail";
	}

	public String logout() {
		SessionMap<String, Object> o = 
			(SessionMap<String, Object>)ActionContext.getContext()
			.get(ActionContext.SESSION);
		o.invalidate();
		return "login";
	}
}
