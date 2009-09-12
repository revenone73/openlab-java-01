package cn.openlab.game.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import cn.openlab.game.entity.MemberResource;

public class MemberResourceDaoImpl implements MemberResourceDao {

	@Override
	public MemberResource getMemberResourceByMemberId(Integer id) {
		String hql = "from MemberResource m where m.member.id=?";
		Session session = DaoUtils.createSession();
		Query query = session.createQuery(hql);
		query.setInteger(0, id);
		List<MemberResource> list = query.list();
		if(list != null && list.size() > 0) {
			return list.get(0);
		}
		return null;
	}

	@Override
	public void save(MemberResource resource) {
		Session session = DaoUtils.createSession();
		Transaction trans =  session.beginTransaction();
		session.save(resource);
		trans.commit();
	}

	@Override
	public void update(MemberResource resource) {
		Session session = DaoUtils.createSession();
		Transaction trans = session.beginTransaction();
		Integer id = resource.getId();
		if(id != null) {
			MemberResource temp = (MemberResource)session.load(MemberResource.class, id);
			temp.setFood(resource.getFood());
			temp.setGold(resource.getGold());
			temp.setLand(resource.getLand());
			temp.setPeople(resource.getPeople());
			temp.setStone(resource.getStone());
			temp.setWood(resource.getWood());
			temp.setMember(resource.getMember());
		}
		trans.commit();
	}

	public static void main(String[] args) {
		MemberResourceDao dao = new MemberResourceDaoImpl();
		MemberResource m = dao.getMemberResourceByMemberId(1);
		System.out.println(m);
		System.out.println(m.getMember().getUserName());
	}

}
