package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.ProjectSpecificWrappers;

public class Mobile  extends ProjectSpecificWrappers {
	
	public Mobile (RemoteWebDriver driver, ExtentTest test) {
		this.driver = driver;
		this.test = test;
	}

	public MobileApplications clickOrderNow(){
		clickById("product1-order-button");
		return new MobileApplications (driver, test);
	}
	
}
