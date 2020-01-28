package Runner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;


@CucumberOptions(
            plugin = {"pretty",
                    "html:target/cucumber-report",
                    "json:target/cucumber.json"
            },

            features={"src/test/java/resources"},
            glue={"stepDefinitions"},
            dryRun=false
    )
    public class smokeTestRunner extends AbstractTestNGCucumberTests {

    }


