package cucumber.Options;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/java/features", //if you only want to run only one feature file (providing folder lvl will run entire files under that folder)
				 plugin = "json:target/jsonReports/cucumber-report.json", //told testRunning to create a json report. result will store here
				 glue = {"stepDefinitions"}) 
//,tags= "@DeletePlace" use tag if you only want to run one or more test cases
public class TestRunner {
	
}
