package PageObjects;


import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

/**
 * @author : Rupesh
 * created date :15 May 2018
 */

public class LoginTests extends BaseSetup {

	LoginPage loginPage;
	LandingPage landingPage;
	BaseSetup baseSetup;

	String userName = "testUser1";
	String passWord = "testPwd1";

	@Test
	public void testLogin() throws Exception
	{
		WebElement loginBtn = baseSetup.getDriver().findElement(baseSetup.getLocator("signInBtnID"));

		loginPage.enterLoginDetails("ID", "Password");
		loginPage.clickLoginBtn();
		if (loginBtn.isDisplayed()) {
			System.out.println("login failed");
		}else{
			System.out.println("login pass");
		}

	}


}
