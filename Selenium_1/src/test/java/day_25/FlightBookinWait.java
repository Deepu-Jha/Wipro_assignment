package day_25;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.FluentWait;

public class FlightBookinWait {

    public static void main(String[] args) {

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");

        WebDriver driver = new ChromeDriver(options);

        driver.manage().window().maximize();

        driver.get("https://blazedemo.com/");

        driver.findElement(By.name("fromPort"))
              .sendKeys("Boston");

        driver.findElement(By.name("toPort"))
              .sendKeys("London");

        driver.findElement(By.cssSelector("input[type='submit']")).click();

        FluentWait<WebDriver> wait = new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(60))
                .pollingEvery(Duration.ofSeconds(5))
                .ignoring(Exception.class);

        WebElement flightTable = wait.until(driver1 ->
                driver1.findElement(By.className("table")));

        if (flightTable.isDisplayed()) {

            System.out.println("Flight search results displayed successfully");
        }

        WebElement chooseFlight = wait.until(driver1 ->
                driver1.findElement(By.xpath("(//input[@type='submit'])[1]")));

        chooseFlight.click();

        WebElement name = wait.until(driver1 ->
                driver1.findElement(By.id("inputName")));

        name.sendKeys("Narendra Kumar");

        driver.findElement(By.id("address"))
              .sendKeys("Delhi");

        driver.findElement(By.id("city"))
              .sendKeys("New Delhi");

        driver.findElement(By.id("state"))
              .sendKeys("Delhi");

        driver.findElement(By.id("zipCode"))
              .sendKeys("110001");

        driver.findElement(By.id("cardType"))
              .sendKeys("Visa");

        driver.findElement(By.id("creditCardNumber"))
              .sendKeys("1234567890123456");

        driver.findElement(By.id("creditCardMonth"))
              .clear();

        driver.findElement(By.id("creditCardMonth"))
              .sendKeys("12");

        driver.findElement(By.id("creditCardYear"))
              .clear();

        driver.findElement(By.id("creditCardYear"))
              .sendKeys("2028");

        driver.findElement(By.id("nameOnCard"))
              .sendKeys("Narendra Kumar");

        driver.findElement(By.id("rememberMe"))
              .click();

        WebElement purchaseButton = wait.until(driver1 ->
                driver1.findElement(By.cssSelector("input[type='submit']")));

        purchaseButton.click();

        WebElement successMessage = wait.until(driver1 ->
                driver1.findElement(By.tagName("h1")));

        System.out.println(successMessage.getText());

        driver.quit();
    }
}