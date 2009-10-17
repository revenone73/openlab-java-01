package cn.openlab.game.dao;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import cn.openlab.game.entity.HomeBuilding;
import cn.openlab.game.entity.HomeMap;

public class HomeMapDaoImpl extends 
		HibernateDaoSupport implements HomeMapDao {

	@Override
	public Integer saveHomeMap(HomeMap map) {
		return (Integer)getHibernateTemplate().save(map);
	}

	@Override
	public List<HomeMap> getAllMap() {
		return getHibernateTemplate().loadAll(HomeMap.class);
	}

	@Override
	public HomeMap getHomeMapById(Integer id) {
		return (HomeMap)getHibernateTemplate().get(HomeMap.class, id);
	}

}
