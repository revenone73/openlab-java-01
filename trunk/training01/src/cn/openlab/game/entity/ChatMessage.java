package cn.openlab.game.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="chat_messages")
public class ChatMessage {

	private Integer id;
	private String body;
	private Member from;
	private Date sendTime;

	@Id
	@GeneratedValue
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}

	@Column
	public String getBody() {
		return body;
	}
	public void setBody(String body) {
		this.body = body;
	}
	
	@ManyToOne
	public Member getFrom() {
		return from;
	}
	public void setFrom(Member from) {
		this.from = from;
	}
	
	@Column
	public Date getSendTime() {
		return sendTime;
	}
	public void setSendTime(Date sendTime) {
		this.sendTime = sendTime;
	}
}
