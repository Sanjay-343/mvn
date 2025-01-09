package com.actitime.testscript;

import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.actitime.generic.BaseClass;
import com.actitime.generic.FileLib;
import com.actitime.pom.TaskListPage;

@Listeners(com.actitime.generic.ListenerImplementation.class)
public class CreateProject extends BaseClass {
	
	@Test
	public void testCreateProject()
	{
		
		FileLib f=new FileLib();
//		String pn=f.getExcelData("CreateCustomer", 1, 3);
//		String pd=f.getExcelData("CreateCustomer", 1, 3);

		Reporter.log("createProject", true);
		TaskListPage t=new TaskListPage(driver);
		t.getTaskListtab().click();
		t.getAddNewCustomerBtn().click();
		t.getSelectNewProject().click();
		t.getProjectName().sendKeys("Actitime");
		t.getProjectDescription().sendKeys("Banking Project");
		t.getSelectCustomerDD().click();
		t.getSelectHdfc001().click();
		t.getCreateProjectBtn().click();
	}

}
