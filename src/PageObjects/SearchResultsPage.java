package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

/**
 * This class is created to store element locators and functions of search page
 *
 * @author : Rupesh
 * created date :15 May 2018
 */

public class SearchResultsPage {
	
	@CacheLookup
    @FindBy(id = "first_product")
    public WebElement firstProduct;

	@CacheLookup
    @FindBy(id = "buyNow")
    public WebElement buyNowBtn;
	
	@CacheLookup
    @FindBy(id = "proceedToPay")
    public WebElement proceedToPayBtn;
}
