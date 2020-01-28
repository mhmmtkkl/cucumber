package PageObjectModel;

import Utilities.Driver;
import Utilities.ReadProperties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class ApplicationPage extends AbstractPage {

    private WebDriver driver;

    public ApplicationPage(){

        driver = Driver.getDriver();
        PageFactory.initElements(driver,this);

    }
    /*
        All the common actions here

                Click , sendkeys , wait , dropdown

     */

    private String username = ReadProperties.getData("Username");


    private String password = ReadProperties.getData("password");


    @FindBy(xpath="//a[text()='Got it!']")
    private WebElement buttonGotIt;

    @FindBy(xpath="//input[@placeholder='Username']")
    private WebElement inputUsername;

    @FindBy(xpath="//input[@placeholder='Password']")
    private WebElement inputPassword;

    @FindBy(xpath="//button[@aria-label='LOGIN']")
    private WebElement buttonLogin;

//   Entrance Exam ---->

    @FindBy(xpath = " //span[text()='Entrance Exams']")
    private WebElement dropdownEntranceExam;

    @FindBy(xpath = "//span[text()='Entrance Exams']//parent::a//parent::fuse-nav-vertical-collapsable//span[text()='Setup']")
    private WebElement buttonEntranceExamSetup;

    @FindBy(xpath="//a[@target='_self']//span[text()='Entrance Exams']")
    private WebElement buttonEntranceExam;

    @FindBy(xpath="//span[text()='Registration Approve']")
    private WebElement buttonRegistrationApprove;

//    <-----  Entrance Exam ends

//    Setup parameters start

    @FindAll(
            @FindBy(xpath="//span[text()='Countries']/parent::a/parent::fuse-nav-vertical-item/parent::div//span")
    )
    private List<WebElement> listSetupParameters;

    @FindBy(xpath="//span[text()='Setup']")
    private WebElement dropdownSetup;

    @FindBy(xpath="//span[text()='Parameters']")
    private WebElement dropdownParameters;

    @FindBy(xpath="//span[text()='Countries']")
    private WebElement buttoCountries;

    @FindBy(xpath="//span[text()='Cities']")
    private WebElement buttonCities;

//    <-----  Setup parameters ends


    @FindBy(xpath="//ms-add-button//button")
    private WebElement buttonAddButton;

    @FindBy(xpath="//div[contains(text(),'successful')]")
    private WebElement textSuccesfullMessage;

    @FindBy(xpath = "//mat-icon[text()='save']")
    private WebElement buttonSaveForm;

    @FindBy(xpath = "//span[text()='Save']")
    private WebElement buttonSaveFrame;

    public void ClickOnbuttonSaveForm(){
        clickFunction(buttonSaveForm);
    }

    public void ClickOnbuttonSaveFrame() throws InterruptedException {
        clickFunction(buttonSaveFrame);
        Thread.sleep(2000);
    }
    public void signIn(){
        sendKeysFunction(inputUsername,username);
        sendKeysFunction(inputPassword,password);
        clickFunction(buttonLogin);
    }

    public void clickdropdownEntranceExam(){
        clickFunction(dropdownEntranceExam);
    }

    public void clickbuttonEntranceExamSetup(){
        clickFunction(buttonEntranceExamSetup);
    }

    public void clickbuttonEntranceExam(){
        clickFunction(buttonEntranceExam);
        waitVisibility(buttonAddButton);
    }

    public void clickbuttonAddButton(){
        clickFunction(buttonAddButton);
    }

    public void clickbuttonRegistrationApprove(){
        clickFunction(buttonRegistrationApprove);
    }

    public void clickbuttonGotIt(){
        clickFunction(buttonGotIt);
    }



    public void SetupParametersClick(String value){
        clickdropdownSetup();
        clickdropdownParameters();

        for(int i =0;i<listSetupParameters.size() ; i++){

            if(listSetupParameters.get(i).getText().equalsIgnoreCase(value)){
                clickFunction(listSetupParameters.get(i));
            }
        }

    }

    public void clickdropdownSetup(){
        clickFunction(dropdownSetup);
    }

    public void clickdropdownParameters(){
        clickFunction(dropdownParameters);
    }

    public void clickbuttoCountries(){
        clickFunction(buttoCountries);
    }

    public void clickbuttonCities(){
        clickFunction(buttonCities);
    }



}

