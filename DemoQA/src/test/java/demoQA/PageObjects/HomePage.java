package demoQA.PageObjects;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import demoQA.utilities.CommonFunctions;
import demoQA.utilities.SeleniumFunctions;
import demoQA.utilities.WebdriverUtilities;

public class HomePage extends WebdriverUtilities {
	
	CommonFunctions common_functions = new CommonFunctions();
	SeleniumFunctions SeleniumFunctions = new SeleniumFunctions();
	
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
		SeleniumFunctions.isElementPresent(Elements);
		common_functions.clickOnElement(Elements);
		Assert.assertTrue("Elements tab didn't open", (getDriver().getCurrentUrl()).equalsIgnoreCase("https://demoqa.com/elements"));
		
	}

}
