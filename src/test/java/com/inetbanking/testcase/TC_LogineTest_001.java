package com.inetbanking.testcase;

import org.testng.Assert;
import org.testng.annotations.Test;
import com.iNetbank.pageObject.Login;

public class TC_LogineTest_001 extends BaseClass {
	
	@Test
	public void  LogineTest() {
		driver.get(baseUrl);
		Login lp= new Login(driver);
		lp.setUserName(username);
		lp.setpassword(password);
		lp.clickbutton();
		
		if (driver.getTitle().equals("Guru99 Bank Manager HomePage"))
		{
			Assert.assertTrue(true);
		}
		else
		{
			Assert.assertTrue(false);
		}
		
		
	}
	
}
