package cn.openlab.test;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;

public class UserDAOHibernateImpl implements UserDAO {

	private final static SessionFactory factory;
	static {
		Configuration cfg = new AnnotationConfiguration().configure();
		factory = cfg.buildSessionFactory();
	}

	@Override
	public void add(User u) throws InvalidUserException,
			UserDuplicationException {
		Session session = factory.openSession();
		Transaction trans = session.beginTransaction();
		session.save(u);
		trans.commit();
	}

	@Override
	public void deleteById(int id) {
		Session session = factory.openSession();
		Transaction trans = session.beginTransaction();
		User u = (User) session.load(User.class, id);
		session.delete(u);
		trans.commit();
	}

	@Override
	public List<User> findAll() {
		Session session = factory.openSession();
		Query query = session.createQuery("from User u");
		return query.list();
	}

	@Override
	public List<User> findByCondition(User cond) {
		
		StringBuffer sb = new StringBuffer("from User u where 1=1");
		if(cond != null) {
			if(cond.getAge() != null) {
				sb.append(" and u.age = ?");
			}
			if(cond.getName() != null) {
				sb.append(" and u.name=?");
			}
			if(cond.getPassword() != null) {
				sb.append(" and u.password=?");
			}
		}
		Session session = factory.openSession();
		
		Query query = session.createQuery(sb.toString());
		if(cond != null) {
			int i = 0;
			if(cond.getAge() != null) {
				query.setInteger(i, cond.getAge());
				i++;
			}
			if(cond.getName() != null) {
				query.setString(i, cond.getName());
				i++;
			}
			if(cond.getPassword() != null) {
				query.setString(i, cond.getPassword());
			}
		}
		return query.list();
	}

	@Override
	public User findById(int id) {
		Session session = factory.openSession();
		return (User) session.load(User.class, id);
	}

	@Override
	public List<User> findUsersByName(String name) {
		Session session = factory.openSession();
		
		Query query = session.createQuery("select u from User u where u.name = ?");
		query.setString(0, name);
		
		return query.list();
	}

	@Override
	public void updateUserById(User u) {
		Session session = factory.openSession();
		Transaction trans = session.beginTransaction();
		User temp = (User) session.load(User.class, u.getId());
		temp.setAge(u.getAge());
		temp.setName(u.getName());
		temp.setPassword(u.getPassword());
		trans.commit();
	}

	public static void main(String[] args) {
		UserDAO userDao = new UserDAOHibernateImpl();
		List<User> list = userDao.findUsersByName("jacky");
		for(User u : list) {
			System.out.println(u);
		}
	}
}
