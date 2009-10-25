package cn.openlab.game.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="home_buildings")
public class HomeBuilding {

	private Integer id;
	private Integer x;
	private Integer y;
	private Integer w;
	private Integer h;
	private String image;
	public HomeMap homeMap;
	
	@Id
	@GeneratedValue
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	
	@Column
	public Integer getX() {
		return x;
	}
	public void setX(Integer x) {
		this.x = x;
	}
	
	@Column
	public Integer getY() {
		return y;
	}
	public void setY(Integer y) {
		this.y = y;
	}
	
	@Column
	public Integer getW() {
		return w;
	}
	public void setW(Integer w) {
		this.w = w;
	}
	
	@Column
	public Integer getH() {
		return h;
	}
	public void setH(Integer h) {
		this.h = h;
	}
	
	@Column
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}

	@ManyToOne
	public HomeMap getHomeMap() {
		return homeMap;
	}
	public void setHomeMap(HomeMap map) {
		this.homeMap = map;
	}
}
