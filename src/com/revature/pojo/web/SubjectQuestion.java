package com.revature.pojo.web;

public class SubjectQuestion {

	private String subject;
	private String question;
	
	public SubjectQuestion(String subject, String question) {
		this.subject = subject;
		this.question = question;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
}
