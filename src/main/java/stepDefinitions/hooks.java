package stepDefinitions;

import Utilities.Driver;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.WebDriver;

public class hooks {

    WebDriver driver = Driver.getDriver();

    @Before
    public void beforeClass(){

        driver = Driver.getDriver();

        driver.get("https://test-basqar.mersys.io/");
        driver.manage().window().maximize();

    }
    @After
    public static void afterClass(){
        Driver.closeDriver();
    }
}
