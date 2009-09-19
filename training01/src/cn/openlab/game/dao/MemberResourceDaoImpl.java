package cn.openlab.game.dao;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import cn.openlab.game.entity.MemberResource;

public class MemberResourceDaoImpl extends HibernateDaoSupport implements MemberResourceDao {

	@Override
	public MemberResource getMemberResourceByMemberId(Integer id) {
		String hql = "from MemberResource m where m.member.id=?";
//		Session session = MySessionFactory.createSession();
//		Query query = session.createQuery(hql);
//		query.setInteger(0, id);
		List<MemberResource> list = getHibernateTemplate().find(hql, id);
		if(list != null && list.size() > 0) {
			return list.get(0);
		}
		return null;
	}

	@Override
	public void save(MemberResource resource) {
//		Session session = MySessionFactory.createSession();
//		Transaction trans =  session.beginTransaction();
//		session.save(resource);
//		trans.commit();
		getHibernateTemplate().save(resource);
	}

	@Override
	public void update(MemberResource resource) {
//		Session session = MySessionFactory.createSession();
//		Transaction trans = session.beginTransaction();
		Integer id = resource.getId();
		if(id != null) {
			MemberResource temp = (MemberResource)getHibernateTemplate().load(MemberResource.class, id);
			temp.setFood(resource.getFood());
			temp.setGold(resource.getGold());
			temp.setLand(resource.getLand());
			temp.setPeople(resource.getPeople());
			temp.setStone(resource.getStone());
			temp.setWood(resource.getWood());
			temp.setMember(resource.getMember());
		}
//		trans.commit();
	}

	public static void main(String[] args) {
		MemberResourceDao dao = new MemberResourceDaoImpl();
		MemberResource m = dao.getMemberResourceByMemberId(1);
		System.out.println(m);
		System.out.println(m.getMember().getUserName());
	}

}
