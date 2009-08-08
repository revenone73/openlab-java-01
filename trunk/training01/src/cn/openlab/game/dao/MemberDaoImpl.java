package cn.openlab.game.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import cn.openlab.game.entity.Member;

public class MemberDaoImpl implements MemberDao {

	@Override
	public Member getMemberByUserName(String userName) {
		Session session = DaoUtils.createSession();
		Query query = session.createQuery
			("from Member m where m.userName=?");
		query.setString(0, userName);
		List<Member> members = query.list();
		if(members != null && members.size() > 0) {
			return members.get(0);
		}
		return null;
	}

}
