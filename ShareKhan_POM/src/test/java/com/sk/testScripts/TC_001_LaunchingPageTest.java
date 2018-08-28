package com.sk.testScripts;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.sk.base.TestBase;
import com.sk.pages.Page_001_LaunchingSharekhanPage;

public class TC_001_LaunchingPageTest extends TestBase {

	Page_001_LaunchingSharekhanPage launchingPage;

	public TC_001_LaunchingPageTest() {
		super();
	}

	@BeforeMethod
	public void setUp() {
		initialization();
		launchingPage = new Page_001_LaunchingSharekhanPage();
	}

	@Test(priority = 1)
	public void launchingPageTitleTest() {
		String expTitle = "Sharekhan, Stock Market, Online Share Trading, Online Broking, Market Today, Live Quotes, Sensex, Nifty.";
		String title = launchingPage.validateTitle();
		Assert.assertEquals(title, expTitle, "Launching Page Title Not Match");
	}

	@Test(priority = 2)
	public void validateVisitHomePageButtonTest() {
		boolean flag = launchingPage.validateVisitHomePageButton();
		Assert.assertTrue(flag);
	}

	@Test(priority = 3)
	public void validateTradeNowButtonTest() {
		boolean flag = launchingPage.validateTradeNowButton();
		Assert.assertTrue(flag);
	}

	@Test(priority = 4)
	public void validateOpenAnAccountButtonTest() {
		boolean flag = launchingPage.validateOpenAnAccountButton();
		Assert.assertTrue(flag);
	}

	@Test(priority = 5)
	public void validateNeedHelpButtonTest() {
		boolean flag = launchingPage.validateNeedHelpButton();
		Assert.assertTrue(flag);
	}

	@Test(priority = 6)
	public void validateTigersGalleryButtonTest() {
		boolean flag = launchingPage.validateTigersGalleryButton();
		Assert.assertTrue(flag);
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
