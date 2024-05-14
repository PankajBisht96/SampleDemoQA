package demoQA.Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = { "src\\test\\resources\\demoQA.features\\ElementsTab.feature" }, glue = {
		"demoQA.StepDefinitions" })

public class DemoQARunner {

}
