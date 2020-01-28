package stepDefinitions;

import PageObjectModel.ApplicationPage;
import PageObjectModel.PageExam;
import Utilities.Driver;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class examStepDefinition {

    private WebDriver driver;

    ApplicationPage ap = new ApplicationPage();
    PageExam pe = new PageExam();

    @Given("^navigate to website$")
    public void navigate_to_website() throws Throwable {
        ap.signIn();
        ap.clickbuttonGotIt();
    }

    @And("^Click on DropdownExam and Setup then Entrance Exams$")
    public void click_on_EntranceExams() throws Throwable {
        ap.SetupParametersClick("sad");

    }

    @And("^Click on add button$")
    public void click_on_add_button() throws Throwable {
        ap.clickbuttonAddButton();
    }

    @And("^Fill the \"(.*?)\" ,\"(.*?)\" , \"(.*?)\"$")
    public void fill_the(String name, String RegStart, String RegEnd) throws Throwable {
        name="exam1";
        RegStart="01/01/2020";
        RegEnd="08/05/2020";

        pe.typeInInputName(name);
        pe.typeIninputRegEnd(RegEnd);
        pe.typeInInputRegStart(RegStart);
    }

    @And("^Click on Academic Period and Choose the period$")
    public void click_on_Academic_Period_and_Choose_the_period() throws Throwable {

        pe.ClickOnDropdownAcademicYear();
        pe.ClickOptionFirstAcademicYear();

    }

    @And("^Click on grade level and click on any option$")
    public void Click_on_grade_level_and_click_on_any_option() throws Throwable {
        pe.ClickOnDropdownGreadYear();
        pe.ClickOptionFirstAcademicYear();
}


    @And("^Click on save button$")
    public void click_on_save_button() throws Throwable {
        ap.ClickOnbuttonSaveForm();
    }

    @Then("^Verify Exam \"(.*?)\" is created$")
    public void verify_Exam_is_created(String name) throws Throwable {
        name="exam1";
        pe.isNameCreated(name);
    }

    @And("^Delete the exam \"(.*?)\"$")
    public void delete_the_exam(String name) throws Throwable {
        name="exam1";
        pe.deleteExam(name);
    }

    @Then("^Verify Exam \"(.*?)\" is not displayed$")
    public void verify_Exam_is_not_displayed(String name) throws Throwable {
        name="exam1";
        pe.verifyExamDeleted(name);
    }
}
