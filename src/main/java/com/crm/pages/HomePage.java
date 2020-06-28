package com.crm.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.testbase.TestBase;

public class HomePage extends TestBase {

	public HomePage() throws IOException {
		super();
		// TODO Auto-generated constructor st
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//*[@id=\"top-header-menu\"]/div[3]/span[1]")
	WebElement userNameLabel;
	
	@FindBy(xpath="//*[@id=\"main-nav\"]/a[3]/span")
	WebElement contact;
	
	@FindBy(xpath="//*[@id=\"main-nav\"]/a[5]/span")
	WebElement deals;
	
	public String verifyHomePageTitle()
	{
		return driver.getTitle();
	}
	
	public ContactsPage clickOnContact() throws IOException
	{
		contact.click();
		return new ContactsPage();
	}
	
	public DealsPage clickOnDeals() throws IOException
	{
		deals.click();
		return  new DealsPage();
	}
	public Boolean verifyCorrectUserName()
	{
		return userNameLabel.isDisplayed();
	}
	
	

}
