package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions( monochrome = true,
        features = "src/test/resources/features/",
        glue = {"stepdefinitions"},
        plugin = {"pretty","junit:target/junitreport.xml","json:target/jsonreport.json","html:target/cucumber-reports.html"}
        
)
public class TestRunner {

    private TestRunner() {

    }
	 
}