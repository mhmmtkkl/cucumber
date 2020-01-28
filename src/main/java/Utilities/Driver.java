package Utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Driver {
/*
    This is a singleton pattern if there is no singleton pattern we can not switch between the classes.
 */

    private static WebDriver driver;

    public static WebDriver getDriver(){

        if(driver == null){

            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();

        }

        return driver;
    }

    public static void closeDriver(){
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }
}
