package com.revature.pojos;

import javax.persistence.Cacheable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Cacheable(true)
public class Associate  {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer associateId;
	
	public void setAssociateId(Integer associateId) {
		this.associateId = associateId;
	}

	@Column
	private String username;
	private String password;
	//foreignKeys
	private Integer trackId;
	private Integer roleId;
	
	
	//constructors here
	//implement later
	
	
	//getters/setters here	
	public int getAssociateId() {
		return associateId;
	}

	public void setAssociateId(int associateId) {
		this.associateId = associateId;
	}

	public int getTrackId() {
		return trackId;
	}

	public void setTrackId(int trackId) {
		this.trackId = trackId;
	}

	public int getRoleId() {
		return roleId;
	}

	public void setRoleId(int roleId) {
		this.roleId = roleId;
	}


	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	//toString
	@Override
	public String toString() {
		return "Associate [username=" + username + ", password=" + password + "]";
	}
	
}//end of associate class
