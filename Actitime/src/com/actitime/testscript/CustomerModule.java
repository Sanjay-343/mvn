package com.actitime.testscript;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.actitime.generic.BaseClass;
import com.actitime.generic.FileLib;
import com.actitime.pom.TaskListPage;

@Listeners(com.actitime.generic.ListenerImplementation.class)
public class CustomerModule extends BaseClass {

	@Test
	public void testCreateCustomer() throws InterruptedException, EncryptedDocumentException, IOException
	{

		FileLib f=new FileLib();
		//		String cn=f.getExcelData("CreateCustomer", 1, 3);
		//		String cd=f.getExcelData("CreateCustomer", 1, 3);


		Reporter.log("createCustomer", true);
		TaskListPage t=new TaskListPage(driver);
		t.getTaskListtab().click();
		t.getAddNewCustomerBtn().click();
		t.getSelectNewCustomer().click();
		t.getCustomerName().sendKeys("HDFC_001");
		t.getCustomerDescription().sendKeys("Banking Project");
		t.getActiveCustomerDD().click();
		t.getSelectOurCompany().click();
		t.getCreateCustBtn().click();


	}
	
	@Test
	public void testDeleteCustomer() throws InterruptedException 
	{
		Reporter.log("deleteCustomer", true);

		TaskListPage t=new TaskListPage(driver);
		t.getTaskListtab().click();
        t.getSettingsBtn().click();
        Thread.sleep(2000);
        t.getActionBtn().click();
        t.getDeleteBtn().click();
        t.getDeletePermBtn().click();
	}


}
