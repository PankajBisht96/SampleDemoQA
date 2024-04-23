package demoQA.PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import demoQA.utilities.CommonFunctions;
import demoQA.utilities.WebdriverUtilities;

public class ElementsPage extends WebdriverUtilities {

	static CommonFunctions common_functions;

	@FindBy(xpath = "//span[text()='Text Box']")
	private WebElement TextBox;

	@FindBy(xpath = "//span[text()='Check Box']")
	private WebElement CheckBox;

	// --------------------------------TextBox---------------------------------------------

	@FindBy(xpath = "//input[@id='userName']")
	private WebElement FullName;

	@FindBy(xpath = "//input[@id='userEmail']")
	private WebElement Email;

	@FindBy(xpath = "//textarea[@id='currentAddress']")
	private WebElement CurrentAddress;

	@FindBy(xpath = "//textarea[@id='permanentAddress']")
	private WebElement PermanentAddress;

	@FindBy(xpath = "//button[@id='submit']")
	private WebElement SubmitButton;
	

	// -------------------------------CheckBox---------------------------------------------
	
	// --------------------------------TextBox Methods--------------------------------------
	
	public void addTextBoxDetails()
	{
		
	}
	
}
