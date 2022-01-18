package com.TestData;

import com.CommonFunction.CommonFunction;

public class EditCustomerTestData {
	
	static String ECustomerid = "75508";
	
	static String EAddress = "Bheram Baug";
	
	static String ECity = "Mumbai";
	
	static String EState = "UP";
	
	static String EPin = "400102";
	
	static String EPhone = CommonFunction.randomNumeric(10);
	
	static String EMail = "Ya"+CommonFunction.randomAlphaNumeric(5)+"@gmail.com";
	
	
	public static String getECustomerid()
	{
		return ECustomerid;
	}
	
	public static String getEAddress()
	{
		return EAddress;
	}
	
	public static String getECity()
	{
		return ECity;
	}
	
	public static String getEState()
	{
		return EState;
	}
	
	public static String getEPin()
	{
		return EPin;
	}
	
	public static String getEphone()
	{
		return EPhone;
	}
	
	public static String getEMail()
	{
		return EMail;
	}

}
