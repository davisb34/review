package com.revature.pojos;

import javax.persistence.Cacheable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Cacheable(true)
public class LegalDoc {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer legalId;
	@Column
	private String legalDocName;

	public Integer getLegalId() {
		return legalId;
	}

	public void setLegalId(Integer legalId) {
		this.legalId = legalId;
	}

	public String getLegalDocName() {
		return legalDocName;
	}

	public void setLegalDocName(String legalDocName) {
		this.legalDocName = legalDocName;
	}

}
