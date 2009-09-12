package cn.openlab.game.web;

import org.apache.struts2.dispatcher.SessionMap;

import com.opensymphony.xwork2.ActionContext;

public class MainAction {

	public String execute() {
		SessionMap<String, Object> o = 
			(SessionMap<String, Object>)ActionContext.getContext()
			.get(ActionContext.SESSION);
		if(o != null && o.get("Member") != null) {
			return "success";
		}
		return "login";
	}
}
