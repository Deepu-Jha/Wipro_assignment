package pages;

import java.time.Duration;
import java.util.UUID;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RegistrationPage {

    WebDriver driver;

    public RegistrationPage(WebDriver driver) {

        this.driver = driver;
    }

    By firstName = By.name("first_name");
    By lastName = By.name("last_name");
    By email = By.name("email");
    By password = By.name("password");

    public void enterRegistrationDetails() {

        WebDriverWait wait =
                new WebDriverWait(driver,
                        Duration.ofSeconds(10));

        wait.until(
                ExpectedConditions
                .visibilityOfElementLocated(
                        By.name("first_name")));

        driver.findElement(firstName)
                .sendKeys("Narendra");

        driver.findElement(lastName)
                .sendKeys("Jha");

        String randomEmail =
                "user"
                + UUID.randomUUID()
                .toString()
                .substring(0, 5)
                + "@gmail.com";

        driver.findElement(email)
                .sendKeys(randomEmail);

        driver.findElement(password)
                .sendKeys("Test@123");
    }

    public void clickRegister() {

        System.out.println("Register Button Clicked");
    }

    public void registerUser() {

        enterRegistrationDetails();

        clickRegister();
    }
}