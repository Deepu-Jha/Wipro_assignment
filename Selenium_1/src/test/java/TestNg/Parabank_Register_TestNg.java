package TestNg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Parabank_Register_TestNg {

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

        driver.get("https://parabank.parasoft.com/parabank/register.htm");
    }

    @Test
    public void registerTest() throws Exception {

        Thread.sleep(2000);

        driver.findElement(By.id("customer.firstName"))
                .sendKeys("Narendra");

        driver.findElement(By.id("customer.lastName"))
                .sendKeys("Jha");

        driver.findElement(By.id("customer.address.street"))
                .sendKeys("Katihar");

        driver.findElement(By.id("customer.address.city"))
                .sendKeys("Katihar");

        driver.findElement(By.id("customer.address.state"))
                .sendKeys("Bihar");

        driver.findElement(By.id("customer.address.zipCode"))
                .sendKeys("854105");

        driver.findElement(By.id("customer.phoneNumber"))
                .sendKeys("9875310068");

        driver.findElement(By.id("customer.ssn"))
                .sendKeys("123456789");

        driver.findElement(By.id("customer.username"))
                .sendKeys("narendra123");

        driver.findElement(By.id("customer.password"))
                .sendKeys("Narendra@123");

        driver.findElement(By.id("repeatedPassword"))
                .sendKeys("Narendra@123");

        Thread.sleep(2000);

        driver.findElement(By.xpath("//input[@value='Register']"))
                .click();

        Thread.sleep(5000);

        System.out.println(driver.getTitle());
    }

    @AfterTest
    public void closeBrowser() {

        driver.quit();

        System.out.println("Browser Closed");
    }
}