package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TaskListPage {
	
	@FindBy(xpath="//div[text()='TASKS']")
	private WebElement taskListtab;
	
	@FindBy(xpath="//div[text()='Add New']")
	private WebElement addNewCustomerBtn;
	
	@FindBy(xpath="//div[text()='+ New Customer']")
	private WebElement selectNewCustomer;
	
	@FindBy(xpath="//div[text()='+ New Project']")
	private WebElement selectNewProject;
	
	@FindBy(id="customerLightBox_nameField")
	private WebElement customerName;
	
	@FindBy(id="projectPopup_projectNameField")
	private WebElement projectName;

	@FindBy(id="customerLightBox_descriptionField")
	private WebElement customerDescription;
	
	@FindBy(id="projectPopup_projectDescriptionField")
	private WebElement projectDescription;
	
	@FindBy(xpath="//button[contains(text(),'active customer')]")
	private WebElement activeCustomerDD;
	
	@FindBy(xpath="//button[contains(text(),'Select Customer')]")
	private WebElement selectCustomerDD;
	
	@FindBy(xpath="//a[text()='Media Agency']")
	private WebElement selectOurCompany;
	
	@FindBy(xpath="//a[text()='Boston Chocolate']")
	private WebElement selectHdfc001;
	
	@FindBy(xpath="//span[text()='Create Customer']")
	private WebElement createCustBtn;
	
	@FindBy(xpath="//span[text()='Create Project']")
	private WebElement createProjectBtn;
	
	
	// Code for Deleting Customer
	
	@FindBy(xpath="//div[text()='HDFC_001 ']/..//div[@class='editButton available']")  
	private WebElement settingsBtn;
	
	
	@FindBy(xpath="(//div[text()='ACTIONS'])[1]")
	private WebElement actionBtn;
	
	@FindBy(xpath="(//div[text()='Delete'])[1]")
	private WebElement deleteBtn;
	
	@FindBy(id="customerPanel_deleteConfirm_submitTitle")
	private WebElement deletePermBtn;
	
	
	public TaskListPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement getTaskListtab() {
		return taskListtab;
	}

	public WebElement getAddNewCustomerBtn() {
		return addNewCustomerBtn;
	}

	public WebElement getSelectNewCustomer() {
		return selectNewCustomer;
	}

	public WebElement getCustomerName() {
		return customerName;
	}

	public WebElement getCustomerDescription() {
		return customerDescription;
	}

	public WebElement getActiveCustomerDD() {
		return activeCustomerDD;
	}

	public WebElement getSelectOurCompany() {
		return selectOurCompany;
	}

	public WebElement getCreateCustBtn() {
		return createCustBtn;
	}

	public WebElement getSelectNewProject() {
		return selectNewProject;
	}

	public WebElement getProjectName() {
		return projectName;
	}

	public WebElement getProjectDescription() {
		return projectDescription;
	}

	public WebElement getSelectCustomerDD() {
		return selectCustomerDD;
	}

	public WebElement getSelectHdfc001() {
		return selectHdfc001;
	}

	public WebElement getCreateProjectBtn() {
		return createProjectBtn;
	}

	public WebElement getSettingsBtn() {
		return settingsBtn;
	}

	public WebElement getActionBtn() {
		return actionBtn;
	}

	public WebElement getDeleteBtn() {
		return deleteBtn;
	}

	public WebElement getDeletePermBtn() {
		return deletePermBtn;
	}
	

}
