package Selenium_project_with_maven.Selenium_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sel_amazon {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.amazon.in");

        driver.manage().window().maximize();

        Thread.sleep(2000);

        driver.findElement(By.id("nav-link-accountList")).click();

        Thread.sleep(2000);

        driver.findElement(By.id("ap_email_login"))
              .sendKeys("7033474266");

        driver.findElement(By.id("continue")).click();

        Thread.sleep(2000);

        driver.findElement(By.id("ap_password"))
              .sendKeys("User@1234");

        driver.findElement(By.id("signInSubmit")).click();

        Thread.sleep(3000);

        driver.findElement(By.id("twotabsearchtextbox"))
              .sendKeys("Laptop Charger");

        driver.findElement(By.id("nav-search-submit-button"))
              .click();

        Thread.sleep(3000);

        driver.findElement(By.partialLinkText("Laptop Charger"))
              .click();

        Thread.sleep(5000);

        for (String windowHandle : driver.getWindowHandles()) {

            driver.switchTo().window(windowHandle);
        }

        Thread.sleep(3000);

        driver.findElement(By.id("add-to-cart-button"))
              .click();

        Thread.sleep(5000);

        driver.get("https://www.amazon.in");

        Thread.sleep(2000);

        driver.findElement(By.id("twotabsearchtextbox"))
              .sendKeys("Phone Charger");

        driver.findElement(By.id("nav-search-submit-button"))
              .click();

        Thread.sleep(3000);

        driver.findElement(By.partialLinkText("Phone Charger"))
              .click();

        Thread.sleep(5000);

        for (String windowHandle : driver.getWindowHandles()) {

            driver.switchTo().window(windowHandle);
        }

        Thread.sleep(3000);

        driver.findElement(By.id("add-to-cart-button"))
              .click();

        Thread.sleep(5000);

        System.out.println(driver.getTitle());

        driver.quit();
    }
}