package screens;

import java.time.Duration;

import org.openqa.selenium.support.PageFactory;

import Base.ScreenBase;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class LoginScreen extends ScreenBase{
	
	public LoginScreen(AppiumDriver<MobileElement> driver) {
		super(driver);
		PageFactory.initElements(new AppiumFieldDecorator(driver, Duration.ofSeconds(10)), this);

	}
	
	 @AndroidFindBy(accessibility = "Enter your phone number")
	    public MobileElement EnterPhoneLabel;
	 
	 @AndroidFindBy(accessibility = "AuthoriseWithTwitter_593")
	    public MobileElement TwitterIcon;
	 
	 public void clickTwitterIcon() {
	    	
		 TwitterIcon.click();
	    }

}
