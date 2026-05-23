package day_25;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class EcommerceExplicitWait {

    public static void main(String[] args) throws InterruptedException {

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");

        WebDriver driver = new ChromeDriver(options);

        driver.manage().window().maximize();

        driver.get("https://www.saucedemo.com/");

        driver.findElement(By.id("user-name"))
              .sendKeys("standard_user");

        driver.findElement(By.id("password"))
              .sendKeys("secret_sauce");

        driver.findElement(By.id("login-button"))
              .click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(120));

        WebElement addToCart = wait.until(
                ExpectedConditions.elementToBeClickable(
                        By.id("add-to-cart-sauce-labs-backpack")));

        addToCart.click();

        System.out.println("Add to Cart button became clickable");

        WebElement cartButton = wait.until(
                ExpectedConditions.elementToBeClickable(
                        By.className("shopping_cart_link")));

        cartButton.click();

        WebElement checkoutButton = wait.until(
                ExpectedConditions.elementToBeClickable(
                        By.id("checkout")));

        checkoutButton.click();

        System.out.println("Checkout button became clickable");

        driver.findElement(By.id("first-name"))
              .sendKeys("Narendra");

        driver.findElement(By.id("last-name"))
              .sendKeys("Kumar");

        driver.findElement(By.id("postal-code"))
              .sendKeys("854105");

        driver.findElement(By.id("continue"))
              .click();

        WebElement finishButton = wait.until(
                ExpectedConditions.elementToBeClickable(
                        By.id("finish")));

        finishButton.click();

        System.out.println("Checkout completed successfully");

        Thread.sleep(5000);

        driver.quit();
    }
}