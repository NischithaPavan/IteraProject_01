package com.crm.qa.pages;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.crm.qa.base.TestBase;
import com.crm.qa.util.TestUtil;

public class TC_05_VerifyRadioButtonAndCheckBox extends TestBase {
	
	
	

	 @FindBy(xpath="//input[@type='radio' and @id='2years']/following-sibling::label")
	public WebElement clickOnTwoYearRadioBtn;

	 @FindBy(xpath="//input[@type='checkbox']/following-sibling::label[@class='custom-control-label']")
	 public List<WebElement> clickOnCheckBox;
	
	public TC_05_VerifyRadioButtonAndCheckBox() throws IOException {
		super();
		PageFactory.initElements(driver,this);
		// TODO Auto-generated constructor stub
	}
	
	public void clickOnTwoYearRadioBtn() throws InterruptedException {
		TestUtil.scrollDown(driver);
		Thread.sleep(6000);
		TestUtil.click(clickOnTwoYearRadioBtn, driver);
		Thread.sleep(6000);
	}
	public void clickOnTwoCheckBox() throws InterruptedException {
		TestUtil.scrollDown(driver);
		System.out.println(clickOnCheckBox.size());
		
		for(WebElement chkbox:clickOnCheckBox) {
			
		if(chkbox.getText().equalsIgnoreCase("Selenium Webdriver") || chkbox.getText().equalsIgnoreCase("TestNG")) {
				
			   TestUtil.click(chkbox, driver);
			   Thread.sleep(3000);
			
			
				}
		
			}
			
		}
		
	}


	


