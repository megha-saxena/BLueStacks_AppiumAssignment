package utils;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class CommonUtils {
	
	private AppiumDriver<MobileElement> driver;
	private static DesiredCapabilities capabilities = new DesiredCapabilities();
	public ReadPropertiesFile read = new ReadPropertiesFile();

	//setting all the required capabilities
	public void setAndroidCapabilities() {
		
		
		capabilities.setCapability("deviceName", read.getProperty("deviceName"));
        capabilities.setCapability("platformName", read.getProperty("platformName"));
        capabilities.setCapability("appPackage", read.getProperty("appPackage"));
        capabilities.setCapability("appActivity", read.getProperty("appActivity"));
        capabilities.setCapability("platformVersion", read.getProperty("platformVersion"));	
		
	
	}

	//Creating new driver instance and setting implicit wait
	public AppiumDriver<MobileElement> getAndroidDriver() throws MalformedURLException {
		try {
			driver = new AndroidDriver(new URL(read.getProperty("URL")), capabilities);
			driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
		
			} catch (Exception e) {
			e.printStackTrace();
	
			}
			return driver;
}

}
