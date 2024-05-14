package demoQA.Utils;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import net.serenitybdd.core.pages.PageObject;

public class SeleniumFunctions extends PageObject{
	
	public String getTitleOfPage() {
		return getDriver().getTitle();

	}

	public boolean isElementPresent(WebElement element) {
		boolean isPresent = false;
		if (waitForElementToBePresent(element)) {
			isPresent = true;
		} else {
			System.out.println(element + "is not present");
		}
		return isPresent;

	}

	public boolean waitForElementToBePresent(final WebElement element) {

		WebDriverWait wait = new WebDriverWait(getDriver(),Duration.ofSeconds(5));
		wait.until(ExpectedConditions.visibilityOf(element));
		
		return element.isDisplayed();

//		@SuppressWarnings("deprecation")
//		Wait<WebElement> wait = new FluentWait<WebElement>(element).withTimeout(10, TimeUnit.SECONDS);
//		return element.isDisplayed();
	}
	
	public static void wait(final int sec)
	{
		try {
			Thread.sleep(sec);
		}
		catch (Exception e) {
			System.out.println("Exception in wait");
		}
	}

}
