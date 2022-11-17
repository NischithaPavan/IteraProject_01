package com.crm.qa.testcases;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.SignUpPage;

public class VerifySignUpPageTest extends TestBase {
	SignUpPage signuppage;
	
	public VerifySignUpPageTest() throws IOException {
		super();
	}
	@BeforeMethod
	public void setUp() throws IOException {
		initialization();
		signuppage=new SignUpPage();
		
	}
	@Test(priority=1)
	public void verifyAlltheFields() {
		signuppage.verifyAllFields();
		
	}
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
	
	

}
