package com.actitime.testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class LoginToActitime {
	@Test
	public void testlogin()
	{
		WebDriver driver= new ChromeDriver();
		Reporter.log("MVN Project",true);
//		driver.get("http://localhost/login.do"); 
//		System.out.println(driver.getTitle());
//		
//		driver.findElement(By.id("username")).sendKeys("admin");
//		driver.findElement(By.name("pwd")).sendKeys("manager");
//		
//		driver.findElement(By.xpath("//div[text()='Login ']")).click();
	driver.quit();
	}

}
