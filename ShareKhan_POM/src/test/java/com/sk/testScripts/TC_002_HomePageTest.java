package com.sk.testScripts;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.sk.base.TestBase;
import com.sk.pages.Page_001_LaunchingSharekhanPage;
import com.sk.pages.Page_002_HomePage;

public class TC_002_HomePageTest extends TestBase {

	Page_001_LaunchingSharekhanPage launchingPage;

	Page_002_HomePage homePage;

	public TC_002_HomePageTest() {
		super();
	}

	@BeforeClass
	public void setUp() throws InterruptedException {
		initialization();
		launchingPage = new Page_001_LaunchingSharekhanPage();
		homePage = launchingPage.clickOnVisitHomePageButton();
		Thread.sleep(5000L);
		homePage.closeAd();
	}
	@Test(priority = 1)
	public void launchingPageTitleTest() {
		String expTitle="Sharekhan, Stock Market, Online Share Trading, Online Broking, Market Today, Live Quotes, Sensex, Nifty";
		String title = validateTitle();
		Assert.assertEquals(title, expTitle, "Launching Page Title Not Match");
	}


	@Test (priority = 2)
	public void verifyShareKhanLogoTest() {
		boolean flag = homePage.verifyShareKhanLogo();

		Assert.assertTrue(flag, "Logo is not present");
	}

	@Test (priority = 3)
	public void verifyMenuLinks_AllTest() {
		boolean flag = homePage.verifyMenuLinks_All();
		Assert.assertTrue(flag, "Menu Links not present");
	}

	@Test (priority = 4)
	public void verifyRadioButtons_AllTest() {
		boolean flag = homePage.verifyRadioButtons_All();
		Assert.assertTrue(flag, "Radio Buttons not present");
	}

	@Test (priority = 5)
	public void verifySearchTextBoxTest() {
		boolean flag = homePage.verifySearchTextBox();
		Assert.assertTrue(flag, "Search Text Box is not present");
	}

	@Test (priority = 6)
	public void verifyGoButtonTest() {
		boolean flag = homePage.verifyGoButton();
		Assert.assertTrue(flag, "Go Button is not present");
	}

	@Test (priority = 7)
	public void verifyLeftSideMenu_AllTest() {
		boolean flag = homePage.verifyLeftSideMenu_All();
		Assert.assertTrue(flag, "Left Side Menu is not present");
	}

	@Test (priority = 8)
	public void verifySelectDropDownTest() {
		boolean flag = homePage.verifySelectDropDown();
		Assert.assertTrue(flag, "Select DropDown is not present");
	}

	@Test (priority = 9)
	public void verifyMobileNumTextBoxTest() {
		boolean flag = homePage.verifyMobileNumTextBox();
		Assert.assertTrue(flag, "Mobile Number TextBox is not present");
	}

	@Test (priority = 10)
	public void verifySubmitButtonTest() {
		boolean flag = homePage.verifySubmitButton();
		Assert.assertTrue(flag, "Submit Button is not present");
	}

	@Test (priority = 11)
	public void verifyStockBoardTest() {
		boolean flag = homePage.verifyStockBoard();
		Assert.assertTrue(flag, "Stock Board Table is not present");
	}

	@AfterClass
	public void tearDown() {
		driver.quit();
	}

}
