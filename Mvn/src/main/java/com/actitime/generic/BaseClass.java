package com.actitime.generic;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;


public class BaseClass {
	
//	public WebDriver driver;
//	@Parameters("browser")
//	@BeforeClass
//	public void openBrowser()
//	{
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
//		driver=new ChromeDriver();
//		//driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		
//
//	}
//	
//	@BeforeMethod
//	public void login()
//	{
//		driver.get("http://localhost/login.do"); 
//
//		driver.findElement(By.id("username")).sendKeys("admin");
//		driver.findElement(By.name("pwd")).sendKeys("manager");
//		
//		driver.findElement(By.xpath("//div[text()='Login ']")).click();
//	}
//	
//	@AfterMethod
//	public void logout()
//	{
//		driver.findElement(By.id("logoutLink")).click();
//
//	}
//	
//	@AfterClass
//	public void closeBrowser()
//	{
//		driver.quit();
//	}

}
