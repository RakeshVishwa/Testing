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
	public @FindBy(linkText="Edit Customer") WebElement EditCustomer;
	
	public @FindBy(name="cusid") WebElement CustomerID;
	
	public @FindBy(name="AccSubmit") WebElement ASubmit;
	
	public @FindBy(name="addr") WebElement Eadd;
	
	public @FindBy(name="city") WebElement Ecity;
	
	public @FindBy(name="state") WebElement Estate;
	
	public @FindBy(name="pinno") WebElement Epin;
	
	public @FindBy(name="telephoneno") WebElement Ephone;
	
	public @FindBy(name="emailid") WebElement Eemail;
	
	public @FindBy(name="sub") WebElement Esubmit;
	
	
}
