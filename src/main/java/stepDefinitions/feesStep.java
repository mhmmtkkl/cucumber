package stepDefinitions;

import PageObjectModel.pageSetupParamters.fees;
import cucumber.api.java.en.Given;

public class feesStep {

    fees fe = new fees();

    @Given("^Type the name$")
    public void type_the_name() throws Throwable {
        fe.sendKeysFunctioninputName();
    }

    @Given("^Type the Code$")
    public void type_the_Code() throws Throwable {
        fe.sendKeysFunctioninputCODE();
    }

    @Given("^Type the Integration Code$")
    public void type_the_Integration_Code() throws Throwable {
        fe.sendKeysFunctioninputINTEGRATION_CODE();
    }

    @Given("^Type the Priority$")
    public void type_the_Priority() throws Throwable {
        fe.sendKeysFunctioninputPRIORITY();
    }


}
