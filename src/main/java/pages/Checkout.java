package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.ProjectSpecificWrappers;

public class Checkout extends ProjectSpecificWrappers {
	
	public Checkout (RemoteWebDriver driver, ExtentTest test) {
		this.driver = driver;
		this.test = test;
	}

	
	public Checkout clickCompleteOrder (){
		clickById("btnCompleteOrder");		
		return this;
	}



}
