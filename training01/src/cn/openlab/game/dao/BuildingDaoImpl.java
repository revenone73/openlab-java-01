package cn.openlab.game.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import cn.openlab.game.entity.Building;

public class BuildingDaoImpl implements BuildingDao {

	@Override
	public List<Building> getAllBuildings() {
		Session session = DaoUtils.createSession();
		Query query = session.createQuery("from Building b");
		List<Building> buildings = query.list();
		return buildings;
	}

	public static void main(String[] args) {
		BuildingDao dao = new BuildingDaoImpl();
		dao.getAllBuildings();
	}

	@Override
	public void saveBuilding(Building building) {
		Session session = DaoUtils.createSession();
		Transaction trans = session.beginTransaction();
		session.save(building);
		trans.commit();
	}

	
}
