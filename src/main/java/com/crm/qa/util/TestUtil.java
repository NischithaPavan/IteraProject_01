package com.crm.qa.util;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestUtil {
	public static long PAGE_LOAD_TIMEOUT=30;
	public static long IMPLICIT_WAIT=80;
	
	
	
public static void waitForVisibility(WebElement element, WebDriver driver) {
		
		new WebDriverWait(driver,Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(element));
		
		
	}
	
	//Check the status for all elements visibility
	
	public static void waitForAllVisiblity(List<WebElement> eleLocation,WebDriver driver ) {
		new WebDriverWait(driver,Duration.ofSeconds(60)).until(ExpectedConditions.visibilityOfAllElements((List<WebElement>) eleLocation));
	}
	
	//Check the Element Status whether it is clickable
	
	public static void waitForClickable(WebElement element,WebDriver driver) {
		
		new WebDriverWait(driver,Duration.ofSeconds(80)).until(ExpectedConditions.elementToBeClickable(element));
	}
	
	public static void click(WebElement element, WebDriver driver) {
		waitForVisibility(element, driver);
		waitForClickable(element, driver);
		element.click();
	}
	
	
	
	 public static void sendkeys(WebElement element, String value,WebDriver driver) {
		 waitForVisibility(element, driver);
		 waitForClickable(element, driver);
		 element.sendKeys(value);
	 }

}
