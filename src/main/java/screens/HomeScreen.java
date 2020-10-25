package screens;

import java.time.Duration;

import org.openqa.selenium.support.PageFactory;

import Base.ScreenBase;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class HomeScreen extends ScreenBase{
	
	public HomeScreen(AppiumDriver<MobileElement> driver) {
		super(driver);
		PageFactory.initElements(new AppiumFieldDecorator(driver, Duration.ofSeconds(10)), this);

	}
	
	 @AndroidFindBy(xpath = "//android.view.View[@content-desc=\"edit_profile_title What should we call you?\"]")
	    public MobileElement PageHeaderText;
	 
	 @AndroidFindBy(xpath = "//android.view.View[@content-desc=\"Enter your name\"]")
	    public MobileElement EnterYourNameField;
	 
	 

}