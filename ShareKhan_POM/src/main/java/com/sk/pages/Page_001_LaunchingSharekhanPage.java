package com.sk.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sk.base.TestBase;

public class Page_001_LaunchingSharekhanPage extends TestBase {

	@FindBy(xpath = "//*[@id='ctl00']/div[3]/table/tbody/tr[3]/td/div/div[1]")
	public WebElement VisitHomePageButton;

	@FindBy(xpath = "//*[@id='ctl00']/div[3]/table/tbody/tr[3]/td/div/div[2]")
	public WebElement TradeNowButton;

	@FindBy(xpath = "//*[@id='ctl00']/div[3]/table/tbody/tr[3]/td/div/div[3]")
	public WebElement OpenAnAccountButton;

	@FindBy(xpath = "//*[@id='ctl00']/div[3]/table/tbody/tr[3]/td/div/div[4]")
	public WebElement NeedHelpButton;

	@FindBy(xpath = "//*[@id='ctl00']/div[3]/table/tbody/tr[3]/td/div/div[5]")
	public WebElement TigersGalleryButton;

	public Page_001_LaunchingSharekhanPage() {
		PageFactory.initElements(driver, this);
	}

	public String validateTitle() {
		return driver.getTitle();
	}

	public boolean validateVisitHomePageButton() {

		return VisitHomePageButton.isDisplayed();
	}

	public boolean validateTradeNowButton() {

		return TradeNowButton.isDisplayed();
	}

	public boolean validateOpenAnAccountButton() {

		return OpenAnAccountButton.isDisplayed();
	}

	public boolean validateNeedHelpButton() {

		return NeedHelpButton.isDisplayed();
	}

	public boolean validateTigersGalleryButton() {

		return TigersGalleryButton.isDisplayed();
	}
	public Page_002_HomePage clickOnVisitHomePageButton() {
		 VisitHomePageButton.click();
		 return new Page_002_HomePage();
	}
	
	

}
