package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.ProjectSpecificWrappers;

public class LoginPage extends ProjectSpecificWrappers {

	public LoginPage(RemoteWebDriver driver, ExtentTest test) {
		this.driver = driver;
		this.test = test;
	}

	public LoginPage enterUserName() {
		enterById("inputEmail", username);
		return this;
	}

	public LoginPage enterPassword() {
		enterById("inputPassword", password);
		return this;

	}

	public LoginPage notARobot() {
		clickByXpath("//div[@class='recaptcha-checkbox-border']");
			return this;

	}

	public ClientArea clickLogin() throws InterruptedException {
		Thread.sleep(7000);
		clickById("login");
		return new ClientArea(driver, test);
	}

}
