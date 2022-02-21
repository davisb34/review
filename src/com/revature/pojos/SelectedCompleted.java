package com.revature.pojos;

import java.sql.Timestamp;

import javax.persistence.Cacheable;

import java.sql.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Cacheable(true)
public class SelectedCompleted {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer selectedId;
	@Column
	private Timestamp selectedTimestamp;
	private Date selectedTimeToStartDate;
	private String address;
	
	// foreignKeys
	private Integer jobId;
	private Integer associateId;

	public Integer getSelectedId() {
		return selectedId;
	}

	public void setSelectedId(Integer selectedId) {
		this.selectedId = selectedId;
	}

	public Timestamp getSelectedTimestamp() {
		return selectedTimestamp;
	}

	public void setSelectedTimestamp(Timestamp selectedTimestamp) {
		this.selectedTimestamp = selectedTimestamp;
	}

	public Date getSelectedTimeToStartDate() {
		return selectedTimeToStartDate;
	}

	public void setSelectedTimeToStartDate(Date selectedTimeToStartDate) {
		this.selectedTimeToStartDate = selectedTimeToStartDate;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
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
