package com.revature.pojos;

import javax.persistence.Cacheable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Cacheable(true)
public class AssociateJob {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer associateJobId;
	
	@Column
	private Integer jobId;
	private Integer associateId;
	
	public AssociateJob() {
		super();
	}
	public Integer getAssociateJobId() {
		return associateJobId;
	}
	public void setAssociateJobId(Integer associateJobId) {
		this.associateJobId = associateJobId;
	}
	public Integer getJobId() {
		return jobId;
	}
	public void setJobId(Integer jobId) {
		this.jobId = jobId;
	}
	public Integer getAssociateId() {
		return associateId;
	}
	public void setAssociateId(Integer associateId) {
		this.associateId = associateId;
	}
	
	
}
