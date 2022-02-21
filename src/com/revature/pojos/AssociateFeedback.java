package com.revature.pojos;

import javax.persistence.Cacheable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;


@Entity
@Cacheable(true)
public class AssociateFeedback {

	@Id
	@SequenceGenerator(name="ASSOCIATEFEEDBACK_SEQ",sequenceName="ASSOCIATEFEEDBACK_SEQ")  
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator="ASSOCIATEFEEDBACK_SEQ")
	private Integer feedbackId;

	@Column
	private Integer difficulty;
	private float interviewLength;
	private Integer associateId;
	private Integer interviewId;

	// constructors here
	public AssociateFeedback()
	{
		
	}
	
	public AssociateFeedback(Integer feedbackId, Integer difficulty, float interviewLength, Integer associateId,
			Integer interviewId) {
		this.feedbackId = feedbackId;
		this.difficulty = difficulty;
		this.interviewLength = interviewLength;
		this.associateId = associateId;
		this.interviewId = interviewId;
	}

	// getters/setters here
	public Integer getFeedbackId() {
		return feedbackId;
	}

	public void setFeedbackId(Integer feedbackId) {
		this.feedbackId = feedbackId;
	}

	public Integer getDifficulty() {
		return difficulty;
	}

	public void setDifficulty(Integer difficulty) {
		this.difficulty = difficulty;
	}

	public float getInterviewLength() {
		return interviewLength;
	}

	public void setInterviewLength(float interviewLength) {
		this.interviewLength = interviewLength;
	}

	public Integer getAssociateId() {
		return associateId;
	}

	public void setAssociateId(Integer associateId) {
		this.associateId = associateId;
	}

	public Integer getInterviewId() {
		return interviewId;
	}

	public void setInterviewId(Integer interviewId) {
		this.interviewId = interviewId;
	}

}
