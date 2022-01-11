package com.Utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {
	
	static Properties pro;
	
	public ReadConfig()
	{
		File src=new File("C:\\WorkSpace-Eclipse\\allFramework\\Configure\\config.properties");
		
		try
		{
			FileInputStream fis= new FileInputStream(src);
			pro= new Properties();
			
			pro.load(fis);
		}
		catch (Exception e) 
		{
			System.out.println("Exception is : "+e.getMessage());
		}
	}
	public static String getChromepath()
	{
		String chromepath=pro.getProperty("Chromepath");
		return chromepath;
	}
	public static String getApplicationUrl()
	{
		String url=pro.getProperty("baseurl");
		return url;
	}
	
	public static String getApplicationUsername()
	{
		String username=pro.getProperty("Username");
		return username;
	}
	
	public static String getApplicationPassword()
	{
		String password=pro.getProperty("Password1");
		return password;
	}
	
	public static String getFirstName()
	{
		String firstname=pro.getProperty("Firstname");
		return firstname;
	}
	
	public static String getDOB()
	{
		String DOB=pro.getProperty("DOB");
		return DOB;
	}
	
	public static String getAddress()
	{
		String address=pro.getProperty("Address");
		return address;
	}
	
	public static String getCity()
	{
		String city=pro.getProperty("City");
		return city;
	}
	
	public static String getState()
	{
		String state=pro.getProperty("State");
		return state;
	}
	
	public static String getPin()
	{
		String pin=pro.getProperty("Pin");
		return pin;
	}
	
	public static String getPhone()
	{
		String phone=pro.getProperty("Phone");
		return phone;
	}
	
	public static String getEmailid()
	{
		String email=pro.getProperty("EMAIL");
		return email;
	}
	
	public static String getPassword()
	{
		String password=pro.getProperty("Password");
		return password;
	}
	

	
	

}
