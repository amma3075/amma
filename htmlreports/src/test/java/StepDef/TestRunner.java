package StepDef;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(
		  features = {"src/test/resources/features"},
	        glue = {"stepdefs"},
	        plugin = {"json:target/cucumber.json"},
monochrome=true,strict = true,dryRun = true
)
public class TestRunner {
}