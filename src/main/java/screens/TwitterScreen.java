package screens;

import java.time.Duration;

import org.openqa.selenium.support.PageFactory;

import Base.ScreenBase;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class TwitterScreen extends ScreenBase {
	
	public TwitterScreen(AppiumDriver<MobileElement> driver) {
		super(driver);
		PageFactory.initElements(new AppiumFieldDecorator(driver, Duration.ofSeconds(10)), this);

	}
	
	@AndroidFindBy(uiAutomator= "UiSelector().resourceId(\"username_or_email\")")
	public MobileElement UsernameField;
	
	@AndroidFindBy(uiAutomator= "UiSelector().resourceId(\"password\")")
	public MobileElement PasswordField;
	 
	@AndroidFindBy(uiAutomator= "UiSelector().resourceId(\"allow\")")
	public MobileElement AuthorizeAppButton;
	 
	
	 @AndroidFindBy(accessibility = "AuthoriseWithTwitter_593")
	public MobileElement TwitterIcon;
	 
	 public void clickTwitterIcon() {
	    	
		 TwitterIcon.click();
	 }
	 
	 public void enterUsernameAndPassword() {
		 
		 UsernameField.sendKeys("tes1.auto1@gmail.com");
		 PasswordField.sendKeys("game@twitter");
		 AuthorizeAppButton.click();
		 
	 }

}
