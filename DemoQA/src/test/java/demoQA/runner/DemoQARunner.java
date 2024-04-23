package demoQA.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src\\test\\resources\\Features\\ElementsTab.feature"},
glue = {"demoQA.StepDefinitions"})
public class DemoQARunner {

}
