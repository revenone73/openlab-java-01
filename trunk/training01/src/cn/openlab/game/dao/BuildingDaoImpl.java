package cn.openlab.game.dao;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import cn.openlab.game.entity.Building;

public class BuildingDaoImpl 
	extends HibernateDaoSupport implements BuildingDao {

	@Override
	public List<Building> getAllBuildings() {
		getHibernateTemplate();
		return getHibernateTemplate().find("from Building b");
	}

	public static void main(String[] args) {
		BuildingDao dao = new BuildingDaoImpl();
		dao.getAllBuildings();
	}

	@Override
	public void saveBuilding(Building building) {
		getHibernateTemplate().save(building);
	}

	
}
