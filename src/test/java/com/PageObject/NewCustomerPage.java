package com.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NewCustomerPage {
	
	WebDriver pdriver;
	
	public NewCustomerPage(WebDriver ndriver)
	{
		pdriver=ndriver;
		PageFactory.initElements(ndriver, this);
		
	}
	public @FindBy(linkText="New Customer") WebElement NewCustome;
	
	public @FindBy(name="name") WebElement txtFirstName;
	
	public @FindBy(name="rad1") WebElement Dropdown;
	
	public @FindBy(name="addr") WebElement txtAddress;
	
	public @FindBy(name="city") WebElement txtCity;
	
	public @FindBy(name="state") WebElement txtState;
	
	public @FindBy(name="pinno") WebElement txtPin;
	
	public @FindBy(name="telephoneno") WebElement txtPhone;
	
	public @FindBy(name="password") WebElement txtPassword;
	
	public @FindBy(name="sub") WebElement Csubmit;
	
	public @FindBy(name="dob") WebElement DOB;
	
	public @FindBy(name="emailid") WebElement Emailid;

}
