package cn.openlab.game.dao;

import java.util.List;

import cn.openlab.game.entity.ChatMessage;

public interface ChatMessageDao {

	void saveMessage(ChatMessage message);
	
	List<ChatMessage> getAllMessages();
}
