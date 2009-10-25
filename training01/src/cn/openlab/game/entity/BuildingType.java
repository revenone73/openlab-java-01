package cn.openlab.game.entity;

import java.util.Set;

import javax.persistence.Entity;

@Entity
public class BuildingType {

	private Integer id;
	private String name;
	private String description;
	private Integer max;
	private Set<ResourceResumption> resumptions;

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Integer getMax() {
		return max;
	}
	public void setMax(Integer max) {
		this.max = max;
	}
	public Set<ResourceResumption> getResumptions() {
		return resumptions;
	}
	public void setResumptions(Set<ResourceResumption> resumptions) {
		this.resumptions = resumptions;
	}
	
}
