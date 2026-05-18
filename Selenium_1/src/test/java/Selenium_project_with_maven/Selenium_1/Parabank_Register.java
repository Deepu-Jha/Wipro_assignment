package Selenium_project_with_maven.Selenium_1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Parabank_Register {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://parabank.parasoft.com/parabank/register.htm");

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

        Thread.sleep(20000);

        System.out.println(driver.getTitle());

        driver.quit();
    }
}