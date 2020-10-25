package StepDefinitions;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import com.cucumber.listener.Reporter;
import com.google.common.io.Files;

import Base.TestBase;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import utils.CommonUtils;
import utils.ReadPropertiesFile;
import utils.log;

public class hooks extends TestBase{
	
	 public Scenario scenario;
	 public ReadPropertiesFile read = new ReadPropertiesFile();
	 
	
	 @Before
		public void launchApp(Scenario scenario) throws MalformedURLException {
		 // creating a new android driver instance
			CommonUtils obj = new CommonUtils();
			obj.setAndroidCapabilities();
			driver = obj.getAndroidDriver();
			this.scenario = scenario; 
			log.info("Android Driver has started" );


		}
	 
	 @After(order = 1)// order 1 as we want to save screenshot before quitting driver and before removing app
	 public void afterScenario(Scenario scenario) {
	 //Saving screenshot when scenario fails
		 if (scenario.isFailed()) {
			 String screenshotName = scenario.getName().replaceAll(" ", "_");
			 try {
				 //This takes a screenshot from the driver at save it to the specified location
				 File sourcePath = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	 
				 //Building up the destination path for the screenshot to save
				 //Also make sure to create a folder 'screenshots' with in the cucumber-report folder
				 File destinationPath = new File(System.getProperty("user.dir") + "/target/cucumber-reports/screenshots/" + screenshotName + ".png");
	 
				 //Copy taken screenshot from source location to destination location
				 Files.copy(sourcePath, destinationPath);   
	 
				 //This attach the specified screenshot to the test
				 Reporter.addScreenCaptureFromPath(destinationPath.toString());
				 Reporter.addStepLog("Screenshot attached");
				 log.startLog("Screenshot saved");
			 } catch (IOException e) {
			 } 
		 }
	 }
	 
	 
	 @After(order = 0)
	 public void AfterSteps() {
		 //Removing app and quitting driver after every test
		// driver.removeApp(read.getProperty("appPackage"));
	     driver.quit();
	     log.startLog("Driver quitted");
	     

	 }

}
