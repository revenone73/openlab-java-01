package cn.openlab.game.dao;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import cn.openlab.game.entity.HomeBuilding;

public class HomeBuildingDaoImpl extends HibernateDaoSupport implements
		HomeBuildingDao {

	@Override
	public Integer saveHomeBuilding(HomeBuilding building) {
		return (Integer) getHibernateTemplate().save(building);
	}

	@Override
	public void deleteHomeBuilding(Integer id) {
		HomeBuilding hb = (HomeBuilding)getHibernateTemplate().load(HomeBuilding.class, id);
		if(hb != null) {
			getHibernateTemplate().delete(hb);
		}
		
	}

}
