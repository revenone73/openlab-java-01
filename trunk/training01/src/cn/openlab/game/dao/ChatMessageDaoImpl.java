package cn.openlab.game.dao;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import cn.openlab.game.entity.ChatMessage;

public class ChatMessageDaoImpl extends HibernateDaoSupport implements
		ChatMessageDao {

	@Override
	public List<ChatMessage> getAllMessages() {
		return getHibernateTemplate().find("from ChatMessage m");
	}

	@Override
	public void saveMessage(ChatMessage message) {
		getHibernateTemplate().save(message);
	}

}
