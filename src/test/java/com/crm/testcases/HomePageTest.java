package com.crm.testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.pages.ContactsPage;
import com.crm.pages.HomePage;
import com.crm.pages.LoginPage;
import com.crm.testbase.TestBase;
import com.crm.utility.TestUtil;

public class HomePageTest extends TestBase {
	
	LoginPage loginPage;
	HomePage homePage;
	TestUtil testUtil;
	ContactsPage contactPage;

	public HomePageTest() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@BeforeMethod
	public void setUp() throws IOException
	{
		initialization();
		 testUtil = new TestUtil();
		 loginPage = new LoginPage();
		 homePage =loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
	}
	
	@Test
	public void verifyHomePageTitle()
	{
		String homePageTitle =homePage.verifyHomePageTitle();
		Assert.assertEquals("Cogmento CRM",homePageTitle );
	}
	
	@Test
	public void verifyUserName()
	{   testUtil.swtichToFrame();
		Boolean userName =homePage.verifyCorrectUserName();
		Assert.assertEquals("Tejas Toley", userName);
	}
	
	@Test
	public void verifyContactLink() throws IOException
	{
		testUtil.swtichToFrame();
		contactPage =homePage.clickOnContact();
	}
	
	
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}

}
