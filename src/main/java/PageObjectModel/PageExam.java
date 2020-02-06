package PageObjectModel;

import Utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class PageExam extends AbstractPage{


    public PageExam(){


        PageFactory.initElements(driver,this);

    }

    @FindBy(css = "ms-text-field > input")
    private WebElement inputName;

    @FindBy(css = "mat-select[aria-label='Academic Period']")
    private WebElement dropdownAcademicYear;

    @FindBy(xpath = "//mat-option")
    private WebElement OptionFirstAcademicYear;

    @FindBy(css = "mat-select[aria-label='Grade Level']")
    private WebElement dropdownGreadYear;

    @FindBy(css = "input[placeholder='Reg.Start']")
    private WebElement inputRegStart;

    @FindBy(css = "input[placeholder='Reg.End']")
    private WebElement inputRegEnd;

    @FindBy(xpath = "//mat-select[@aria-label='Document Type']//span")
    private WebElement dropdownDocumentType;


    @FindAll({
        @FindBy(xpath = "//tbody//td[2]")
    })
    private List<WebElement> elementsName;

    @FindAll({
            @FindBy(xpath = "//ms-delete-button//button")
    })
    private List<WebElement> elementsDeleteButton;

    @FindBy(xpath = " //span[text()=' Yes ']")
    private WebElement buttonYes;


    public void typeInInputName(String value){
        sendKeysFunction(inputName , value);
    }

    public void ClickOnDropdownAcademicYear(){
        clickFunction(dropdownAcademicYear);
    }

    public void ClickOnDropdownGreadYear(){
        clickFunction(dropdownGreadYear);
    }

    public void typeInInputRegStart(String value){
        sendKeysFunction( inputRegStart , value);
    }

    public void typeIninputRegEnd(String value){
        sendKeysFunction( inputRegEnd , value);
    }



    public void ClickOptionFirstAcademicYear(){
        clickFunction(OptionFirstAcademicYear);
    }

    public void isNameCreated(String value) throws InterruptedException {
        if(elementsName.size()==0){
            sleep(2);
        }
        waitVisibility(elementsName.get(0));
        verifyCreated(elementsName , value);
    }

    public void deleteExam(String value){
        System.out.println(elementsName.size() + "<-----   elementsName.size()");
        deleteFunctionality(elementsName,elementsDeleteButton, value ,buttonYes);
    }

    public void verifyExamDeleted(String value){
        verifyDeleted(elementsDeleteButton , value);
    }

}
