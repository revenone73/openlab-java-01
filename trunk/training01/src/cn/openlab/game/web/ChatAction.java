package cn.openlab.game.web;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.struts2.dispatcher.SessionMap;

import com.opensymphony.xwork2.ActionContext;

import cn.openlab.game.entity.ChatMessage;
import cn.openlab.game.entity.Member;

public class ChatAction {

	private static List<ChatMessage> messages = new ArrayList<ChatMessage>();

	public List<ChatMessage> getMessages() {
		return messages;
	}

	private ChatMessage message;

	public ChatMessage getMessage() {
		return message;
	}

	public void setMessage(ChatMessage message) {
		this.message = message;
	}

	public String execute() {
		return "success";
	}

	public String chat() {
		if(message != null) {
			message.setSendTime(new Date());
			SessionMap<String, Object> o = 
				(SessionMap<String, Object>)ActionContext.getContext()
				.get(ActionContext.SESSION);
			if(o != null) {
				Member member = (Member)o.get("Member");
				message.setFrom(member);
			}
		}
		messages.add(message);
		return "success";
	}
	
	public String list() {
		return "list";
	}
}
