package cn.openlab.game.dao;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import cn.openlab.game.entity.Member;

public class MemberDaoImpl extends HibernateDaoSupport implements MemberDao {

	@Override
	public Member getMemberByUserName(String userName) {
		List<Member> members = 
			getHibernateTemplate().
			find("from Member m where m.userName=?",userName);
		if(members != null && members.size() > 0) {
			return members.get(0);
		}
		return null;
	}

	@Override
	public void updateMember(Member member) {
		Member temp = getMemberByUserName(member.getUserName());
		if(temp != null) {
			temp.setEmail(member.getEmail());
			temp.setPassword(member.getPassword());
		}
//		Session session = MySessionFactory.createSession();
//		Transaction trans = session.beginTransaction();
//		Query query = session.createQuery
//			("from Member m where m.userName=?");
//		query.setString(0, member.getUserName());
//		List<Member> members = query.list();
//		if(members != null && members.size() > 0) {
//			Member temp = members.get(0);
//			if(temp != null) {
//				temp.setEmail(member.getEmail());
//				temp.setPassword(member.getPassword());
//			}
//		}
//		trans.commit();
	}

	@Override
	public void saveMember(Member member) {
		getHibernateTemplate().save(member);
//		Session session = MySessionFactory.createSession();
//		Transaction trans = session.beginTransaction();
//		try {
//			Integer id = (Integer) session.save(member);
//			System.out.println(id);
//		} catch(Exception e) {
//			e.printStackTrace();
//		}
//		trans.commit();
	}

}
