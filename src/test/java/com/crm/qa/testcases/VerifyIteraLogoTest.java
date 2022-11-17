package com.crm.qa.testcases;

import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.VerifyIteraLogo;

public class VerifyIteraLogoTest extends TestBase{
	
	VerifyIteraLogo itlogo;
	
	
	public VerifyIteraLogoTest() throws IOException {
		super();
	}
	
	@BeforeMethod
	public void setUp() throws IOException {
		initialization();
		itlogo=new VerifyIteraLogo();
		
	}
	
	@Test(priority=1)
	public void verifylogoTest() {
		
		boolean b=itlogo.validateLogo();
		assertTrue(b);
	}
	
	@Test(priority=2)
	public void verifyPageTitle() {
		String title=driver.getTitle();
		
		Assert.assertEquals(title,"- Testautomation practice page","Title is not matching");
		
	}
	
	
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
