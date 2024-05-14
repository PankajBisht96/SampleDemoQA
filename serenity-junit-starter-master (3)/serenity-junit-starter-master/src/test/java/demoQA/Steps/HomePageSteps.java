package demoQA.Steps;

import java.io.IOException;

import demoQA.Pages.HomePage;
import demoQA.Utils.CommonFunctions;


public class HomePageSteps {

	HomePage homepage;
	CommonFunctions common_functions;
	
	public void launchApplication() throws IOException, InterruptedException {
		common_functions.launch_demoQA_App();
		homepage.verifyElementsTab();
	}
}
