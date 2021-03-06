package com.TestData;

import com.CommonFunction.CommonFunction;

public class NewCustomerTestData {
	
	static String FirstName = "Rakes Pal";
	
	static String DOB = "13081997";
	
	static String Address = "Anand Nagar";
	
	static String City = "Mumbai";
	
	static String State = "Maharashtra";
	
	static String Pin = "401189";
	
	static String Phone = CommonFunction.randomNumeric(10);
	
	static String EmailID = "Ra"+CommonFunction.randomAlphaNumeric(4)+"@gmail.com";

	static String Password = "Cby@2020";
	
	//Getter Method for New Customer Test Data
	public static String getFirstName()
	{
		return FirstName;
	}
	
	public static String getDOB()
	{
		return DOB;
	}
	
	public static String getAddress()
	{
		return Address;
	}
	
	public static String getCity()
	{
		return City;
	}
	
	public static String getState()
	{
		return State;
	}
	
	public static String getPin()
	{
		return Pin;
	}
	
	public static String getPhone()
	{
		return Phone;
	}
	
	public static String getEmailID()
	{
		return EmailID;
	}
	
	public static String getPassword()
	{
		return Password;
	}
}
