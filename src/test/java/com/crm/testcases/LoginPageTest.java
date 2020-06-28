package com.crm.testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.pages.HomePage;
import com.crm.pages.LoginPage;
import com.crm.testbase.TestBase;

public class LoginPageTest extends TestBase {
	LoginPage loginPage;
	HomePage homePage;

	public LoginPageTest() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@BeforeMethod
	public void setUp() throws IOException
	{
		initialization();
		 loginPage = new LoginPage();
	}
	
	@Test
	public void validateTitleTest()
	{
		String title =loginPage.validateLoginPageTitle();
		Assert.assertEquals("Cogmento CRM", title);
	}
	
	@Test
	public void loginTest() throws IOException
	{
		homePage =loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
	}
	
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}

}
