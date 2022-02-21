package com.revature.test.pageFactory;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.revature.test.pom.CorePage;
// import the specific pom files we want
import com.revature.test.pom.LoginPage;

public class PageFactory {

	public static void main(String[] args) {

		// specify the path of the driver and make a file object from that
		File file = new File(TestConstants.CHROMEDRIVER);

		// set the absolute path of your driver
		System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());

		// create a new driver swap out the chromedriver if you want to test
		// with a different browser
		WebDriver driver = new ChromeDriver();
		try {

			// implicit means it will wait for the element to appear/become
			// visible
			// if the wait time is exceeded, it will move on to the next line.
			driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

			// open an application using the url
			driver.get(TestConstants.APPURL);

			// declare and initialize the POM page we want
			LoginPage loginPage = new LoginPage(driver);

			// get the element we want and send the keyboard keys we want
			// pressed
			loginPage.ModalButton.click();
			loginPage.LoginPageUsernameInputBar.sendKeys(TestConstants.USERNAME);
			loginPage.LoginPagePasswordInputBar.sendKeys(TestConstants.PASSWORD);
			loginPage.LoginPageSubmitButton.sendKeys(Keys.RETURN);

			// get the url of the page you are currently on to see if you made
			// it
			// there correctly
			driver.getTitle();

			// ------------- Once Directed to the HomePage ---------------------

			// declare and initialize the POM page we want
			CorePage corePage = new CorePage(driver);

			// open the navbar
			corePage.toggleNavbarButton.click();

			// wait for 2 seconds
			sleep(2000);

			// TODO click buttons in navbar

			// close the navbar
			corePage.toggleNavbarButton.click();

			// open the accordian
			corePage.CollapseBar1.click();

			// wait for 2 seconds
			sleep(2000);

			// open the accordian
			corePage.CollapseBar2.click();

			// wait for 2 seconds
			sleep(2000);

			// open the accordian
			corePage.CollapseBar3.click();

			// wait for 2 seconds
			sleep(2000);

			// close the accordian
			corePage.CollapseBar3.click();

		} finally {
			driver.quit();
		}

	}

	// this is just a helper method that makes the main thread wait for a bit
	// before continuing
	public static void sleep(int milliseconds) {

		// try to do this
		try {

			// make the thread sleep for the amount of time specified
			Thread.sleep(milliseconds);
		}
		// if an error occured
		catch (InterruptedException e) {

			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
