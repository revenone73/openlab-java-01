package cn.openlab.game.web;

import java.util.List;

import cn.openlab.game.dao.BuildingDao;
import cn.openlab.game.dao.BuildingDaoImpl;
import cn.openlab.game.entity.Building;

public class BuildingAction {

	private BuildingDao buildingDao = new BuildingDaoImpl();
	private List<Building> buildings;
	private Building building;

	public Building getBuilding() {
		return building;
	}

	public void setBuilding(Building building) {
		this.building = building;
	}

	public List<Building> getBuildings() {
		return buildings;
	}

	public String execute() {
		buildings = buildingDao.getAllBuildings();
		return "success";
	}
	
	public String load() {
		return "load";
	}
	
	public String save() {
		buildingDao.saveBuilding(building);
		return "save_succeed";
	}
}
