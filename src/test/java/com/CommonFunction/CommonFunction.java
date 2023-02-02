package com.CommonFunction;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;



public class CommonFunction {

	public static WebDriver driver;

	private static final String ALPHA_NUMERIC_STRING = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
	
	  private static final String ALPHA_STRING = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	  private static final String NUMERIC_STRING1 = "0123456789"; 
	private static final String NUMERIC_STRING = "0123456789";


	//add

	

	public static void MouseHover(Actions localElement)
	{
		Actions act= new Actions(driver);
		localElement=act;
		localElement.perform();

	}

	public static void enterText(WebElement locaElement, String value)
	{
		locaElement.sendKeys(value);

	}

	public static void click(WebElement locaElement) {
		locaElement.click();

	}

	public static void clear(WebElement localElement)
	{
		localElement.clear();
	}




	//private static final String SPECIAL_CHARS_STRING = "�&?��<>%=�!";


	public static String randomAlphaNumeric(int count) {
		StringBuilder builder = new StringBuilder();
		while (count-- != 0) {
			int character = (int)(Math.random()*ALPHA_NUMERIC_STRING.length());
			builder.append(ALPHA_NUMERIC_STRING.charAt(character));
		}
		return builder.toString();
	}

	public static String randomNumeric(int count) {
		StringBuilder builder = new StringBuilder();
		while (count-- != 0) {
			int character = (int)(Math.random()*NUMERIC_STRING.length());
			builder.append(NUMERIC_STRING.charAt(character));
		}
		return builder.toString();
	}
	
	public static String randomAlpha(int count) {
		StringBuilder builder = new StringBuilder();
		while (count-- != 0) {
			int character = (int)(Math.random()*ALPHA_STRING.length());
			builder.append(ALPHA_STRING.charAt(character));
		}
		return builder.toString();
	}

	public static String randomNumericString(int count) {
		StringBuilder builder = new StringBuilder();
		while (count-- != 0) {
			int character = (int)(Math.random()*NUMERIC_STRING1.length());
			builder.append(NUMERIC_STRING1.charAt(character));
		}
		return builder.toString();
	}

}
