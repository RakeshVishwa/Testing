package com.TestData;

public class LoginTestData {
	
	static String Chromepath="D:\\GitWorkSpace\\Testing\\Drivers\\chromedriver.exe";
	
	//static String NewChromepath= "D:\\WorkSpace_GitProjects\\com.OrangeHRM\\Drivers\\chromedriver.exe";	
	
	static String ApplicationURL = "http://demo.guru99.com/V4";
	
	static String ApplicationUsername = "mngr377519";
	
	static String ApplicationPassword = "EpAranu";
	
	//Getter Method for Login Test Data
	
	public static String getChrompath()
	{
		return Chromepath;
	}
	
	public static String getApplicationUrl()
	{
		return ApplicationURL;
	}
	
	public static String getApplicationUsername()
	{
		return ApplicationUsername;
	}
	
	public static String getApplicationPassword()
	{
		return ApplicationPassword;
	}
	

}
