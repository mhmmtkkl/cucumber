package stepDefinitions;

import PageObjectModel.ApplicationPage;
import PageObjectModel.releaseNotesPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;

public class releaseNotesSteps {

    releaseNotesPage rnp = new releaseNotesPage();
    ApplicationPage ap = new ApplicationPage();

    @And("^click on Relase Notes$")
    public void click_on_Relase_Notes() throws Throwable {
        ap.clickbuttonReleaseNotes();
        Thread.sleep(2000);
    }

    @Then("^Verify first System is displayed$")
    public void verify_first_System_is_displayed() throws Throwable {
        rnp.verifySystem1Equals();
    }

    @Then("^Verify second System is displayed$")
    public void verify_second_System_is_displayed() throws Throwable {
        rnp.verifySystem2Equals();
    }

    @Then("^Verify first Student is displayed$")
    public void verify_first_Student_is_displayed() throws Throwable {
        rnp.verifystudent1Equals();
    }

    @Then("^Verify second Student is displayed$")
    public void verify_second_Student_is_displayed() throws Throwable {
        rnp.verifyexams1Equals();
    }


}
