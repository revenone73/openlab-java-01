package cn.openlab.game.web;

import java.util.Date;
import java.util.List;

import org.apache.struts2.dispatcher.SessionMap;

import cn.openlab.game.dao.ChatMessageDao;
import cn.openlab.game.entity.ChatMessage;
import cn.openlab.game.entity.Member;

import com.opensymphony.xwork2.ActionContext;

public class ChatAction {
	
	private ChatMessageDao chatMessageDao;

	public void setChatMessageDao(ChatMessageDao chatMessageDao) {
		this.chatMessageDao = chatMessageDao;
	}

	public List<ChatMessage> getMessages() {
		return chatMessageDao.getAllMessages();
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
		chatMessageDao.saveMessage(message);
		return "success";
	}
	
	public String list() {
		return "list";
	}
}
