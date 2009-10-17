package cn.openlab.game.dao;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import cn.openlab.game.entity.HomeBuilding;

public class HomeBuildingDaoImpl extends HibernateDaoSupport implements
		HomeBuildingDao {

	@Override
	public Integer saveHomeBuilding(HomeBuilding building) {
		return (Integer) getHibernateTemplate().save(building);
	}

}
