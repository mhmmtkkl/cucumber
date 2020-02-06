package Runner;


import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;


@CucumberOptions(
        monochrome = true,
        // location of  the feature files
        features={"@target/rerun.txt"},
        plugin = {"pretty",
                "html:target/cucumber-report",
                "json:target/cucumber.json",
                "rerun:target/rerun2.txt"
        },
        // location of the step definition
        glue={"stepDefinitions"},
        /*
        dryRun option can either set as true or false. If it is set as true,
                it means that Cucumber will only checks that every Step mentioned in
                 the Feature File have corresponding code written in Step Definition file or not.
         */
        dryRun=false
)
public class reRunner extends AbstractTestNGCucumberTests {

}
