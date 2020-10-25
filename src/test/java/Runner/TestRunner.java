package Runner;

import java.io.File;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import com.cucumber.listener.Reporter;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import io.appium.java_client.service.local.AppiumDriverLocalService;

@CucumberOptions(features = "src/test/java/Features", glue = { "StepDefinitions" }, // path of step definition
plugin = { "pretty", "com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/report.html" }, monochrome = true, dryRun = false, // check all the steps have the
																	// definitions and will not execute
strict = true, // check if any step is not defined in step definition file
tags = { "@full" })


public class TestRunner extends AbstractTestNGCucumberTests {
	
	public static AppiumDriverLocalService service;

	@BeforeSuite
	public void startAppium() {
		//start appium
		service = AppiumDriverLocalService.buildDefaultService();
		service.start();
	}

	//Creating the extent report after the completion of tests
	@AfterClass
	public static void writeExtentReport() {
		Reporter.loadXMLConfig(new File(System.getProperty("user.dir") + "//reportConfig.xml"));
		Reporter.setSystemInfo("Selenium", "3.7.0");
		Reporter.setSystemInfo("Maven", "3.5.2");
		Reporter.setSystemInfo("Java Version", "1.8.0_151");
	}


	@AfterSuite
	public void stopAppium() {
		//stop appium	
		service.stop();
	}
}
