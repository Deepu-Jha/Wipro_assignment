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

public class Parabank_Login_TestNg {

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

        driver.get("https://parabank.parasoft.com/parabank/index.htm");
    }

    @Test(priority = 1)
    public void loginTest() throws Exception {

        Thread.sleep(5000);

        driver.findElement(By.name("username"))
                .sendKeys("narendra123");

        driver.findElement(By.name("password"))
                .sendKeys("Narendra@123");

        driver.findElement(By.xpath("//input[@value='Log In']"))
                .click();

        Thread.sleep(5000);

        System.out.println("Login Successful");
    }

    @Test(priority = 2)
    public void openNewAccountTest() throws Exception {

        driver.findElement(By.linkText("Open New Account"))
                .click();

        Thread.sleep(5000);

        WebElement accountType = driver.findElement(By.id("type"));

        Select select = new Select(accountType);

        select.selectByVisibleText("CHECKING");

        Thread.sleep(3000);

        driver.findElement(By.xpath("//input[@value='Open New Account']"))
                .click();

        Thread.sleep(5000);

        System.out.println("New Account Opened");
    }

    @Test(priority = 3)
    public void transferFundsTest() throws Exception {

        driver.findElement(By.linkText("Transfer Funds"))
                .click();

        Thread.sleep(3000);

        driver.findElement(By.id("amount"))
                .sendKeys("500");

        driver.findElement(By.xpath("//input[@value='Transfer']"))
                .click();

        Thread.sleep(5000);

        System.out.println("Funds Transfer Successful");
    }

    @AfterTest
    public void closeBrowser() {

        System.out.println(driver.getTitle());

        driver.quit();

        System.out.println("Browser Closed");
    }
}