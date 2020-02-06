package PageObjectModel.pageSetupParamters;

import PageObjectModel.AbstractPage;
import Utilities.readExcel;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class fees extends AbstractPage {


    public fees(){
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath="//mat-dialog-container//ms-text-field[@placeholder='GENERAL.FIELD.NAME']//input")
    private WebElement inputName;

    @FindBy(xpath="//mat-dialog-container//ms-text-field[@placeholder='GENERAL.FIELD.CODE']//input")
    private WebElement inputCODE;

    @FindBy(xpath="//mat-dialog-container//ms-text-field[@placeholder='GENERAL.FIELD.INTEGRATION_CODE']//input")
    private WebElement inputINTEGRATION_CODE;

    @FindBy(xpath="//mat-dialog-container//ms-text-field[@placeholder='GENERAL.FIELD.PRIORITY']//input")
    private WebElement inputPRIORITY;


    public void sendKeysFunctioninputName(  ){

        String value= readExcel.GetData("results" , "name","Sheet1");
        sendKeysFunction(inputName,value);
    }
    public void sendKeysFunctioninputCODE( ){
        String value= readExcel.GetData("results" , "code","Sheet1");
        sendKeysFunction(inputCODE,value);
    }
    public void sendKeysFunctioninputINTEGRATION_CODE( ){
        String value= readExcel.GetData("results" , "Integration Code","Sheet1");
        sendKeysFunction(inputINTEGRATION_CODE,value);
    }
    public void sendKeysFunctioninputPRIORITY( ){
        String value= readExcel.GetData("results" , "Priority","Sheet1");
        sendKeysFunction(inputPRIORITY,value);
    }

}
