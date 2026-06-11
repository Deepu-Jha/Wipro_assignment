package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.RegistrationPage;
import base.DriverFactory;

public class RegistrationStep {

    RegistrationPage rp;

    @Given("User opens registration page")
    public void user_opens_registration_page() {

        DriverFactory.getDriver()
                .get("https://phptravels.net/signup");

        rp = new RegistrationPage(
                DriverFactory.getDriver());
    }

    @When("User enters registration details")
    public void user_enters_registration_details() {

        rp.enterRegistrationDetails();
    }

    @When("User selects country")
    public void user_selects_country() {

        System.out.println("Country Selected");
    }

    @When("User clicks register button")
    public void user_clicks_register_button() {

        rp.clickRegister();
    }

    @Then("User should register successfully")
    public void user_should_register_successfully() {

        System.out.println("Registration Successful");
    }
}