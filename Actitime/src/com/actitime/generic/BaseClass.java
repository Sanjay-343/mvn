package com.actitime.generic;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import com.actitime.pom.HomePage;
import com.actitime.pom.LoginPage;

public class BaseClass {

	public WebDriver driver;
	//@Parameters("browser")
	@BeforeClass
	public void openBrowser()
	{
//		if(browser.equals("chrome"))
//		{
//			driver=new ChromeDriver();
//		}
//		else if(browser.equals("firefox"))
//		{
//			driver=new FirefoxDriver();
//		}
//		else if(browser.equals(browser))
//		{
//			driver=new EdgeDriver();
//		}
//		else
//		{
//			driver=new ChromeDriver();
//		}
		driver=new ChromeDriver();
		//driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		

	}
	
	@BeforeMethod
	public void login() throws IOException
	{
		FileLib f=new FileLib();
		LoginPage l=new LoginPage(driver);
		
		String url= f.getPropertyData("url");
		String un= f.getPropertyData("username");
		String pwd= f.getPropertyData("password");
        Reporter.log("Login",true);
		driver.get(url);
		l.setLogin(un, pwd);
		
	}
	
	@AfterMethod
	public void logout() 
	{
		
        HomePage h=new HomePage(driver);
        h.setLogout();
        Reporter.log("Logout",true);

		
	}
	
	@AfterClass
	public void closeBrowser()
	{
        Reporter.log("Browser Closed",true);

		driver.quit();
	}
}
