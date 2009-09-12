package cn.openlab.game.entity;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Transient;

@Entity
public class MemberResource {

	private Integer id;
	private Member member;
	private Integer food;
	private Integer wood;
	private Integer stone;
	private Integer gold;
	private Integer land;
	private Integer people;
	private Timestamp createTime;

	@Column
	public Timestamp getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Timestamp createTime) {
		this.createTime = createTime;
	}
	@Id
	@GeneratedValue
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}

	@OneToOne
	public Member getMember() {
		return member;
	}
	public void setMember(Member member) {
		this.member = member;
	}
	
	@Column
	public Integer getFood() {
		return food;
	}
	public void setFood(Integer food) {
		this.food = food;
	}
	
	@Column
	public Integer getWood() {
		return wood;
	}
	public void setWood(Integer wood) {
		this.wood = wood;
	}
	
	@Column
	public Integer getStone() {
		return stone;
	}
	public void setStone(Integer stone) {
		this.stone = stone;
	}
	
	@Column
	public Integer getGold() {
		return gold;
	}
	public void setGold(Integer gold) {
		this.gold = gold;
	}
	
	@Column
	public Integer getLand() {
		return land;
	}
	public void setLand(Integer land) {
		this.land = land;
	}
	
	@Column
	public Integer getPeople() {
		return people;
	}
	public void setPeople(Integer people) {
		this.people = people;
	}
	
	@Transient
	public Long getDynLand() {
		long curr = System.currentTimeMillis();
		long create = createTime.getTime();
		return land + (curr - create)/1000;
	}
}
