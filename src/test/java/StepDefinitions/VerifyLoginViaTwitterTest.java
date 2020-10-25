package StepDefinitions;

import org.testng.Assert;

import com.cucumber.listener.Reporter;

import Base.TestBase;
import cucumber.api.Scenario;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import screens.HomeScreen;
import screens.LoginScreen;
import screens.TwitterScreen;
import utils.CommonUtils;
import utils.log;

public class VerifyLoginViaTwitterTest extends TestBase {
	
	
	 public TwitterScreen TS = new TwitterScreen(driver);
	 public HomeScreen HS = new HomeScreen(driver);

	 @When("^User enters Username and Passowrd$")
	 public void user_enters_Username_and_Passowrd() throws Throwable {
	     
		 log.info("User enters username and password");
	     TS.enterUsernameAndPassword();
	     Reporter.addStepLog("User succesfully logged in to twitter");
	 }
	 
	 @Then("^User should be able to login via Twitter and is on Home Page$")
	 public void user_should_be_able_to_login_via_Twitter_and_is_on_Home_Page() throws Throwable {

		 log.info("Verifying Home page");
		 boolean bool = HS.EnterYourNameField.isDisplayed();
		 Assert.assertEquals(bool, true);
		 Reporter.addStepLog("User succesfully landed on to Home Page");
	 }




}
