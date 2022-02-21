package com.revature.pojos;

import javax.persistence.Cacheable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Cacheable(true)
public class Job {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer jobId;
	@Column

	private String jobContractLength;
	private String title;
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	// foreignKeys
	private Integer accountId;

	public Integer getJobId() {
		return jobId;
	}

	public void setJobId(Integer jobId) {
		this.jobId = jobId;
	}

	public String getJobContractLength() {
		return jobContractLength;
	}

	public void setJobContractLength(String jobContractLength) {
		this.jobContractLength = jobContractLength;
	}

	public Integer getAccountId() {
		return accountId;
	}

	public void setAccountId(Integer accountId) {
		this.accountId = accountId;
	}

}
