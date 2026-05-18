package Selenium_project_with_maven.Selenium_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Parabank_Login {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://parabank.parasoft.com/parabank/index.htm");

        Thread.sleep(5000);

        driver.findElement(By.name("username"))
              .sendKeys("narendra123");

        driver.findElement(By.name("password"))
              .sendKeys("Narendra@123");

        driver.findElement(By.xpath("//input[@value='Log In']"))
              .click();

        Thread.sleep(5000);

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

        driver.findElement(By.linkText("Transfer Funds"))
              .click();

        Thread.sleep(3000);

        driver.findElement(By.id("amount"))
              .sendKeys("500");

        driver.findElement(By.xpath("//input[@value='Transfer']"))
              .click();

        Thread.sleep(5000);

        System.out.println(driver.getTitle());

        driver.quit();
    }
}