package com.sk.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sk.base.TestBase;
import com.sk.utils.TestUtil;

public class Page_002_HomePage extends TestBase {

	TestUtil util = new TestUtil();

	@FindBy(xpath = "//img[@title='Sharekhan Logo']")
	public WebElement shareKhanLogo;
	
	@FindBy(xpath = "//*[@id='ctl00_TopBetaMenu1_divTopMenu']")
	public WebElement menuLinks_All;
	
	@FindBy(xpath = "//*[@id='topSection']/div/table/tbody/tr[2]/td/table/tbody/tr[2]/td/table/tbody/tr[1]")
	public WebElement radioButtons_All;
	
	@FindBy(xpath = "//*[@id='flashResizer']")
	public WebElement searchTextBox;
	
	@FindBy(xpath = ".//*[@id='topSection']/div/table/tbody/tr[2]/td/table/tbody/tr[2]/td/table/tbody/tr[2]/td/table/tbody/tr/td[2]/a")
	public WebElement goButton;
	
	@FindBy(xpath = "//*[@id='leftColumn']//div/descendant::div[@class='unSelect']")
	public WebElement leftSideMenu_All;
	
	@FindBy(xpath = ".//*[@id='leftColumn']//div/descendant::select[@id='CboNearShopOp']")
	public WebElement selectDropDown;
	
	@FindBy(xpath = ".//*[@id='leftColumn']//div/descendant::input [@id='txtphoneOp']")
	public WebElement mobileNumTextBox;
	
	@FindBy(xpath = ".//*[@id='leftColumn']//div/descendant::input [@id='ImageOpenAccLead']")
	public WebElement submitButton;
	
	@FindBy(xpath = "//*[@id='midColumn']/div[5]")
	public WebElement StockBoard;

	public Page_002_HomePage() {

		PageFactory.initElements(driver, this);
	}

	public void closeAd() {
		driver.findElement(By.xpath(".//*[text()='X']")).click();
	}

	public boolean verifyShareKhanLogo() {
		return shareKhanLogo.isDisplayed();
	}

	public boolean verifyMenuLinks_All() {
		return menuLinks_All.isDisplayed();
	}

	public boolean verifyRadioButtons_All() {
		return radioButtons_All.isDisplayed();
	}

	public boolean verifySearchTextBox() {
		return searchTextBox.isDisplayed();
	}

	public boolean verifyGoButton() {
		return goButton.isDisplayed();
	}

	public boolean verifyLeftSideMenu_All() {
		return leftSideMenu_All.isDisplayed();
	}

	public boolean verifySelectDropDown() {
		return selectDropDown.isDisplayed();
	}

	public boolean verifyMobileNumTextBox() {
		return mobileNumTextBox.isDisplayed();
	}

	public boolean verifySubmitButton() {
		return submitButton.isDisplayed();
	}

	public boolean verifyStockBoard() {
		return StockBoard.isDisplayed();
	}

}
