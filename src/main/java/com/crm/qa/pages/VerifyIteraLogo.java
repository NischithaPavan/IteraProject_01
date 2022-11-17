package com.crm.qa.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class VerifyIteraLogo extends TestBase{
	
	
 @FindBy(xpath="//img[@src='https://img2-327a.kxcdn.com/di1.ashx/245/1349259']")
	WebElement logo;
 
 
 public VerifyIteraLogo() throws IOException {
	 PageFactory.initElements(driver, this);
 }
 
 
	public String validateLoginPageTitle() {
		return driver.getTitle();
	}
	public boolean validateLogo() {
		return logo.isDisplayed();
		
	}
	
	

}
