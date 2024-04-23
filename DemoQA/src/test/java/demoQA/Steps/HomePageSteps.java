package demoQA.Steps;

import java.io.IOException;

import demoQA.PageObjects.HomePage;
import demoQA.utilities.CommonFunctions;
import demoQA.utilities.WebdriverUtilities;

public class HomePageSteps extends WebdriverUtilities{
	HomePage homepage = new HomePage();
	CommonFunctions common_functions = new CommonFunctions();
	
	public void launchApplication() throws IOException, InterruptedException {
		common_functions.launch_demoQA_App();
		homepage.verifyElementsTab();
	}
	
	

}
