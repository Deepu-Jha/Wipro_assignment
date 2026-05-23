package assignment_day_25;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Multiple_Login_Test {

    @DataProvider(name = "loginData")
    public Object[][] getData() {

        return new Object[][]{
                {"admin", "admin123"},
                {"user", "user123"},
                {"test", "test123"}
        };
    }

    @Test(dataProvider = "loginData")
    public void loginTest(String username, String password) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://practicetestautomation.com/practice-test-login/");

        WebElement user = driver.findElement(By.id("username"));
        user.sendKeys(username);

        WebElement pass = driver.findElement(By.id("password"));
        pass.sendKeys(password);

        driver.findElement(By.id("submit")).click();

        Thread.sleep(3000);

        System.out.println("Login Tested With : " + username);

        driver.quit();
    }
}