package StepDefinitions;

import org.testng.Assert;

import com.cucumber.listener.Reporter;

import Base.TestBase;
import cucumber.api.Scenario;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import screens.LoginScreen;

import utils.CommonUtils;
import utils.log;

public class VerifyLoginScreenTest extends TestBase {
	
	 public LoginScreen LS = new LoginScreen(driver);

	 @When("^User lauches the game\\.tv app$")
	 public void user_lauches_the_game_tv_app() throws Throwable {
				  
		 Reporter.addStepLog("Game.tv app has launched");
		 log.info("Game.tv app has launched");
	 }

	 @Then("^User should be able to see the login screen$")
	 public void user_should_be_able_to_see_the_login_screen() throws Throwable {
   
		 log.info("Verifying Login screen" );
		 boolean bool= LS.EnterPhoneLabel.isDisplayed();
		 Assert.assertEquals(bool, true);
		 Reporter.addStepLog("Login screen verified");	
		
		
	 }

}
