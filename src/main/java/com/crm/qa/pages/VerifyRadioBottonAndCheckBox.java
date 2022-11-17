package com.crm.qa.pages;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;
import com.crm.qa.util.TestUtil;

public class VerifyRadioBottonAndCheckBox extends TestBase{
	
	@FindBy(xpath="//input[@id='female']")
	public WebElement clickOnfemaleRadioBtn;
	
	@FindBy(xpath="//input[@id='monday']")
	public WebElement clickOnMonday;
	
    @FindBy(xpath="//input[@type='checkbox' and contains(@id,'day')]")
	public List<WebElement> selectAllCheckbox;
	

	
	public VerifyRadioBottonAndCheckBox() throws IOException {
		PageFactory.initElements(driver,this);
	}
	
	//Select specific checkbox
	public void clickonMondayCheckbox() {
		
		TestUtil.click(clickOnMonday, driver);
		
	}
	
	//select All checkbox
	public void clickOnAllCheckbox() throws InterruptedException {
		
		System.out.println(selectAllCheckbox.size());
		for(WebElement chbox:selectAllCheckbox) {
			TestUtil.click(chbox, driver);
		}
		
	}

	
	
}
