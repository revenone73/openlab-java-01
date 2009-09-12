package cn.openlab.game.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name = "members", 
		uniqueConstraints = {@UniqueConstraint(columnNames={"userName"})})
public class Member {

	private Integer id;
	private String userName;
	private String password;
	private String email;

	@Id
	@GeneratedValue
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	
	@Column
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		System.out.println("set user name");
		this.userName = userName;
	}
	
	@Column
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		System.out.println("set password");
		this.password = password;
	}

	@Column
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
}
