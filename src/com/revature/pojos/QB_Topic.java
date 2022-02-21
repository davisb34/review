package com.revature.pojos;

import javax.persistence.Cacheable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Cacheable(true)
public class QB_Topic {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer topicId;
	
	@Column
	private String tString;

	public Integer getTopicId() {
		return topicId;
	}

	public void setTopicId(Integer topicId) {
		this.topicId = topicId;
	}

	public String gettString() {
		return tString;
	}

	public void settString(String tString) {
		this.tString = tString;
	}

	@Override
	public String toString() {
		return "QB_Topic [topicId=" + topicId + ", tString=" + tString + "]";
	}
}
