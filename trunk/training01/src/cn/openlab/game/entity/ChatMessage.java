package cn.openlab.game.entity;

import java.util.Date;

public class ChatMessage {

	private Integer id;
	private String body;
	private Member from;
	private Date sendTime;

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getBody() {
		return body;
	}
	public void setBody(String body) {
		this.body = body;
	}
	public Member getFrom() {
		return from;
	}
	public void setFrom(Member from) {
		this.from = from;
	}
	public Date getSendTime() {
		return sendTime;
	}
	public void setSendTime(Date sendTime) {
		this.sendTime = sendTime;
	}
}
