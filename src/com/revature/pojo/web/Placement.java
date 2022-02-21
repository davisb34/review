package com.revature.pojo.web;

public class Placement {

	private String name;
	private String workingAddress;
	private String startDate;

	public Placement(String name, String workingAddress, String startDate) {
		super();
		this.name = name;
		this.workingAddress = workingAddress;
		this.startDate = startDate;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getWorkingAddress() {
		return workingAddress;
	}

	public void setWorkingAddress(String workingAddress) {
		this.workingAddress = workingAddress;
	}

	public String getStartDate() {
		return startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

}
