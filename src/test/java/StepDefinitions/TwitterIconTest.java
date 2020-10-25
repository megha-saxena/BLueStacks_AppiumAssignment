package StepDefinitions;

import org.testng.Assert;

import com.cucumber.listener.Reporter;

import Base.TestBase;
import cucumber.api.Scenario;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import screens.LoginScreen;

import screens.TwitterScreen;
import utils.CommonUtils;
import utils.log;

public class TwitterIconTest extends TestBase {
	
	 public LoginScreen LS = new LoginScreen(driver);
	 public TwitterScreen TS = new TwitterScreen(driver);


	 @Then("^Twitter icon should be visible$")
	 public void twitter_icon_should_be_visible() throws Throwable {
		log.info("Verifying twitter icon"); 
		boolean bool = LS.TwitterIcon.isDisplayed();
		Assert.assertEquals(bool, true);
		Reporter.addStepLog("Twitter Icon is present");
	 }
	 
	 
	 @Then("^User should be able to click Twitter$")
	 public void user_should_be_able_to_click_Twitter() throws Throwable {
	  
		 log.info("Clicking twitter icon"); 
		 LS.clickTwitterIcon();
		 boolean bool = TS.UsernameField.isDisplayed();
		 Assert.assertEquals(bool, true);
		 Reporter.addStepLog("Twitter Icon is clicked");
		 
	 }


}
