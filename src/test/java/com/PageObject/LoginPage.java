package com.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	WebDriver ldriver;
	
	public LoginPage(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
		
	}
	
	public @FindBy(name="uid") WebElement txtUserName;
	
	public @FindBy(name="password") WebElement txtPassword;
	
	public @FindBy(name="btnLogin") WebElement Lbutton;
}
