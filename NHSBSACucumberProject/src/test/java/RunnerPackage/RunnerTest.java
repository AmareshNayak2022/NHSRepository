package RunnerPackage;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources\\NHSFeatureTests"
,glue= {"StepDefinitions"},
tags = "@EnglandNHSBSACheck",
monochrome = true,
plugin = {"pretty","html:target/cucumber-html-report","json:json-output/cucumber.json", "junit:junit_xml/cucumber.xml"}

		


)

public class RunnerTest {

}
