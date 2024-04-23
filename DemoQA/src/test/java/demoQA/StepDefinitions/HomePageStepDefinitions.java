package demoQA.StepDefinitions;

import demoQA.Steps.HomePageSteps;
import io.cucumber.java.en.Given;

public class HomePageStepDefinitions{
	
	HomePageSteps homepageSteps = new HomePageSteps();

	@Given("demoQA URL is launched")
	public void demo_qa_url_is_launched() throws Throwable {
		homepageSteps.launchApplication();
	}

	@Given("User is on home page")
	public void user_is_on_home_page() {
		
	}
}
