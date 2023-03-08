package TestRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test/resources/Features"},
        glue = {"StepsDefinition"},
        dryRun = true,
        monochrome = true,
        plugin = { "pretty", "html:target/Destination/cucumber-reports" }
        )
public class RunnerTest {

}
