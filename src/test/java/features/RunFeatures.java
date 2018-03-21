package features;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/features/",
        glue = "CucumberSteps",
        format = {"pretty", "html:target/cucumber", "json:target/cucumber.json"},
        tags = {"~@wip", "~@fivedayforcast", "~@hourlyforcast"})

public class RunFeatures {
}
