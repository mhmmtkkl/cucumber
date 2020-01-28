package PageObjectModel.pageSetupParamters;

import PageObjectModel.AbstractPage;
import Utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class pageCity extends AbstractPage {

    private WebDriver driver;

    public pageCity(){
        driver = Driver.getDriver();
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath="//mat-dialog-container//input")
    private WebElement inputName;

    @FindBy(xpath="//mat-select[@aria-label='Country']")
    private WebElement dropdownCountires;

    @FindAll({
            @FindBy(xpath = "//span[@class='mat-option-text']")
    })
    private List<WebElement> optionsCountries;

    public void sendKeysFunctioninputName(String value){
        sendKeysFunction(inputName,value);
    }

    public void clickDropdownCountires(String value){
        clickByTextFromDropdown(dropdownCountires , value , optionsCountries);
    }



}
