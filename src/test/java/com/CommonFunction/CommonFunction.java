package com.CommonFunction;
import org.openqa.selenium.WebElement;

public class CommonFunction {
	
	
	
	
	
	

	public static void enterText(WebElement locaElement, String value)
	{
		locaElement.sendKeys(value);

	}

	public static void click(WebElement locaElement) {
		locaElement.click();

	}
	
}
