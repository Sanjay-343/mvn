package com.actitime.testscript;

import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.actitime.generic.BaseClass;
import com.actitime.pom.UsersPage;

@Listeners(com.actitime.generic.ListenerImplementation.class)
public class CreateUser extends BaseClass {
	
	@Test
	public void createUser()
	{
        Reporter.log("createUser",true);

		UsersPage u=new UsersPage(driver);
		u.getUserPageTab().click();
		u.getAddUserBtn().click();
		u.getFnTxtFld().sendKeys("Sanjay");
		u.getLnTxtFld().sendKeys("Arali");
		u.getEmlTxtFld().sendKeys("san@gmail.com");
		u.getUnTxtFld().sendKeys("san0300?");
		u.getPwdTxtFld().sendKeys("san0300??");
		u.getReTypPwd().sendKeys("san0300??");
		u.getCrtUserBtn().click();
	}

}
