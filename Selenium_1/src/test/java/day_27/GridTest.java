package day_27;

import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeOptions;

import org.openqa.selenium.remote.RemoteWebDriver;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class GridTest {

    WebDriver driver;

    @Test

    @Parameters("browser")

    public void gridTesting(String browser)
    throws Exception {

        URL url =
        new URL("http://localhost:4444");

        ChromeOptions options =
        new ChromeOptions();

        driver =
        new RemoteWebDriver(url, options);

        driver.manage().window().maximize();

        driver.get("https://www.saucedemo.com/");

        driver.findElement(By.id("user-name"))
        .sendKeys("standard_user");

        driver.findElement(By.id("password"))
        .sendKeys("secret_sauce");

        driver.findElement(By.id("login-button"))
        .click();

        System.out.println(browser +
        " Browser Executed Successfully");
        

        Thread.sleep(15000);

        driver.quit();
    }
}