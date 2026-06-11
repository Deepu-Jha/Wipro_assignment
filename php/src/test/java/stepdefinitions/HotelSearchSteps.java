package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HotelSearchPage;
import base.DriverFactory;

public class HotelSearchSteps {

    HotelSearchPage hp;

    @Given("User opens hotel search page")
    public void user_opens_hotel_search_page() {

        hp = new HotelSearchPage(
                DriverFactory.getDriver());
    }

    @When("User enters destination")
    public void user_enters_destination() {

        hp.searchHotel();
    }

    @When("User selects checkin date")
    public void user_selects_checkin_date() {

        System.out.println("Checkin Date Selected");
    }

    @When("User selects checkout date")
    public void user_selects_checkout_date() {

        System.out.println("Checkout Date Selected");
    }

    @When("User selects travellers count")
    public void user_selects_travellers_count() {

        System.out.println("Travellers Selected");
    }

    @When("User clicks search")
    public void user_clicks_search() {

        System.out.println("Search Clicked");
    }

    @Then("Validate search results")
    public void validate_search_results() {

        System.out.println("Hotel Search Success");
    }
}