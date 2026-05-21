package TestNg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Flight_Booking_TestNG {

    WebDriver driver;

    @BeforeTest
    public void setup() {

        ChromeOptions options = new ChromeOptions();

        options.addArguments("--incognito");

        options.addArguments("--disable-notifications");

        options.addArguments("--disable-popup-blocking");

        options.addArguments("--guest");

        driver = new ChromeDriver(options);

        driver.manage().window().maximize();

        driver.get("https://blazedemo.com/");
    }

    @Test(priority = 1)
    public void searchFlightTest() throws Exception {

        WebElement fromCity =
                driver.findElement(By.name("fromPort"));

        Select from =
                new Select(fromCity);

        from.selectByVisibleText("Boston");

        WebElement toCity =
                driver.findElement(By.name("toPort"));

        Select to =
                new Select(toCity);

        to.selectByVisibleText("London");

        Thread.sleep(2000);

        driver.findElement(By.xpath("//input[@value='Find Flights']"))
                .click();

        Thread.sleep(3000);

        System.out.println("Flight Search Successful");
    }

    @Test(priority = 2)
    public void chooseFlightTest() throws Exception {

        driver.findElement(By.xpath("(//input[@value='Choose This Flight'])[1]"))
                .click();

        Thread.sleep(3000);

        System.out.println("Flight Selected");
    }

    @Test(priority = 3)
    public void bookingTest() throws Exception {

        driver.findElement(By.id("inputName"))
                .sendKeys("Narendra Jha");

        driver.findElement(By.id("address"))
                .sendKeys("BTM Layout");

        driver.findElement(By.id("city"))
                .sendKeys("Bangalore");

        driver.findElement(By.id("state"))
                .sendKeys("Karnataka");

        driver.findElement(By.id("zipCode"))
                .sendKeys("560001");

        driver.findElement(By.id("creditCardNumber"))
                .sendKeys("456736789");

        driver.findElement(By.id("creditCardMonth"))
                .clear();

        driver.findElement(By.id("creditCardMonth"))
                .sendKeys("01");

        driver.findElement(By.id("creditCardYear"))
                .clear();

        driver.findElement(By.id("creditCardYear"))
                .sendKeys("2030");

        driver.findElement(By.id("nameOnCard"))
                .sendKeys("Narendra Kumar");

        Thread.sleep(2000);

        driver.findElement(By.xpath("//input[@value='Purchase Flight']"))
                .click();

        Thread.sleep(5000);

        System.out.println("Flight Ticket Booked Successfully");
    }

    @AfterTest
    public void closeBrowser() {

        System.out.println(driver.getTitle());

        driver.quit();

        System.out.println("Browser Closed");
    }
}
