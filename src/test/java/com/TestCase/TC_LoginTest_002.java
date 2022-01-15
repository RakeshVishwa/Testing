package com.TestCase;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.CommonFunction.CommonFunction;
import com.PageObject.NewCustomerPage;
import com.TestData.NewCustomerTestData;

public class TC_LoginTest_002 extends BaseClass {
	
	
	@Test
	public static void NewCustomer()
	{
		NewCustomerPage Ns=new NewCustomerPage(driver);
		
		
		
		CommonFunction.click(Ns.NewCustome);
		
		
		 try 
		 { 
			 Thread.sleep(5000);
			 } 
		 catch (Exception e) 
		 { 
			 // TODO: handle exception 
		 }
		 
		CommonFunction.enterText(Ns.txtFirstName, NewCustomerTestData.getFirstName());
		
		CommonFunction.enterText(Ns.DOB, NewCustomerTestData.getDOB());
		
		CommonFunction.click(Ns.Dropdown);
		
		CommonFunction.enterText(Ns.txtAddress, NewCustomerTestData.getAddress());
		
		CommonFunction.enterText(Ns.txtCity, NewCustomerTestData.getCity());
		
		CommonFunction.enterText(Ns.txtState,NewCustomerTestData.getState());
		
		CommonFunction.enterText(Ns.txtPin, NewCustomerTestData.getPin());
		
		CommonFunction.enterText(Ns.txtPhone, NewCustomerTestData.getPhone());
		
		CommonFunction.enterText(Ns.Emailid, NewCustomerTestData.getEmailID());
		
		CommonFunction.enterText(Ns.txtPassword, NewCustomerTestData.getPassword());
		
		CommonFunction.enterText(Ns.txtCity, NewCustomerTestData.getCity());
		
		CommonFunction.click(Ns.Csubmit);
		
		if(driver.getTitle().equals("Guru99 Bank Customer Registration Page"))
		{
			Assert.assertTrue(true);
			//boolean flag= true;
			
			System.out.println("Test Case Passed");
		}
		else
		{
			Assert.assertTrue(false);
		}
	}
	}
