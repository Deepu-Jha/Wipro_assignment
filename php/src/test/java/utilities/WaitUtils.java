package utilities;

import java.time.Duration;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.*;

public class WaitUtils {

    WebDriver driver;

    public WaitUtils(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement waitForVisible(By locator) {

        WebDriverWait wait =
                new WebDriverWait(driver,
                        Duration.ofSeconds(10));

        return wait.until(
                ExpectedConditions.visibilityOfElementLocated(locator));
    }

    public WebElement waitForClickable(By locator) {

        WebDriverWait wait =
                new WebDriverWait(driver,
                        Duration.ofSeconds(10));

        return wait.until(
                ExpectedConditions.elementToBeClickable(locator));
    }
}