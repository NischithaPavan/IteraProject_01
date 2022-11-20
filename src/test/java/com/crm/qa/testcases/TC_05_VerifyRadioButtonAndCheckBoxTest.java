package com.crm.qa.testcases;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.TC_05_VerifyRadioButtonAndCheckBox;

import junit.framework.Assert;

public class TC_05_VerifyRadioButtonAndCheckBoxTest extends TestBase {
	TC_05_VerifyRadioButtonAndCheckBox verifyradiobuttonandcheckbox;
	
	
	public TC_05_VerifyRadioButtonAndCheckBoxTest() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}

	
	
	@BeforeMethod
	public void setup() throws IOException {
		initialization();
		verifyradiobuttonandcheckbox =new TC_05_VerifyRadioButtonAndCheckBox();
		
	
 }
	
//	@Test(priority=1)
//	public void verifyRadioAndSelectDropDownTest() throws InterruptedException {
//		verifyradiobuttonandcheckbox .clickOnTwoYearRadioBtn();
//		boolean b=verifyradiobuttonandcheckbox.clickOnTwoYearRadioBtn.isSelected();
//		Assert.assertFalse(b);
//		
//	}
	@Test(priority=2)
	public void clickOnTwoCheckBoxTest() throws InterruptedException {
		verifyradiobuttonandcheckbox.clickOnTwoCheckBox();
		Thread.sleep(5000);
		
	}
	@AfterMethod
	public void teardown() {
		driver.quit();
	}

}
