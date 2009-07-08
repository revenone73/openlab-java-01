package cn.openlab.spring.dao;

import org.springframework.dao.DataAccessException;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import cn.openlab.hibernate.domain.Gender;

public class GenderDaoImpl extends HibernateDaoSupport implements GenderDao {

	@Override
	public Gender getGenderById(Integer id) throws DataAccessException {
		return (Gender) getHibernateTemplate().get(Gender.class, id);
	}

	@Override
	public void saveGender(Gender gender) throws DataAccessException {
		getHibernateTemplate().save(gender);
	}

}
