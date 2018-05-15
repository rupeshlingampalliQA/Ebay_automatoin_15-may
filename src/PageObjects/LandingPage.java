package PageObjects;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

/**
 * This class is created to store element locators and functions of landing page
 *
 * @author : Rupesh
 * created date :15 May 2018
 */

public class LandingPage {

	BaseSetup baseSetup;

	/**
	 * This method is used to click sign in button on landing page
	 *
	 * @param : None
	 *          Last modified by :
	 * @author : Rupesh
	 * created date :15 May 2018
	 * @throws Exception 
	 */

	public void clickSignInbtn() throws Exception {
		WebElement signInBtn = baseSetup.getDriver().findElement(baseSetup.getLocator("signInBtnID"));

		signInBtn.isDisplayed();
		signInBtn.click();
	}

}
