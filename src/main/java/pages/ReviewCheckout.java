package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.ProjectSpecificWrappers;

public class ReviewCheckout extends ProjectSpecificWrappers {

	public ReviewCheckout(RemoteWebDriver driver, ExtentTest test) {
		this.driver = driver;
		this.test = test;

	}

	public ReviewCheckout validateProduct() {
		verifyTextByXpath("(//span[@class='item-title'])[1]", "Mobile Applications Edit");
			return this;
	}

	public Checkout clickCheckout() {
		clickById("checkout");
		return new Checkout(driver, test);
	}

}