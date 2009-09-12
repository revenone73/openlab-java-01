package cn.openlab.game.dao;

import java.util.List;

import cn.openlab.game.entity.Building;

public interface BuildingDao {

	List<Building> getAllBuildings();
	
	void saveBuilding(Building building);
}
