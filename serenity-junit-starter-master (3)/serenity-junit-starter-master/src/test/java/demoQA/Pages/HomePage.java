package demoQA.Pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import demoQA.Utils.CommonFunctions;
import demoQA.Utils.SeleniumFunctions;

import net.serenitybdd.core.pages.PageObject;


public class HomePage extends PageObject{
	
	CommonFunctions common_functions;
	SeleniumFunctions selenium_functions;
	
	@FindBy(xpath ="//h5[contains(text(),'Elements')]")
	private WebElement Elements;
	
	@FindBy(xpath ="//h5[contains(text(),'Forms')]")
	private WebElement Forms;
	
	@FindBy(xpath ="//h5[contains(text(),'Alerts, Frame & Windows')]")
	private WebElement AlertFramesAndWindows;
	
	@FindBy(xpath ="//h5[contains(text(),'Widgets')]")
	private WebElement Widgets;
	
	@FindBy(xpath ="//h5[contains(text(),'Interactions')]")
	private WebElement Interactions;
	
	@FindBy(xpath ="//h5[contains(text(),'Book Store Application')]")
	private WebElement BookStoreApplication;
	
	public void verifyElementsTab(){
		selenium_functions.isElementPresent(Elements);
		common_functions.clickOnElement(Elements);
//		Assert.assertTrue("Elements tab didn't open", (getDriver().getCurrentUrl()).equalsIgnoreCase("https://demoqa.com/elements"));
		
	}

}
