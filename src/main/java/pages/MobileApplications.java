package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.ProjectSpecificWrappers;

public class MobileApplications extends ProjectSpecificWrappers {
	
	public MobileApplications (RemoteWebDriver driver, ExtentTest test) {
		this.driver = driver;
		this.test = test;
	}

	public MobileApplications   clickAddToCart (){
		clickByXpath ("//div[@class='panel-add']");
		return this;
	}
	
	public ReviewCheckout clickContinue(){
		clickById("btnCompleteProductConfig");
		return new ReviewCheckout (driver, test);
	}

	
}
