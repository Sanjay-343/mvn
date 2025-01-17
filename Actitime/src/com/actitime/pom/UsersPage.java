package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UsersPage {
	
	@FindBy(xpath="//div[text()='USERS']")
	private WebElement userPageTab;
	
	@FindBy(xpath="//div[text()='Add User']")
	private WebElement addUserBtn;
	
	@FindBy(name="firstName")
	private WebElement fnTxtFld;
	
	@FindBy(name="lastName")
	private WebElement lnTxtFld;
	
	@FindBy(name="email")
	private WebElement emlTxtFld;
	
	@FindBy(name="username")
	private WebElement unTxtFld;
	
	@FindBy(name="password")
	private WebElement pwdTxtFld;
	
	@FindBy(name="passwordCopy")
	private WebElement reTypPwd;
	
	@FindBy(xpath="//span[text()='Create User']")
	private WebElement crtUserBtn;
	
	public UsersPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement getUserPageTab() {
		return userPageTab;
	}

	public WebElement getAddUserBtn() {
		return addUserBtn;
	}

	public WebElement getFnTxtFld() {
		return fnTxtFld;
	}

	public WebElement getLnTxtFld() {
		return lnTxtFld;
	}

	public WebElement getEmlTxtFld() {
		return emlTxtFld;
	}

	public WebElement getUnTxtFld() {
		return unTxtFld;
	}

	public WebElement getPwdTxtFld() {
		return pwdTxtFld;
	}

	public WebElement getReTypPwd() {
		return reTypPwd;
	}

	public WebElement getCrtUserBtn() {
		return crtUserBtn;
	}
	

}
