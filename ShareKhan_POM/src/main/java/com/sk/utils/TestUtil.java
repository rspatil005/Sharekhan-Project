package com.sk.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.sk.base.TestBase;

public class TestUtil extends TestBase {
	
	public static long PAGE_LOAD_TIMEOUT=20;
	public static long IMPLICIT_WAIT=10;
	
	public void wait(By locator){
		WebDriverWait wait= new WebDriverWait(driver, 20L);
		wait.until(ExpectedConditions.elementToBeClickable(locator));
	}
	
}
