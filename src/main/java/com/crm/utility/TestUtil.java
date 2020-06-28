package com.crm.utility;

import java.io.IOException;

import com.crm.testbase.TestBase;

public class TestUtil extends TestBase {
	public TestUtil() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}

	public static long pageLoadTimeOut = 20;
	
	public void swtichToFrame()
	{
		driver.switchTo().frame("main panel");
	}

}
