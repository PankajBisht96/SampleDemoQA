package demoQA.utilities;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CommonFunctions extends WebdriverUtilities {

	public void launch_demoQA_App() {
//		String appURL = System.getProperty("URL");
		String appURL = "https://demoqa.com/";
		getDriver().get(appURL);
		
//		System.out.println("URL is :" + appURL);

//		String s = getDriver().getTitle();
//		System.out.println("The title of the page is" + s);

	}
	
	public Boolean waitForElementToAppear(final WebElement e) {
		WebDriverWait wait = new WebDriverWait(getDriver(),30);
		wait.until(ExpectedConditions.elementToBeClickable(e));
		return e.isDisplayed();
		
	}
	 
	public void clickOnElement(final WebElement e) {
		if(waitForElementToAppear(e)) {
			e.click();
			SeleniumFunctions.wait(2);
		}
	}
	
}
