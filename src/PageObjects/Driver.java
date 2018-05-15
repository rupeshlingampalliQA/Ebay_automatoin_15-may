package PageObjects;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

/**
 * Created by Rupesh on 15/5/2018.
 */

public class Driver extends BaseSetup{

	public AppiumDriver driver;

    public Driver() {
        this.driver = super.getDriver();
        

}
    
   
    
}
