package com.crm.qa.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;
import com.crm.qa.util.TestUtil;

public class SignUpPage extends TestBase{
	
	
		// TODO Auto-generated constructor stub
	

	@FindBy(xpath="//input[@id='name']")
	WebElement name;
	
	@FindBy(xpath="//input[@id='phone']")
	WebElement phone;
	
	@FindBy(xpath="//input[@id='email']")
	WebElement email;
	
	@FindBy(xpath="//input[@id='password']")
	WebElement password;
	
	@FindBy(xpath="//textarea[@id='address']")
	WebElement address;
	@FindBy(xpath="//button[text()='Submit']")
	WebElement submitbtn;
	

public SignUpPage() throws IOException {
	
	PageFactory.initElements(driver, this);
	
}

 public void verifyAllFields() {
	 TestUtil.sendkeys(name,"Nischitha", driver);
	 TestUtil.sendkeys(phone,"7349374088", driver);
	 TestUtil.sendkeys(email,"Nischitha.hs89@gmail.com", driver);
	 TestUtil.sendkeys(password,"Ni@123", driver);
	 TestUtil.sendkeys(address,"Soap factory layout", driver);
	 TestUtil.click(submitbtn, driver);

 }

}