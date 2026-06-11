package pages;

import org.openqa.selenium.*;

public class BookingPage {

    WebDriver driver;

    public BookingPage(WebDriver driver) {

        this.driver = driver;
    }

    public void bookHotel() {

        System.out.println(
        "Booking Completed");
    }
}