package com.revature.pojo.web;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Date;

public class Interview implements Serializable {

	private int id;

	private String clientName;
	private Date date;
	private String jobTitle;
	private String time;
	private String type;
	private String status;
	private boolean showButton;

	public Interview(int id, Date date, String clientName, String jobTitle, String time, String type, String status,
			int feedbackId) {
		super();
		this.id = id;
		this.time = time;
		this.clientName = clientName;
		this.jobTitle = jobTitle;
		this.time = time;
		this.type = type;
		this.status = status;

		if (status.equals("Pending") || feedbackId != 0) {
			this.showButton = false;
		} else {
			this.showButton = true;
		}

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getClientName() {
		return clientName;
	}

	public void setClientName(String clientName) {
		this.clientName = clientName;
	}

	public String getJobTitle() {
		return jobTitle;
	}

	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public boolean isShowButton() {
		return showButton;
	}

	public void setShowButton(boolean showButton) {
		this.showButton = showButton;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

}
