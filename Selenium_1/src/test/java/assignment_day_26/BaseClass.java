package assignment_day_26;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BaseClass {

    public static WebDriver driver;

    public void setup() throws Exception {

        ChromeOptions options = new ChromeOptions();

        options.addArguments("--disable-blink-features=AutomationControlled");

        options.addArguments("--start-maximized");

        options.addArguments("--disable-notifications");

        driver = new ChromeDriver(options);

        driver.manage().timeouts()
        .implicitlyWait(Duration.ofSeconds(20));

        driver.get("https://tutorialsninja.com/demo/");

        Thread.sleep(5000);
    }

    public void closeBrowser() {

        driver.quit();
    }
}