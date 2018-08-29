package com.sk.testScripts;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.sk.base.TestBase;
import com.sk.pages.Page_001_LaunchingSharekhanPage;
import com.sk.pages.Page_002_HomePage;
import com.sk.utils.TestUtil;

public class TC_002_HomePageTest extends TestBase{
	
	Page_001_LaunchingSharekhanPage launchingPage;
	Page_002_HomePage homePage;
	
	public TC_002_HomePageTest(){
		super();
	}
	
	@BeforeMethod
	public void setUp() throws InterruptedException{
		
		initialization();
		launchingPage= new Page_001_LaunchingSharekhanPage();
		homePage= launchingPage.clickOnVisitHomePageButton();
		
	}
	
	@Test
	public void verifyShareKhanLogoTest(){
		driver.findElement(By.xpath("//*[@id='CloseDiv']")).click();
		boolean flag=homePage.verifyShareKhanLogo();
		
		Assert.assertTrue(flag, "Logo is not present");
	}
	
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}
	
	
	
	
	

}
