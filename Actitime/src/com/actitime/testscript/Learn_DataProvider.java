package com.actitime.testscript;

import org.testng.annotations.DataProvider;

public class Learn_DataProvider {
	
	@DataProvider
	public Object[][] getData()
	{
		Object[][] data= {{"Admin","admin123"},{"Rohit","Sharma"},{"Modhi","Rahul"},{"Selenium","Qtp"}};
		
		return data;
	}

}
