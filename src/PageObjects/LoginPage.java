package PageObjects;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;

/**
 * This class is created to store element locators and functions of login page
 *
 * @author : Rupesh
 * created date :15 May 2018
 */

public class LoginPage {

	LandingPage landingPage;
	Driver driver;
	BaseSetup baseSetup;


	/**
	 * This method is used to enter login details
	 *
	 * @param : None
	 *          Last modified by :
	 * @author : Rupesh
	 * created date :15 May 2018
	 * @throws Exception 
	 */

	public void enterLoginDetails(String id, String pwd) throws Exception{

		WebElement signInBtn = baseSetup.getDriver().findElement(baseSetup.getLocator("signInBtnID"));
		WebElement userNameFld = baseSetup.getDriver().findElement(baseSetup.getLocator("userNameFld"));
		WebElement passwordFld = baseSetup.getDriver().findElement(baseSetup.getLocator("passwordFld"));

		signInBtn.isDisplayed();
		signInBtn.click();
		userNameFld.isDisplayed();
		userNameFld.sendKeys(id);
		passwordFld.sendKeys(pwd);


	}

	/**
	 * This method is used to click login button
	 *
	 * @param : None
	 *          Last modified by :
	 * @author : Rupesh
	 * created date :15 May 2018
	 * @throws Exception 
	 */

	public void clickLoginBtn() throws Exception {

		WebElement loginBtn = baseSetup.getDriver().findElement(baseSetup.getLocator("loginBtn"));
		loginBtn.isEnabled();
		loginBtn.click();

	}



}
