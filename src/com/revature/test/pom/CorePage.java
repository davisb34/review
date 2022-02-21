package com.revature.test.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CorePage {

	// make the constructor of this class take in the driver
	public CorePage(WebDriver driver) {

		// when you call this class initialize all of the web elements
		PageFactory.initElements(driver, this);
	}

	// use this annotation to find an element by xpath
	// @FindBy(xpath = "//*[@id=\"lst-ib\"]")
	
	// use this annotation to find an element by a specific identifier
	@FindBy(id = "collapse1Dropdown")
	// put the web element you found inside this variable
	public WebElement CollapseBar1;

	// use this annotation to find an element by a specific identifier
	@FindBy(id = "collapse2Dropdown")
	// put the web element you found inside this variable
	public WebElement CollapseBar2;

	// use this annotation to find an element by a specific identifier
	@FindBy(id = "collapse3Dropdown")
	// put the web element you found inside this variable
	public WebElement CollapseBar3;

	@FindBy(id = "opennav")
	public WebElement toggleNavbarButton;
	

}
