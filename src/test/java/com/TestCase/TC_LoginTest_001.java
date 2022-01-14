package com.TestCase;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TC_LoginTest_001 extends BaseClass
{

	@Test
	public void loginTest()
	{
		//Add Validation
		if(driver.getTitle().equals("Guru99 Bank Manager HomePage"))
		{
			Assert.assertTrue(true);
			//boolean flag= true;
			
			System.out.println("Test Case Passed");
		}
		else
		{
			Assert.assertTrue(false);
			
			System.out.println("Test Case Failed");
		}
	}	
}
