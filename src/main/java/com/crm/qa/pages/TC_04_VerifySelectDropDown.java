package com.crm.qa.pages;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.crm.qa.base.TestBase;
import com.crm.qa.util.TestUtil;

public class TC_04_VerifySelectDropDown extends TestBase{
	
	
	@FindBy(xpath="//select[@class='custom-select']")
	public WebElement selectDropDown;
	
	
	public TC_04_VerifySelectDropDown() throws IOException {
		PageFactory.initElements(driver, this);
		
	}
		// TODO Auto-generated constructor stub
	
	public void verifyselectdropdown() throws InterruptedException {
		TestUtil.scrollDown(driver);
		
		TestUtil.selectValueFromDropDownBy(driver, selectDropDown);
		
	}
	// select drop down without using methods
	
	public void selectDropDownWithoutUsingSelectClass() throws InterruptedException {
		
		Select sel1=new Select(selectDropDown);
		List<WebElement>alloptions=sel1.getOptions();
		for(WebElement opt:alloptions) {
			if(opt.getText().equalsIgnoreCase("Norway")) {
				TestUtil.click(opt, driver);
				break;
				
			}
		}
		
		
	}
	
	
	

}
