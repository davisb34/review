package com.revature.pojos;

import javax.persistence.Cacheable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Cacheable(true)
public class Client {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer clientId;
	@Column
	private String clientName;
	private String ClientAvgStartDate;

	// getters/setters here
	public Integer getClientId() {
		return clientId;
	}

	public void setClientId(Integer clientId) {
		this.clientId = clientId;
	}

	public String getClientName() {
		return clientName;
	}

	public void setClientName(String clientName) {
		this.clientName = clientName;
	}

	public String getClientAvgStartDate() {
		return ClientAvgStartDate;
	}

	public void setClientAvgStartDate(String clientAvgStartDate) {
		ClientAvgStartDate = clientAvgStartDate;
	}

}
