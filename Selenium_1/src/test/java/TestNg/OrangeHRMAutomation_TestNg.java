package TestNg;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class OrangeHRMAutomation_TestNg {

    WebDriver driver;

    WebDriverWait wait;

    @BeforeTest
    public void setup() {

        ChromeOptions options = new ChromeOptions();

        options.addArguments("--incognito");

        options.addArguments("--disable-notifications");

        options.addArguments("--disable-popup-blocking");

        options.addArguments("--guest");

        driver = new ChromeDriver(options);

        driver.manage().window().maximize();

        wait = new WebDriverWait(driver, Duration.ofSeconds(20));

        driver.get("https://opensource-demo.orangehrmlive.com");
    }

    @Test(priority = 1)
    public void loginTest() throws Exception {

        wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.name("username")))
                .sendKeys("Admin");

        driver.findElement(By.name("password"))
                .sendKeys("admin123");

        driver.findElement(By.xpath("//button[@type='submit']"))
                .click();

        Thread.sleep(5000);

        System.out.println("Login Successful");
    }

    @Test(priority = 2)
    public void addEmployeeTest() throws Exception {

        wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//span[text()='PIM']")))
                .click();

        Thread.sleep(3000);

        wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//button[contains(.,'Add')]")))
                .click();

        Thread.sleep(3000);

        wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.name("firstName")))
                .sendKeys("Narendra");

        driver.findElement(By.name("middleName"))
                .sendKeys("Kumar");

        driver.findElement(By.name("lastName"))
                .sendKeys("Jha");

        Thread.sleep(2000);

        WebElement upload =
                driver.findElement(By.xpath("//input[@type='file']"));

        upload.sendKeys("C:/Users/naren/Downloads/WhatsApp Image 2026-05-18 at 16.47.03.jpeg");

        Thread.sleep(3000);

        wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//button[@type='submit']")))
                .click();

        Thread.sleep(5000);

        System.out.println("Employee Added Successfully");
    }

    @AfterTest
    public void closeBrowser() {

        driver.quit();

        System.out.println("Browser Closed");
    }
}