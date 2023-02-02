package com.TestCase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.CommonFunction.CommonFunction;
import com.PageObject.LoginPage;
import com.TestData.LoginTestData;

import io.github.bonigarcia.wdm.WebDriverManager;


public class BaseClass {

	
	
	
	public static WebDriver driver;
	
	
	@BeforeTest
	public void setup()
	{
		
//		System.setProperty("webdriver.chrome.driver", LoginTestData.getChrompath());
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(LoginTestData.getApplicationUrl());
		
        LoginPage lp=new LoginPage(driver);
		
		CommonFunction.enterText(lp.txtUserName, LoginTestData.getApplicationUsername());
		
		CommonFunction.enterText(lp.txtPassword, LoginTestData.getApplicationPassword());
		
		CommonFunction.click(lp.Lbutton);
		
		
	}

	//After method
	@AfterTest
	public void tearDown()
	{
		driver.quit();
	}
}
