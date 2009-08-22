package cn.openlab.game.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

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

	@Override
	public void updateMember(Member member) {
		Session session = DaoUtils.createSession();
		Transaction trans = session.beginTransaction();
		Query query = session.createQuery
			("from Member m where m.userName=?");
		query.setString(0, member.getUserName());
		List<Member> members = query.list();
		if(members != null && members.size() > 0) {
			Member temp = members.get(0);
			if(temp != null) {
				temp.setEmail(member.getEmail());
				temp.setPassword(member.getPassword());
			}
		}
		trans.commit();
	}

	@Override
	public void saveMember(Member member) {
		Session session = DaoUtils.createSession();
		Transaction trans = session.beginTransaction();
		try {
			Integer id = (Integer) session.save(member);
			System.out.println(id);
		} catch(Exception e) {
			e.printStackTrace();
		}
		trans.commit();
	}

}
