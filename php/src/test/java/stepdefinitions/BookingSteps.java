package stepdefinitions;

import io.cucumber.java.en.*;
import pages.BookingPage;
import base.DriverFactory;

public class BookingSteps {

    BookingPage bp;

    @Given("user selects hotel")
    public void selectHotel() {

        bp = new BookingPage(
        DriverFactory.getDriver());
    }

    @When("user books hotel")
    public void booking() {

        bp.bookHotel();
    }

    @Then("booking should complete")
    public void validateBooking() {

        System.out.println(
        "Booking Success");
    }
}