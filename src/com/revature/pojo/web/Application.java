package com.revature.pojo.web;

public class Application {
	
	private String jobTitle;
	private String clientName;
	
	public Application(String jobTitle, String clientName) {
		super();
		this.jobTitle = jobTitle;
		this.clientName = clientName;
	}

	public String getJobTitle() {
		return jobTitle;
	}

	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}

	public String getClientName() {
		return clientName;
	}

	public void setClientName(String clientName) {
		this.clientName = clientName;
	}
	
	

}
