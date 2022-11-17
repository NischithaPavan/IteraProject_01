package com.crm.qa.testcases;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.VerifyRadioBottonAndCheckBox;

public class VerifyRadioBottonAndCheckBoxTest extends TestBase {
	
	VerifyRadioBottonAndCheckBox verifycheckbox;
  
	public VerifyRadioBottonAndCheckBoxTest() throws IOException {
		super();
		
	}
	@BeforeMethod
	public void setup() throws IOException {
		initialization();
		verifycheckbox=new VerifyRadioBottonAndCheckBox();
		
		
	}
	
	/*@Test(priority=1)
	public void verifyClickOnSpecficCheckbox() {
		verifycheckbox.clickonMondayCheckbox();
		boolean b=verifycheckbox.clickOnMonday.isSelected();
		Assert.assertTrue(b,"Checkbox not selected");
		
	}*/
 
	@Test(priority=2)
	public void verifyAllCheckBox() throws InterruptedException {
		
	verifycheckbox.clickOnAllCheckbox();
	
	
	
		
	}
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
}
