package com.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NewAccountPage {
	
		
		WebDriver Adriver;
		
		public NewAccountPage(WebDriver Cdriver)
		{
			Adriver=Cdriver;
			PageFactory.initElements(Cdriver, this);
			
		}
		public @FindBy(linkText="New Account") WebElement AAccount;
		
		public @FindBy(name="cusid") WebElement NAcccount;
		
		public @FindBy(name="selaccount") WebElement AType;
		
		public @FindBy(name="inideposit") WebElement ADeposite;
		
		public @FindBy(name="button2") WebElement ASubmit;
		
		

}
