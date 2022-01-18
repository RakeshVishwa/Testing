package com.TestCase;

import org.testng.annotations.Test;

import com.CommonFunction.CommonFunction;
import com.PageObject.EditCustomer;
import com.TestData.EditCustomerTestData;

public class TC_EditCustomer_003 extends BaseClass{
	
	
	@Test
	public static void EditCustomerlogin()
	{
		EditCustomer EC=new EditCustomer(driver);
		
		
		CommonFunction.click(EC.EditCustomer);
		
		 try 
		 { 
			 Thread.sleep(5000);
			 } 
		 catch (Exception e) 
		 { 
			 // TODO: handle exception 
		 }
		 
		 CommonFunction.enterText(EC.CustomerID, EditCustomerTestData.getECustomerid());
		 
		 CommonFunction.click(EC.ASubmit);
		 
		 CommonFunction.clear(EC.Eadd);
		 
		 CommonFunction.enterText(EC.Eadd, EditCustomerTestData.getEAddress());
		 
		 CommonFunction.clear(EC.Ecity);
		 
		 CommonFunction.enterText(EC.Ecity, EditCustomerTestData.getECity());
		 
		 CommonFunction.clear(EC.Estate);
		 
		 CommonFunction.enterText(EC.Estate, EditCustomerTestData.getEState());
		 
		 CommonFunction.clear(EC.Epin);
		 
		 CommonFunction.enterText(EC.Epin, EditCustomerTestData.getEPin());
		 
		 CommonFunction.clear(EC.Ephone);
		 
		 CommonFunction.enterText(EC.Ephone, EditCustomerTestData.getEphone());
		 
		 CommonFunction.clear(EC.Eemail);
		 
		 CommonFunction.enterText(EC.Eemail, EditCustomerTestData.getEMail());
		 
		 CommonFunction.click(EC.Esubmit);
		 
		 driver.switchTo().alert().dismiss();
	}

}
