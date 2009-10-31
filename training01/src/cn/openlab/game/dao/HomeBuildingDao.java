package cn.openlab.game.dao;

import cn.openlab.game.entity.HomeBuilding;

public interface HomeBuildingDao {

	Integer saveHomeBuilding(HomeBuilding building);
	
	void deleteHomeBuilding(Integer id);
}
