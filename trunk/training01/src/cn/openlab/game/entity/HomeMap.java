package cn.openlab.game.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MapKey;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="home_map")
public class HomeMap {

	private Integer id;
	private String description;
	
	@Column
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	private Set<HomeBuilding> buildings;
	
	@Id
	@GeneratedValue
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	
	@OneToMany(mappedBy="homeMap", fetch=FetchType.EAGER)
	public Set<HomeBuilding> getBuildings() {
		return buildings;
	}
	public void setBuildings(Set<HomeBuilding> buildings) {
		this.buildings = buildings;
	}
//	public void addBuilding(HomeBuilding building) {
//		if(buildings == null) {
//			buildings = new HashSet<HomeBuilding>(); 
//		}
//		buildings.add(building);
//	}
}
