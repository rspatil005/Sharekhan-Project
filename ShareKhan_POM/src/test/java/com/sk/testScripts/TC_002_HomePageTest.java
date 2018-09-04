package com.sk.testScripts;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.sk.base.TestBase;
import com.sk.pages.Page_001_LaunchingSharekhanPage;
import com.sk.pages.Page_002_HomePage;

public class TC_002_HomePageTest extends TestBase{
	
	Page_001_LaunchingSharekhanPage launchingPage;
	
	Page_002_HomePage homePage;
	
	public TC_002_HomePageTest(){
		super();
	}
	
	@BeforeClass
	public void setUp() throws InterruptedException{
		
		initialization();
		launchingPage= new Page_001_LaunchingSharekhanPage();
		homePage= launchingPage.clickOnVisitHomePageButton();
		Thread.sleep(5000L);
		homePage.closeAd();
	}
	
	@Test
	public void verifyShareKhanLogoTest(){
		boolean flag=homePage.verifyShareKhanLogo();
		
		Assert.assertTrue(flag, "Logo is not present");
	}
	
	
	
	
	
	@AfterClass
	public void tearDown(){
		driver.quit();
	}
	
	
	
	
	

}
