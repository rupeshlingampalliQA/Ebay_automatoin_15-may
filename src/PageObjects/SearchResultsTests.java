package PageObjects;

import org.testng.annotations.Test;

/**
 * @author : Rupesh
 * created date :15 May 2018
 */

public class SearchResultsTests extends BaseSetup {

	LandingPage landingPage;
	LoginTests loginTests;
	SearchResultsPage searchResult;

	String productIphone = "iPhone7";

	/**
	 * This method is for search a product
	 *
	 * @param : None
	 *          Last modified by :
	 * @author : Rupesh
	 * created date :15 May 2018
	 */

	/*@Test
	public void searchAProduct(){
		loginTests.testLogin();
		landingPage.searchFld.isDisplayed();
		landingPage.searchFld.sendKeys(productIphone);
		searchResult.firstProduct.isDisplayed();
		searchResult.firstProduct.click();

	}*/

	/**
	 * This method is for test the end-ent purchase flow
	 *
	 * @param : None
	 *          Last modified by :
	 * @author : Rupesh
	 * created date :15 May 2018
	 */

	/*@Test
	public void searchAProductAndPurchase(){
		searchAProduct();
		searchResult.buyNowBtn.isDisplayed();
		searchResult.buyNowBtn.click();
		searchResult.proceedToPayBtn.isDisplayed();
		searchResult.proceedToPayBtn.click();
	}*/



}
