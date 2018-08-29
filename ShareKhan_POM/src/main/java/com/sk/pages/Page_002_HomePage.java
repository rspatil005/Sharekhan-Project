package com.sk.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sk.base.TestBase;
import com.sk.utils.TestUtil;

public class Page_002_HomePage extends TestBase{
	
	TestUtil util=new TestUtil();
	
	/*@FindBy(xpath="//*[@id='CloseDiv']")
	public WebElement closeAdBtn;*/
	
	@FindBy(xpath="//img[@title='Sharekhan Logo']")
	public WebElement shareKhanLogo;
	
	
	public Page_002_HomePage(){
		
		PageFactory.initElements(driver, this);
	}
	
/*	public void closeAd(){
		util.wait(By.xpath("//*[@id='CloseDiv']"));
		driver.findElement(By.xpath("//*[@id='CloseDiv']")).click();
	}*/
	
	public boolean verifyShareKhanLogo(){
		return shareKhanLogo.isDisplayed();
	}

}
