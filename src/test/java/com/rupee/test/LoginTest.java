package com.rupee.test;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoginTest {
	
	@Test
	public static void LogTest(){
		System.out.println("Login");
	}
	
	@Test
	public static void DetailsTest(){
		System.out.println("Details");
	}
	
	@BeforeTest
	public static void openBrowser(){
		System.out.println("Opening Browser");
	}
	
	@AfterTest
	public static void closeBrowser(){
		System.out.println("Closing Browser");
	}
	
	@AfterSuite
	public static void closeSession(){
		System.out.println("Shutting selenium server");
	}
	
	@BeforeSuite
	public static void openSession(){
		System.out.println("Starting selenium server");
	}
	
	@DataProvider
	public Object[][] getData(){
		Object[][] data = new Object[2][2];
		data[0][0] = "me";
		data[0][1] = "pass";
		
		data[1][0] = "you";
		data[1][1] = "door";
		
		return data;
	}
	
	@Test(dataProvider = "getData")
	public void fillForm(String user, String pwd){
		System.out.println(user + " - " + pwd);
	}

}
