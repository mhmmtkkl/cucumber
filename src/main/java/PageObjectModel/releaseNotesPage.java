package PageObjectModel;

import Utilities.readExcel;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.util.List;

public class releaseNotesPage extends AbstractPage {

    public releaseNotesPage(){

        PageFactory.initElements(driver,this);

    }


    @FindBy(xpath = "//h3[text()='SYSTEM']/parent::div//li[1]")
    private WebElement system1;
    @FindBy(xpath = "//h3[text()='SYSTEM']/parent::div//li[2]")
    private WebElement system2;

    @FindBy(xpath = "//h3[text()='STUDENT']/parent::div//li[1]")
    private WebElement student1;
    @FindBy(xpath = "//h3[text()='STUDENT']/parent::div//li[2]")
    private WebElement student2;

    @FindBy(xpath = "//h3[text()='EXAMS']/parent::div//li[1]")
    private WebElement exams1;

    @FindBy(xpath = "//h3[text()='HR']/parent::div//li[1]")
    private WebElement TextHR1;
    @FindBy(xpath = "//h3[text()='HR']/parent::div//li[2]")
    private WebElement TextHR2;
    @FindBy(xpath = "//h3[text()='HR']/parent::div//li[3]")
    private WebElement TextHR3;

    @FindBy(xpath = "//h3[text()='ITEM']/parent::div//li[1]")
    private WebElement TextITEM1;
    @FindBy(xpath = "//h3[text()='HR']/parent::div//li[2]")
    private WebElement TextITEM2;

    @FindBy(xpath = "//h3[text()='BUDGET']/parent::div//li[1]")
    private WebElement TextBUDGET1;
    @FindBy(xpath = "//h3[text()='BUDGET']/parent::div//li[2]")
    private WebElement TextBUDGET2;
    @FindBy(xpath = "//h3[text()='BUDGET']/parent::div//li[3]")
    private WebElement TextBUDGET3;
    @FindBy(xpath = "//h3[text()='BUDGET']/parent::div//li[4]")
    private WebElement TextBUDGET4;
    @FindBy(xpath = "//h3[text()='BUDGET']/parent::div//li[5]")
    private WebElement TextBUDGET5;
    @FindBy(xpath = "//h3[text()='BUDGET']/parent::div//li[6]")
    private WebElement TextBUDGET6;
    @FindBy(xpath = "//h3[text()='BUDGET']/parent::div//li[7]")
    private WebElement TextBUDGET7;

    String System1 = readExcel.GetDataFromRow("releaseNote","SYSTEM","Sheet1",1);
    String System2 = readExcel.GetDataFromRow("releaseNote","SYSTEM","Sheet1",2);
    String Student1 = readExcel.GetDataFromRow("releaseNote","STUDENT","Sheet1",1);
    String Student2 = readExcel.GetDataFromRow("releaseNote","STUDENT","Sheet1",2);
    String Exam1 = readExcel.GetDataFromRow("releaseNote","EXAMS","Sheet1",1);
    String HR1 = readExcel.GetDataFromRow("releaseNote","HR","Sheet1",1);
    String HR2 = readExcel.GetDataFromRow("releaseNote","HR","Sheet1",2);
    String HR3 = readExcel.GetDataFromRow("releaseNote","HR","Sheet1",3);
    String ITEM1 = readExcel.GetDataFromRow("releaseNote","ITEM","Sheet1",1);
    String ITEM2 = readExcel.GetDataFromRow("releaseNote","ITEM","Sheet1",2);
    String BUDGET1 = readExcel.GetDataFromRow("releaseNote","Budget","Sheet1",1);
    String BUDGET2 = readExcel.GetDataFromRow("releaseNote","Budget","Sheet1",2);
    String BUDGET3 = readExcel.GetDataFromRow("releaseNote","Budget","Sheet1",3);
    String BUDGET4 = readExcel.GetDataFromRow("releaseNote","Budget","Sheet1",4);
    String BUDGET5 = readExcel.GetDataFromRow("releaseNote","Budget","Sheet1",5);
    String BUDGET6 = readExcel.GetDataFromRow("releaseNote","Budget","Sheet1",6);
    String BUDGET7 = readExcel.GetDataFromRow("releaseNote","Budget","Sheet1",7);


    public void verifySystem1Equals(){
        System.out.println(system1.getText()+"first sout <----------");
        System.out.println(System1+"second sout <---------");

        Assert.assertEquals(system1.getText(),System1);
    }

    public void verifySystem2Equals(){
        Assert.assertEquals(system2.getText(),System2);
    }

    public void verifystudent1Equals(){
        Assert.assertEquals(student1.getText(),Student1);
    }

    public void verifyexams1Equals(){
        Assert.assertEquals(exams1.getText(),Exam1);
    }

    public void verifyHR1Equals(){
        Assert.assertEquals(TextHR1,HR1);
    }

    public void verifyHR2Equals(){
        Assert.assertEquals(TextHR2,HR2);
    }

    public void verifyHR3Equals(){
        Assert.assertEquals(TextHR3,HR3);
    }

    public void verifyItem1Equals(){
        Assert.assertEquals(TextITEM1,ITEM1);
    }

    public void verifyItem2Equals(){
        Assert.assertEquals(TextITEM2,ITEM2);
    }

    public void verifyBudget1Equals(){
        Assert.assertEquals(TextBUDGET1,BUDGET1);
    }

    public void verifyBudget2Equals(){
        Assert.assertEquals(TextBUDGET2,BUDGET2);
    }

    public void verifyBudget3Equals(){
        Assert.assertEquals(TextBUDGET3,BUDGET3);
    }

    public void verifyBudget4Equals(){
        Assert.assertEquals(TextBUDGET4,BUDGET4);
    }

    public void verifyBudget5Equals(){
        Assert.assertEquals(TextBUDGET5,BUDGET5);
    }

    public void verifyBudget6Equals(){
        Assert.assertEquals(TextBUDGET6,BUDGET6);
    }

    public void verifyBudget7Equals(){
        Assert.assertEquals(TextBUDGET7,BUDGET7);
    }
}
