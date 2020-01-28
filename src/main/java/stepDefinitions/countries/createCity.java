package stepDefinitions.countries;

import PageObjectModel.ApplicationPage;
import PageObjectModel.pageSetupParamters.pageCity;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class createCity {

    ApplicationPage ap = new ApplicationPage();
    pageCity pc = new pageCity();

    @And("^Create an city as name is \"(.*?)\" , click on country dropdown and click on country \"(.*?)\"$")
    public void create_an_city_as_name_is_click_on_country_dropdown_and_click_on_country(String name, String country) throws Throwable {


        pc.sendKeysFunctioninputName(name);
        pc.clickDropdownCountires(country);
    }

    @And("^Remove the \"(.*?)\" from the cities table$")
    public void remove_the_from_the_cities_table(String arg1) throws Throwable {

    }

    @Then("^Verify \"(.*?)\" is removed$")
    public void verify_is_removed(String arg1) throws Throwable {

    }


}
