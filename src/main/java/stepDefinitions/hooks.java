package stepDefinitions;

import Utilities.Driver;
import Utilities.ReadProperties;
import Utilities.excelWrite;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class hooks {

    WebDriver driver = Driver.getDriver();

    @Before
    public void beforeClass(){

        driver.get("https://test-basqar.mersys.io/");
        driver.manage().window().maximize();

    }

    @After
    public static void afterClass(Scenario scenario) throws IOException {


            if(scenario.isFailed()) {

                TakesScreenshot scrShot =((TakesScreenshot)Driver.getDriver());

                System.out.println("after started ----------------------------------------------------------");
                //Call getScreenshotAs method to create image file

                File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);

                //Move image file to new destination
                String FeatureFileName = scenario.getId();

                System.out.println("FeatureFileName     " + FeatureFileName);

//	                removing the / from feature file name
                String[] arrFeat=FeatureFileName.split("/");

                int arrFeatLength = arrFeat.length;

                String FeatureName = arrFeat[arrFeatLength-1];

//	                creating the todays date and hour for now
                Date now = new Date();

                System.out.println("now     " + now);

                SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ssZ");

                String dateinFormat = formatter.format(now);

                dateinFormat = dateinFormat.replace(":", "-");

                int semicolun = FeatureName.indexOf(";");

                FeatureName = FeatureName.substring(semicolun);

                FeatureName = FeatureName.replace(";" , "");

                File DestFile=new File("target/screenShots/"+FeatureName+""+dateinFormat+".png");

                //Copy file at destination
                try {
                    FileUtils.copyFile(SrcFile, DestFile);
                } catch (IOException e) {

                    e.printStackTrace();
                }

                excelWrite.excelWriteResult("results" , "Sheet1" , scenario);


            }

//        Driver.closeDriver();

    }
}
