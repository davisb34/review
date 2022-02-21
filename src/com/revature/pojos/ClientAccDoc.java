package com.revature.pojos;

import javax.persistence.Cacheable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Cacheable(true)
public class ClientAccDoc {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer clientAccountId;
	@Column
	// foreign keys
	private Integer accountId;
	private Integer associateId;
	private Integer legalId;
	
	// getters/setters here
	public Integer getClientAccountId() {
		return clientAccountId;
	}
	public void setClientAccountId(Integer clientAccountId) {
		this.clientAccountId = clientAccountId;
	}
	public Integer getAccountId() {
		return accountId;
	}
	public void setAccountId(Integer accountId) {
		this.accountId = accountId;
	}
	public Integer getAssociateId() {
		return associateId;
	}
	public void setAssociateId(Integer associateId) {
		this.associateId = associateId;
	}
	public Integer getLegalId() {
		return legalId;
	}
	public void setLegalId(Integer legalId) {
		this.legalId = legalId;
	}
}
