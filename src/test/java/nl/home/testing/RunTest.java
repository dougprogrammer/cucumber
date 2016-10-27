package nl.home.testing;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/",
        format = {"pretty", "html:target/cucumber", "json:target/cucumber-report.json"})
public class RunTest {
}
