package com.revature.pojo.web;

import java.sql.Date;

public class InterviewQuestion {

	public String question;
	public String topic;
	public Integer upvotes;
	public Date lastUpdated;
	public Integer clientId;
	public String clientName;
	public Integer topicId;
	
	
	
	public InterviewQuestion(String question, String topic, Integer upvotes, Date lastUpdated, Integer clientId,
			String clientName, Integer topicId) {
		super();
		this.question = question;
		this.topic = topic;
		this.upvotes = upvotes;
		this.lastUpdated = lastUpdated;
		this.clientId = clientId;
		this.clientName = clientName;
		this.topicId = topicId;
	}
	public Integer getTopicId() {
		return topicId;
	}
	public void setTopicId(Integer topicId) {
		this.topicId = topicId;
	}
	public void setUpvotes(Integer upvotes) {
		this.upvotes = upvotes;
	}
	public Date getLastUpdated() {
		return lastUpdated;
	}
	public void setLastUpdated(Date lastUpdated) {
		this.lastUpdated = lastUpdated;
	}
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
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public String getTopic() {
		return topic;
	}
	public void setTopic(String topic) {
		this.topic = topic;
	}
	public int getUpvotes() {
		return upvotes;
	}
	public void setUpvotes(int upvotes) {
		this.upvotes = upvotes;
	}
	
	public InterviewQuestion() {
		
	}
	
	
}
