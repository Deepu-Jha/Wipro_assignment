package Selenium_project_with_maven.Selenium_1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Flight_Booking {

    public static void main(String[] args) throws Exception {

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://blazedemo.com/");

        Select fromCity =
                new Select(driver.findElement(By.name("fromPort")));

        fromCity.selectByVisibleText("Boston");

        Select toCity =
                new Select(driver.findElement(By.name("toPort")));

        toCity.selectByVisibleText("London");

        Thread.sleep(2000);

        driver.findElement(By.xpath("//input[@value='Find Flights']"))
              .click();

        Thread.sleep(3000);

        driver.findElement(By.xpath("(//input[@value='Choose This Flight'])[1]"))
              .click();

        Thread.sleep(3000);

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

        System.out.println(driver.getTitle());

        driver.quit();
    }
}