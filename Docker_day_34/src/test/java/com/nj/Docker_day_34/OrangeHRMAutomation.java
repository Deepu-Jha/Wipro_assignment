package com.nj.Docker_day_34;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class OrangeHRMAutomation
{
    public static void main(String[] args) throws Exception
    {
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        WebDriverWait wait =
                new WebDriverWait(driver, Duration.ofSeconds(20));

        driver.get("https://opensource-demo.orangehrmlive.com");

        wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.name("username")))
                .sendKeys("Admin");

        driver.findElement(By.name("password"))
                .sendKeys("admin123");

        driver.findElement(By.xpath("//button[@type='submit']"))
                .click();

        Thread.sleep(5000);

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

        System.out.println("Employee Added Successfully");

        Thread.sleep(5000);

        driver.quit();
    }
}