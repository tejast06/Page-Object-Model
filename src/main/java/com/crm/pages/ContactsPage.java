package com.crm.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.crm.testbase.TestBase;

public class ContactsPage extends TestBase {

	public ContactsPage() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(xpath="//*[@id=\"dashboard-toolbar\"]/div[1]")
	WebElement contactLabel;
	
	public void verifyContactLabel()
	{
		contactLabel.isDisplayed();
	}

}
