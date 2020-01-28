package PageObjectModel.pageSetupParamters;

import PageObjectModel.AbstractPage;
import Utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class PageCountries extends AbstractPage {

    private WebDriver driver;

    public PageCountries(){

        driver = Driver.getDriver();
        PageFactory.initElements(driver,this);

    }

    @FindAll({
            @FindBy(xpath = "//tbody//td[2]")
    })
    private List<WebElement> elementsName;

    @FindBy(xpath="//mat-dialog-container//ms-text-field[@placeholder='GENERAL.FIELD.NAME']//input")
    public WebElement inputName;

    @FindBy(xpath="(//mat-dialog-container//ms-text-field[contains(@placeholder,'GENERAL.FIELD')]//input)[2]")
    public WebElement inputCode;

    public void VerifyIsCreated(String value){
        verifyCreated(elementsName , value);
    }
    public void typeInputName(String value){
        sendKeysFunction(inputName,value);
    }
    public void typeInputCode(String value){
        sendKeysFunction(inputCode, value);
    }


}
