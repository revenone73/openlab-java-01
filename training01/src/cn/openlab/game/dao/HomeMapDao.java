package cn.openlab.game.dao;

import java.util.List;

import cn.openlab.game.entity.HomeBuilding;
import cn.openlab.game.entity.HomeMap;

public interface HomeMapDao {

	Integer saveHomeMap(HomeMap map);
	
	List<HomeMap> getAllMap();
	
	HomeMap getHomeMapById(Integer id);
	
	void updateHomeMap(HomeMap map, HomeBuilding building);
}
