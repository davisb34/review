package com.revature.test.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Header {

	public Header(WebDriver driver) {

		// when you call this class initialize all of the web elements
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "homepage-link")
	public WebElement HomePageLink;
	
	@FindBy(id = "corepage-link")
	public WebElement CorePageLink;
	
	@FindBy(id = "questionbank-link")
	public WebElement QuestionBankLink;
	
}//end of header room
