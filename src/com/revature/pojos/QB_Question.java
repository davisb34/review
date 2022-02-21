package com.revature.pojos;

import java.sql.Date;

import javax.persistence.Cacheable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
@Cacheable(true)
public class QB_Question {

	@Id
	@SequenceGenerator(name="QB_QUESTION_SEQ",sequenceName="QB_QUESTION_SEQ")  
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator="QB_QUESTION_SEQ")
	private Integer questionId;

	@Column
	private String qString;
	private Date lastUpdated;
	private Integer timesAsked;
	//foreignKeys
	private Integer topicId;
	private Integer clientId;
	
	public QB_Question() {
		
	}
	
	public QB_Question(Integer questionId, String qString, Date lastUpdated, Integer timesAsked, Integer topicId,
			Integer clientId) {
		this.questionId = questionId;
		this.qString = qString;
		this.lastUpdated = lastUpdated;
		this.timesAsked = timesAsked;
		this.topicId = topicId;
		this.clientId = clientId;
	}
	public Integer getQuestionId() {
		return questionId;
	}
	public void setQuestionId(Integer questionId) {
		this.questionId = questionId;
	}
	public String getqString() {
		return qString;
	}
	public void setqString(String qString) {
		this.qString = qString;
	}
	public Date getLastUpdated() {
		return lastUpdated;
	}
	public void setLastUpdated(Date lastUpdated) {
		this.lastUpdated = lastUpdated;
	}
	public Integer getTimesAsked() {
		return timesAsked;
	}
	public void setTimesAsked(Integer timesAsked) {
		this.timesAsked = timesAsked;
	}
	public Integer getTopicId() {
		return topicId;
	}
	public void setTopicId(Integer topicId) {
		this.topicId = topicId;
	}
	public Integer getClientId() {
		return clientId;
	}
	public void setClientId(Integer clientId) {
		this.clientId = clientId;
	}
	
	@Override
	public String toString() {
		return "QB_Question [questionId=" + questionId + ", qString=" + qString + ", lastUpdated=" + lastUpdated
				+ ", timesAsked=" + timesAsked + ", topicId=" + topicId + ", clientId=" + clientId + "]";
	}
	
}
