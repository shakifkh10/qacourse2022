package pages;

import org.openqa.selenium.remote.RemoteWebDriver;
import com.relevantcodes.extentreports.ExtentTest;

import wrappers.ProjectSpecificWrappers;

public class ClientArea extends ProjectSpecificWrappers {

	public ClientArea(RemoteWebDriver driver, ExtentTest test) {
		this.driver = driver;
		this.test = test;
	}

	public ClientArea clickServices() {
		clickByXpath("//li[@menuitemname='Services']");
		return this;
	}

	public ClientArea clickOrderNewServices() {
		clickByXpath("//li[@menuitemname='Order New Services']");
		return this;
	}
	
	
	
	public Mobile clickMobile(){
		clickByXpath("//a[@menuitemname='Mobile']");
		return new Mobile (driver, test);
	}
	
}
