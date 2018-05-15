package PageObjects;

import java.io.FileInputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

/**
 * @param : None
 *          Last modified by :
 * @author : Rupesh
 * created date :15 May 2018
 */

public class BaseSetup {

    private DesiredCapabilities capabilities = new DesiredCapabilities();
    private static AndroidDriver androidDriver = null;
    Properties properties;
    
    private String appiumPort = "4723";
    private String serverIp = "127.0.0.1";

    /**
     * This method is initiating driver before every test class
     *
     * @param : None
     *          Last modified by :
     * @author : Rupesh
     * created date :15 May 2018
     */
    
    @BeforeClass
    public void setup(){
        initDriver();
    }

    public AndroidDriver getDriver() {
        return androidDriver;
    }

    private void initDriver(){
        System.out.println("Inside initDriver method");

        
        capabilities.setCapability("AUTOMATION_NAME", "Appium");
        capabilities.setCapability("deviceName", "Redmi Note 4");
        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "7.1.1");        
        capabilities.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, "4000");
        capabilities.setCapability(MobileCapabilityType.APP, "E://Appium setup//ebay11.apk");
        capabilities.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "com.ebay.mobile.activities.MainActivity" );
        capabilities.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.ebay.mobile");
        capabilities.setCapability("noReset", true);        String serverUrl = "http://" + serverIp + ":" + appiumPort + "/wd/hub";

        try
        {
            System.out.println("Argument to driver object : " + serverUrl);
            androidDriver = new AndroidDriver(new URL(serverUrl), capabilities);
            androidDriver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);

        }
        catch (NullPointerException | MalformedURLException ex) {
            throw new RuntimeException("appium driver could not be initialised for device ");
        }
        System.out.println("Driver in initdriver is : "+androidDriver);

    }
    
    public void uiMap() throws IOException{
    	
    	Properties obj = new Properties(); 
		FileInputStream objFile = new FileInputStream(System.getProperty("user.dir")+"\\Default.properties");
		obj.load(objFile);
		
    }
    public By getLocator(String ElementName) throws Exception {
		// Read value using the logical name as Key
		String locator = properties.getProperty(ElementName);
		// Split the value which contains locator type and locator value
		String locatorType = locator.split(":")[0];
		String locatorValue = locator.split(":")[1];
		// Return a instance of By class based on type of locator
		if (locatorType.toLowerCase().equals("id"))
			return By.id(locatorValue);
		else if (locatorType.toLowerCase().equals("name"))
			return By.name(locatorValue);
		else if ((locatorType.toLowerCase().equals("classname"))
				|| (locatorType.toLowerCase().equals("class")))
			return By.className(locatorValue);
		else if ((locatorType.toLowerCase().equals("tagname"))
				|| (locatorType.toLowerCase().equals("tag")))
			return By.className(locatorValue);
		else if ((locatorType.toLowerCase().equals("linktext"))
				|| (locatorType.toLowerCase().equals("link")))
			return By.linkText(locatorValue);
		else if (locatorType.toLowerCase().equals("partiallinktext"))
			return By.partialLinkText(locatorValue);
		else if ((locatorType.toLowerCase().equals("cssselector"))
				|| (locatorType.toLowerCase().equals("css")))
			return By.cssSelector(locatorValue);
		else if (locatorType.toLowerCase().equals("xpath"))
			return By.xpath(locatorValue);
		else
			throw new Exception("Locator type '" + locatorType
					+ "' not defined!!");
	}
    
    
    /**
     * This method is closing driver after every test class
     *
     * @param : None
     *          Last modified by :
     * @author : Rupesh
     * created date :15 May 2018
     */

    @AfterClass
    public void tearDown(){
        androidDriver.quit();
    }

}