package demoQA.Utils;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import net.serenitybdd.core.pages.PageObject;

public class CommonFunctions extends PageObject{
	
	public void launch_demoQA_App() {
//		String appURL = System.getProperty("URL");
		String appURL = "https://demoqa.com/";
		getDriver().get(appURL);
		
//		System.out.println("URL is :" + appURL);

//		String s = getDriver().getTitle();
//		System.out.println("The title of the page is" + s);

	}
	
	public Boolean waitForElementToAppear(final WebElement e) {
		WebDriverWait wait = new WebDriverWait(getDriver(),Duration.ofSeconds(30));
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
