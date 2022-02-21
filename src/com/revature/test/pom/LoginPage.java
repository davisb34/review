package com.revature.test.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	// make the constructor of this class take in the driver
	public LoginPage(WebDriver driver) {

		// when you call this class initialize all of the web elements
		PageFactory.initElements(driver, this);
	}

	// use this annotation to find an element by xpath
	// @FindBy(xpath = "//*[@id=\"lst-ib\"]")

	// use this annotation to find an element by a specific identifier
	@FindBy(name = "lg_username")
	// put the web element you found inside this variable
	public WebElement LoginPageUsernameInputBar;

	// use this annotation to find an element by a specific identifier
	@FindBy(name = "lg_password")
	// put the web element you found inside this variable
	public WebElement LoginPagePasswordInputBar;

	// use this annotation to find an element by a specific identifier
	@FindBy(id = "modal-button")
	// put the web element you found inside this variable
	public WebElement ModalButton;

	@FindBy(id = "lg_button")
	public WebElement LoginPageSubmitButton;
}
