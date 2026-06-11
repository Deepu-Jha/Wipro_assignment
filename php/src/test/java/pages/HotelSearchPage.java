package pages;

import org.openqa.selenium.WebDriver;

public class HotelSearchPage {

    WebDriver driver;

    public HotelSearchPage(WebDriver driver) {
        this.driver = driver;
    }

    public void searchHotel() {

        System.out.println("Hotel Search Executed");

    }
}