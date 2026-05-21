package day_24;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollPage {

    public static void main(String[] args) throws Exception {

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://demoqa.com");

        JavascriptExecutor js =
        (JavascriptExecutor) driver;

        js.executeScript("window.scrollBy(0,1500)");

        Thread.sleep(3000);

        js.executeScript("window.scrollBy(0,-1000)");

        Thread.sleep(3000);

        driver.quit();
    }
}