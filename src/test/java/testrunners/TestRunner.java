package testrunners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/resources/amazonAppFeature"},
        glue = {"stepDefinitions", "appHooks"},
        plugin = {"pretty"}

)

public class TestRunner {
}
