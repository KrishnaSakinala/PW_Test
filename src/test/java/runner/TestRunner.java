package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions( monochrome = true,
        features = "src/test/resources/features/",
        glue = "stepdefinitions",
        plugin = {"pretty",
        	"junit:target/junitreport.xml",
        	"json:target/jsonreport.json",
        	"html:target/cucumber-reports.html"})
public class TestRunner extends AbstractTestNGCucumberTests {

}