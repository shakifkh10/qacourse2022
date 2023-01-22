package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.ClientArea;
import wrappers.ProjectSpecificWrappers;

public class TestCase1 extends ProjectSpecificWrappers {
	@BeforeClass
	public void setData() {
		testCaseName="TestCase1";
		testDescription="PHP Travels";
		browserName="chrome";
		//dataSheetName="TC001";
		category="Smoke";
		authors="Tawfiq";
	}

	//@Test(dataProvider="fetchData")
	@Test
	public void testCase1() throws InterruptedException {
		//Click "Not a robot Manually
		new LoginPage(driver, test)
		.enterUserName()
		.enterPassword()
		.clickLogin()
		.clickServices()
		.clickOrderNewServices()
		.clickMobile()
		.clickOrderNow()
		.clickAddToCart()
		.clickContinue()
		.validateProduct()
		.clickCheckout ()
		.clickCompleteOrder ()
		.quitBrowser();
		Thread.sleep(10000);
		/*.clickBookStore()
		.enterSearchText(searchText)
		.clickSearchResult(searchText)
		.getTitle();
		new BookResultPage(driver,test).clickLogOut();*/

	}

}
