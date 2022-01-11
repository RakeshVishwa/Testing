package com.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EditCustomer {
	
	WebDriver Edriver;
	
	public EditCustomer(WebDriver EDdriver)
	{
		Edriver=EDdriver;
		PageFactory.initElements(EDdriver, this);
		
	}
	
	@FindBy(name="cusid") WebElement CustomerID;

}
