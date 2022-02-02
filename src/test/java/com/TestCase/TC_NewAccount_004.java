package com.TestCase;

import org.testng.annotations.Test;

import com.CommonFunction.CommonFunction;
import com.PageObject.NewAccountPage;
import com.TestData.AccountAddTestData;

public class TC_NewAccount_004 extends BaseClass {
	
	@Test
	public static void NewAccountlogin()
	{
		NewAccountPage Na= new NewAccountPage(driver);
		
		CommonFunction.click(Na.AAccount);
		
		 try 
		 { 
			 Thread.sleep(5000);
			 } 
		 catch (Exception e) 
		 { 
			 // TODO: handle exception 
		 }
		 
		 CommonFunction.enterText(Na.NAcccount, AccountAddTestData.getECustomerid());
		 
		 CommonFunction.click(Na.AType);
		 
		 CommonFunction.enterText(Na.ADeposite, AccountAddTestData.getADeposite());
		 
		 CommonFunction.click(Na.ASubmit);
	
	
	}	

}
