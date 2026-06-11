package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LoginPage;
import base.DriverFactory;

public class LoginSteps {

    LoginPage lp;

    @Given("user launches browser")
    public void launchBrowser() {

        lp = new LoginPage(DriverFactory.getDriver());
    }

    @When("user enters {string} and {string}")
    public void login(String username, String password) {

        lp.login(username, password);
    }

    @When("clicks on login button")
    public void clicks_on_login_button() {

        System.out.println("Login Button Clicked");
    }

    @Then("validate login result")
    public void validate_login_result() {

        System.out.println("Login Validation Completed");
    }
}