package com.crm.qa.testcases;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.TC_04_VerifySelectDropDown;

public class TC_04_VerifySelectDropDownTest extends TestBase{

	

	TC_04_VerifySelectDropDown verifyselectdropdown1;
	
	public TC_04_VerifySelectDropDownTest() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	@BeforeMethod
	public void setup() throws IOException {
		initialization();
		verifyselectdropdown1=new TC_04_VerifySelectDropDown();
	}
	
	@Test(priority=1)
	public void VerifyseletdropdownTest() throws InterruptedException {
		verifyselectdropdown1.verifyselectdropdown();
		
	}
	@Test(priority=2)
	public void VerifyWithoutUsingSelectMethods() throws InterruptedException {
		verifyselectdropdown1.selectDropDownWithoutUsingSelectClass();
	}
	@AfterMethod
	public void teardown() {
		driver.quit();
	}
}
